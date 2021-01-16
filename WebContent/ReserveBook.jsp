<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reserve/Hold Book</title>
</head>
<h1>
Fill Student Details
</h1>
<body>
<% String bookName=request.getParameter("name");%>

	<form action="ReserveServlet" method="post">
            
            <table>
            	<tr>
                   <td>Book Name: <%= bookName%><input type="hidden" name="bookName" value="<%= bookName%>" /></td>
                </tr>
                
                <tr>
                   <td>Student's Name: </td>
                   <td><input type="text" name="studentName" required/></td>
                </tr>
                
                <tr>
                    <td>Student's Roll Number: </td>
                    <td><input type="text" name="studentRoll" required/></td>
                </tr>
            </table>
                <input type="submit" value="RESERVE">
        </form>
</body>
</html>