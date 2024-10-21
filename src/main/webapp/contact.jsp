<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="contact.css">
</head>
<body>
	<header>
        <div class="logo">
            <h1 class="heading">Library Management System</h1>
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
	<div class="body">
        <div class="contact-container">
            <h1>Contact Us</h1>
            <p>If you have any questions, feel free to reach out to us!</p>
            
            <div class="contact-info">
                <div class="contact-item">
                    <h3>Email</h3>
                    <p>librarymanagement@.com</p>
                </div>
                <div class="contact-item">
                    <h3>Phone</h3>
                    <p>+123 456 7890</p>
                </div>
                <div class="contact-item">
                    <h3>Address</h3>
                    <p>123 Library Lane, Booktown, BK 12345</p>
                </div>
            </div>
    
            <form action="#" method="POST" class="contact-form">
                <input type="text" name="name" placeholder="Your Name" required>
                <input type="email" name="email" placeholder="Your Email" required>
                <textarea name="message" rows="5" placeholder="Your Message" required></textarea>
                <button type="submit">Send Message</button>
            </form>
        </div>
    </div>
</body>
</html>