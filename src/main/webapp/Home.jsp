<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library Management System</title>
<link rel="stylesheet" href="homecss.css">
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

    <section class="hero">
        <div class="hero-content">
            <h2>Welcome to the Library</h2>
            <p>Manage Books and Students efficiently with our Library Management System.</p>
        </div>
    </section>

    <section class="features">

        <div class="feature">
	        <div class="manage">
	            <a href="Manage_Book.jsp" class=""><h3>Manage Books</h3></a>
	            <p>Easily add, update, and manage books in the library.</p>
	        </div>
        </div>
        <div class="feature">
            <a href="student.jsp" class=""><h3>Manage Students</h3></a>
            <p>Easily add, update, and manage student records.</p>
        </div>
        <div class="feature">
            <a href="#"><h3>View History</h3></a>
            <p>Check borrowing history and overdue books.</p>
        </div>
      
        
    </section>
    <section class="features">

        <div class="feature">
	        <div class="manage">
	            <a href="#" class=""><h3>Issue Book</h3></a>
	            <p>Easily allocate book to students.</p>
	        </div>
        </div>
        <div class="feature">
            <a href="#"><h3>Return Book</h3></a>
            <p>Return book which is allocated to student </p>
        </div>
      
        
    </section>

    <footer>
        <p>&copy; 2024 Library Management System. All rights reserved.</p>
    </footer>

</body>
</html>