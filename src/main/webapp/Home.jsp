<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
            <h3>View History</h3>
            <p>Check borrowing history and overdue books.</p>
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
            <h3>Manage Students</h3>
            <p>Easily add, update, and manage student records.</p>
        </div>
      
        
    </section>

    <footer>
        <p>&copy; 2024 Library Management System. All rights reserved.</p>
    </footer>

</body>
</html>