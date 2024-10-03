<%@page import="student.model.StudentModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="student.css">
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
    <div class="navBar">
        <!-- These are the buttons for navigation -->
        <button onclick="showContent('addStudent')">Add Student</button>
        <button onclick="showContent('updateStudent')">Update Student</button>
        <button onclick="showContent('deleteStudent')">Delete Student</button>
        <button onclick="showContent('studentList') " id="showstudent">Student List</button>
    </div>

    <div class="container">
        <!-- Add Student -->
        <div id="addStudent" class="content "> 
            <div class="formContainer">
                <h2>Add Student</h2>
                <form action="addStudentController" method="post">
                    <label for="id">Student ID :</label>
                    <input type="number" id="id" name="id"><br>
                    <label for="name">Student Name:</label>
                    <input type="text" id="name" name="name"><br>
                    <label for="branch">Branch Name:</label>
                    <input type="text" id="branch" name="branch"><br>
                    <label for="email">Student Email:</label>
                    <input type="email" id="email" name="email"><br>
                    <input type="submit" value="Add Student">
                </form>
            </div>   
            <br><br><br><br> 
        </div>

        <!-- Update Student -->
        <div id="updateStudent" class="content">
            <div class="formContainer">
                <h2>Update Student</h2>
                <form action="updateStudent" method="post">
                    <label for="id">Student ID :</label>
                    <input type="number" id="id" name="id"><br>
                    <label  for="name">New Name:</label>
                    <input id="namee" type="text" id="name" name="name"><br>
                    <label for="branch">New Branch :</label>
                    <input  type="text" id="branch" name="branch"><br>
                    <label for="email">New Email:</label>
                    <input id="emaill" type="email" id="email" name="email"><br>
                    <input type="submit" value="Update Student">
                </form>
            </div>  
            <br><br><br><br> 
        </div>

        <!-- Delete Student -->
        <div id="deleteStudent" class="content">
            <div class="formContainer">
                <h2>Delete Student</h2>
                <form action="deletStudent" method="post">
                    <label for="id">Student ID:</label>
                    <input type="text" id="id" name="id"><br>
                    <input type="submit" value="Delete Student">
                </form>
            </div> 
            <br><br><br><br> 
        </div>
        

        <!-- Student List -->
        <div id="studentList" class="content active">
            <h2>Student List</h2>
            <table>
            <caption>Available students</caption>
                        <thead>
                            <tr>
                                <th>Student Id</th>
                                <th>Student Name</th>
                                <th>Student Branch</th>
                                <th>Email</th>
                            </tr>
                        </thead>
                        <tbody>
          <%List <StudentModel> sm= (List<StudentModel>)request.getAttribute("studInfo");
                    			if(sm!=null){
                    				for(StudentModel student :sm){
                    			%>
                    				<tr>
                    					<td><%out.println(student.getId()); %></td>
                    					<td><%out.println(student.getName()); %></td>
                    					<td><%out.println(student.getBranch()); %></td>
                    					<td><%out.println(student.getEmail()); %></td>
                    					
                    				</tr>
                    			<% }
                    				}else{%>
                    				<tr>
                    					<td colspan="4"> data not found</td>
                    				</tr>
                    			<%} %>
                    			</tbody>
                    		</table>
        </div>
        <br><br><br><br> 
    </div>

    <script>
    
    const show = document.getElementById('showstudent');
    show.addEventListener('click', function(){
    	window.location.href='StudFeatchControler';
    });
        function showContent(sectionId) {
            // Hide all content sections
            var contents = document.getElementsByClassName('content');
            for (var i = 0; i < contents.length; i++) {
                contents[i].classList.remove('active');
            }
            // Show the selected section
            document.getElementById(sectionId).classList.add('active'); 
        }
        
        
       
        	
        
        
    </script>
</body>
</html>