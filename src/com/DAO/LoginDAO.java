package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

import com.bean.Librarian;
import com.connection.DBConnection;

public class LoginDAO {

	public static boolean checkLibrarian(Librarian librarian) throws SQLException {
		DBConnection db= new DBConnection();
		Connection conn= db.getConnection();
		Statement stmt= conn.createStatement();
		
		String query="SELECT * FROM LIBRARIAN";
		ResultSet rs=stmt.executeQuery(query);
		if(rs.next())
		{
			String u=rs.getString("USERNAME");
			String p=rs.getString("PASSWORD");
			if(u.equals(librarian.getUsername()) && p.equals(librarian.getPassword()))
			{
				return true;
			}
		}
		
		return false;
	}

}
