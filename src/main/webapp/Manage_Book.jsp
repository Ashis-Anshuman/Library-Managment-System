<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
                <li><a href="./Manage_Students.jsp">Students</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </header>
    
    <div class="Student_info">
	    <form action="" method=>
			    <label>Book ID: </label>
			    <input type="text" name="id" required="required" class="input"><br>
			    <label>Book Name: </label>
			    <input type="text" name="bookname" required="required" class="input"><br>
			    <label>Book Auther</label>
			    <input type="text" name="auther">
			    <label>Book Count </label>
			    <input type="number" name="count" class="input"><br>
			    <input type="submit" value="Add Book" class="add">
		    
	    </form>
    </div>
</body>
</html>