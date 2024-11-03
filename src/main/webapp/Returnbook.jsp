<%@page import="java.util.List"%>
<%@page import="returnbook.model.ReturnBook"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="returnbook.css">
</head>
<body>
	<header>
        <div class="logo">
            <h1>Library Management System</h1>
        </div>
        <nav>
            <ul>
                <li><a href="Home.jsp">Home</a></li>
                <li><a href="Manage_Book.jsp">Books</a></li>
                <li><a href="student.jsp">Students</a></li>
                <li><a href="contact.jsp">Contact</a></li>
            </ul>
        </nav>
    </header>
    
    <div class="container">

        <div class="issued-details">
            <div class="header">  
                <h2>Issued Book Details</h2>
            </div>
            <div class="details">
            <%List<ReturnBook> detail = (List<ReturnBook>)request.getAttribute("detail");
            if(detail != null){
            	for (ReturnBook rb: detail){%>
            		
            		<p><strong>Issue ID :</strong> <%out.println(rb.getIssue_id()); %></p>
                    <p><strong>Book Name :</strong> <%out.println(rb.getBook_name()); %></p>
                    <p><strong>Book ID :</strong> <%out.println(rb.getBook_id()); %></p>
                    <p><strong>Student Name :</strong> <%out.println(rb.getStudent_name()); %></p>
                    <p><strong>Student ID :</strong> <%out.println(rb.getStudent_id()); %></p>
                    <p><strong>Issue Date :</strong> <%out.println(rb.getIssue_date()); %></p>
                    <p><strong>Due Date :</strong> <%out.println(rb.getReturn_date()); %></p>
            		
            	<%}
            } else{ %>
            
            <p>Result not found</p>
            <% }%> 
                
            </div>
        </div>


        <div class="return-book">
        
            <div class="header">
                <h2>Return Book</h2>
            </div>
            <form action="Find_details" method="post">
	            <label for="bookId">Book Id :</label>
	            <input type="text" id="bookId" placeholder="Enter Book Id" name="bookid" required>
	            
	            <label for="studentId">Student Id :</label>
	            <input type="text" id="studentId" placeholder="Enter Student Id" name="studentid" required>
	            
	            <input type="submit" value="Find Details" class="find-btn">
        	</form>
            
            <form action="Returnbook_Controller" method="post">
	            <input type="hidden" name="bookid" id="hiddenBookId" value="<%= request.getParameter("bookid") %>" required>
	            <input type="hidden" name="studentid" id="hiddenStudentId" value="<%= request.getParameter("studentid") %>" required>
	            <input type="submit" value="Return Book" class="return-btn">
        	</form>
        	
        	<%String message=(String)request.getAttribute("alert");
        		if(message!=null){%>
        		<p><% out.println(message); %>
        		<%} %>
        	
        </div>
    </div>


</body>
</html>