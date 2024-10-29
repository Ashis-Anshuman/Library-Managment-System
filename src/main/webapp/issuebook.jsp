<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library Management System </title>
<link rel="stylesheet" href ="issuebook.css">

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
                <li><a href="#">Contact</a></li>          
            </ul>
        </nav>
    </header>
    
    <div class="container">
        <h1>Issue Book to Student</h1>
        
        <div id="message">
        <%
				String message=(String)request.getAttribute("message");
				if(message!=null){%>
					<p><% out.print(message);%></p>
				<%}
			%>
        </div>
        
        <form action="IssueBook_Controller" method="post">
            <div class="form-group">
                <label for="studentName">Student Name</label>
                <input type="text" id="studentName" name="studentname" placeholder="Enter student name" required>
            </div>
            <div class="form-group">
                <label for="rollNumber">Student ID</label>
                <input type="text" id="rollNumber" name="studentid" placeholder="Enter student id" required>
            </div>
            <div class="form-group">
                <label for="bookTitle">Book Title</label>
                <input type="text" id="bookTitle" name="bookname" placeholder="Enter book title" required>
            </div>
            <div class="form-group">
                <label for="bookISBN">Book ID</label>
                <input type="text" id="bookISBN" name="bookid" placeholder="Enter book id" required>
            </div>
            <div class="form-group">
                <label for="issueDate">Issue Date</label>
                <input type="date" id="issueDate" name="issueDate" required>
            </div>
            <div class="form-group">
                <label for="returnDate">Return Date</label>
                <input type="date" id="returnDate" name="returnDate" required>
            </div>
            <input type="submit" value="Issue Book" class="btn">
        </form>
    </div>
    
</body>
</html>