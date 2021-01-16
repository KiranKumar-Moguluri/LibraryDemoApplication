<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create a New Book</title>
</head>
<body>
	<form action="Add_Book.jsp" method="post">
	   <p>BookName:</p>
	   <input type="text" name="BookName"/><br/>
	   <p>BookId:</p>
	   <input type="text" name="BookId"/><br/>
	   <p>BookAuthor:</p>
	   <input type="text" name="BookAuthor"/>	
	    <br/><br/><br/> 
	<input type="submit">
	</form>
	

</body>
</html>