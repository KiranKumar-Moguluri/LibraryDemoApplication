package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bean.book;
import com.connection.DBConnection;

public class BookReserve {

	public static ArrayList<book> viewAllBooks() throws SQLException {
		DBConnection db= new DBConnection();
		Connection conn=db.getConnection();
		Statement stmt= conn.createStatement();
		
		String query="SELECT * FROM VIEWBOOK;";
		
		ResultSet rs = stmt.executeQuery(query);
		
		ArrayList<book> books = new ArrayList<book>();
		
		while(rs.next())
		{
			String bookName=rs.getString("BookName");
			int bookId=rs.getInt("BookId");
			String bookAuthor=rs.getString("BookAuthor");
			books.add(new book(bookId, bookName, bookAuthor));
		}
		
		
		conn.close();
		return books;
	}

	public static boolean hold(book b) throws SQLException {
		DBConnection db= new DBConnection();
		Connection conn=db.getConnection();
		
		String query="INSERT INTO RESERVE VALUES(?,?,?)";
		PreparedStatement ps= conn.prepareStatement(query);
		
		ps.setString(1,b.getBookName());
		ps.setString(2,b.getStudentName());
		ps.setString(3,b.getStudentRoll());
		
		int records=ps.executeUpdate();
		if(records>0)
		{
			conn.close();
			return true;
		}
		conn.close();
		return false;
	}
	
}
