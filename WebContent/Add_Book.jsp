<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
  try {
	Connection con=null;
    Class.forName("com.mysql.cj.jdbc.Driver");  
    String url="jdbc:mysql://localhost:3306/kiran";
    con = DriverManager.getConnection(url, "root", "Kiran@485");  
    
   // out.println ("database successfully opened.");

     String bookname=request.getParameter("BookName");
     String bookid=request.getParameter("BookId");
    String bookauthor=request.getParameter("BookAuthor");

    String strQuery="INSERT INTO ViewBook VALUES(\'" + bookname + "\',"+ bookid +",\'"+ bookauthor +"\');";
    Statement st= con.createStatement();
    int count=st.executeUpdate(strQuery);

    //ResultSet rs= st.executeQuery(strquery);
  }
  catch(Exception e)
  {
	  e.printStackTrace();
    System.out.println("Could not connect");
  }
%>
</body>
</html>
