<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="book.model.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library Management System</title>
<link rel="stylesheet" href="ManageBook.css">
</head>
<body>
	<header>
        <div class="logo">
            <h1>Library Management System</h1>
        </div>
        <nav>
            <ul>
                <li><a href="./Home.jsp">Home</a></li>
                <li><a href="#">Books</a></li>
                <li><a href="student.jsp">Students</a></li>
                <li><a href="contact.jsp">Contact</a></li>
            </ul>
        </nav>
    </header>

    <div class="container">
        <h1>Manage Books</h1>
        <div class="button-group">
            <button id="addBookBtn" class="btn">Add Book</button>
            <button id="deleteBookBtn" class="btn">Delete Book</button>
            <button id="updateBookBtn" class="btn">Update Book</button>
            <button id="showBooksBtn" class="btn">Show Books</button>
        </div>
        <div id="message">
        <%
				String message=(String)request.getAttribute("message");
				if(message!=null){%>
					<p><% out.print(message);%></p>
				<%}
			%>
        </div>
        

        <!-- Add Book Section -->
        <div id="addBookSection" class="section" style="display: none;">
            <h2>Add Book</h2>
            <form action="AddBook" method="post">
                <input type="number" placeholder="Enter Book ID" name="bookid" required>
                <input type="text" placeholder="Enter Book Name" name="bookname" required>
                <input type="text" placeholder="Enter Author Name" name="author" required>
                <input type="number" placeholder="Enter how many books" name="count" required>
                <input type="submit" value="Add Book" class="btn">
            </form>
            
        </div>

        <!-- Delete Book Section -->
        <div id="deleteBookSection" class="section" style="display: none;">
            <h2>Delete Book</h2>
            <form action="DeleteBook" method="post">
                <input type="number" placeholder="Enter Book ID" name="bookid" required>
                <input type="submit" value="Delete Book" class="btn">
            </form>
        </div>

        <!-- Update Book Section -->
        <div id="updateBookSection" class="section" style="display: none;">
            <h2>Update Book</h2>
            <form action="UpdateBook" method="post">
                <input type="text" placeholder="Book Id" name="bookid" required>
                <input type="text" placeholder="New Title" name="bookname">
                <input type="text" placeholder="New Author" name="author">
                <input type="number" placeholder="Enter Number of book" name="count">
                <input type="submit" value="Update Book" class="btn">
            </form>
        </div>

        <!-- Show Books Section -->
        <div id="showBooksSection" class="section" style="display: block;">
            <h2>List of Books</h2>
            <table>
                <thead>
                    <tr>
                        <th>Book Id</th>
                        <th>Book Name</th>
                        <th>Author</th>
                        <th>Book available</th>
                    </tr>
                </thead>
                <tbody>
                    <%List<Book> booklist=(List<Book>)request.getAttribute("list");
                    	if(booklist != null){
                    		for (Book book : booklist){
                    		%>
                    			<tr>
                    				<td><%out.println(book.getBook_id()); %></td>
                    				<td><%out.println(book.getBook_name()); %></td>
                    				<td><%out.println(book.getAuthor()); %></td>
                    				<td><%out.println(book.getCount()); %></td>
                    			</tr>
                    			
                    			
                    		<% }
                    	}else{%>
                    	
                    	<tr>
                    		<td colspan="4" style="text-align: center;">No result found</td>
                    	</tr>
                    		
                    	<%}
                    
                    %>
                </tbody>
            </table>
        </div>
    </div>

    <script>
        
        const addBookBtn = document.getElementById('addBookBtn');
        const deleteBookBtn = document.getElementById('deleteBookBtn');
        const updateBookBtn = document.getElementById('updateBookBtn');
        const showBooksBtn = document.getElementById('showBooksBtn');

        const addBookSection = document.getElementById('addBookSection');
        const deleteBookSection = document.getElementById('deleteBookSection');
        const updateBookSection = document.getElementById('updateBookSection');
        const showBooksSection = document.getElementById('showBooksSection');
        const hideMessage = document.getElementById('message');

        function hideAllSections() {
            addBookSection.style.display = 'none';
            deleteBookSection.style.display = 'none';
            updateBookSection.style.display = 'none';
            showBooksSection.style.display = 'none';
            hideMessage.style.display='none';
        }

        addBookBtn.addEventListener('click', function() {
            hideAllSections();
            addBookSection.style.display = 'block';   
        });

        deleteBookBtn.addEventListener('click', function() {
            hideAllSections();
            deleteBookSection.style.display = 'block';
        });

        updateBookBtn.addEventListener('click', function() {
            hideAllSections();
            updateBookSection.style.display = 'block';
        });

        showBooksBtn.addEventListener('click', function() {
            hideAllSections();
            window.location.href = 'ShowBook';
            showBooksSection.style.display = 'block';
        });

    </script>
</body>
</html>