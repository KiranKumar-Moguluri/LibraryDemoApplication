<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Test Page</title>
</head>
<body>
<%if(request.getSession(false)!=null){ 
	out.println(request.getSession(false));%>
Hi Sir, You are Authorized!!! You can <a href="LoginServlet?action=logout">click</a> here to Logout.
<%} else
{
%>
Sorry, You Can't Access this page! <a href="log.html">Click </a>Here to login. 
<%} %>
</body>
</html>