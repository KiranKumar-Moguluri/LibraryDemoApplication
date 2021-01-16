<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.service.ViewBook,java.util.ArrayList,com.bean.book,java.sql.*" %>
<!DOCTYPE html>
<style>
table, th, td
{
    border:solid black;
    height:30px;
    text-align:center;  
}
</style>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Books</title>
</head>
<body>
<table>
	<thead>
	<tr>
		<th>Book Name</th>
		<th>Book ID</th>
		<th>Book Author</th>
		<th>Reserve/Hold</th>
	</tr>
	</thead>
<% ArrayList<book> books=ViewBook.viewBooks(); %>
<%for(book b:books){ %>
	<tr>
		<td><%=b.getBookName() %></td>
		<td><%=b.getBookId() %></td>
		<td><%=b.getBookAuthor() %></td>
		<td><a href="ReserveBook.jsp?name=<%=b.getBookName()%>">HOLD</a></td>
	</tr>
<% }%>
</table>
</body>
</html>