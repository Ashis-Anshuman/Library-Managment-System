<%@page import="history.model.HistorryModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="history.css">
</head>
<body>
	<header>
        <div class="logo">
            <h1>Library Management System</h1>
        </div>
        <nav>
            <ul>
                <li><a href="./Home.jsp">Home</a></li>
                <li><a href="Manage_Book.jsp">Books</a></li>
                <li><a href="student.jsp">Students</a></li>
                <li><a href="contact.jsp">Contact</a></li>
            </ul>
        </nav>
    </header>
    <div class="container">
        <h1>History</h1>
        
        <table>
            <thead>
                <tr>
                    <th>Issue ID</th>
                    <th>Book Name</th>
                    <th>Book ID</th>
                    <th>Student Name</th>
                    <th>Student ID</th>
                    <th>Issue Date</th>
                    <th>Return Date</th>
                    <th>Return by student</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
            <%List<HistorryModel> list = (List<HistorryModel>)request.getAttribute("list"); 
            if(list != null){
                    		for (HistorryModel hm : list){
                    		%>
                    			<tr>
                    				<td><%out.println(hm.getIssue_id()); %></td>
                    				<td><%out.println(hm.getBook_name()); %></td>
                    				<td><%out.println(hm.getBook_id()); %></td>
                    				<td><%out.println(hm.getStudent_name()); %></td>
                    				<td><%out.println(hm.getStudent_id()); %></td>
                    				<td><%out.println(hm.getIssue_date()); %></td>
                    				<td><%out.println(hm.getReturn_date()); %></td>
                    				<td><%out.println(hm.getStud_return_date()); %></td>
                    				<td><%out.println(hm.getStatus()); %></td>
                    				
                    			</tr>
                    			
                    			
                    		<% }
                    	}else{%>
                    	
                    	<tr>
                    		<td colspan="9" style="text-align: center;"><a href="HistoryController">View Details</a></td>
                    	</tr>
                    		
                    	<%}
                    
                    %>
            </tbody>
        </table>
    </div>

</body>
</html>