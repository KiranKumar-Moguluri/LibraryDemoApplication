package com.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DBConnection {
	//JDBC driver and Database Connection URL
		static final String JDBCDriver="com.mysql.cj.jdbc.Driver";
		static final String URL="jdbc:mysql://localhost:3306/kiran";
		//Database Credentials;
		static final String user="root";
		static final String pass="Kiran@485";
		
		public static Connection getConnection() throws SQLException
		{
		
			Connection con=null;
			try
			{
				//Registering JDBC Driver
				Class.forName(JDBCDriver);
				
				//Opening Connection
				System.out.println("Before Connection Connecting.....");
				con=DriverManager.getConnection(URL,user,pass);
				System.out.println("Connected Successfully!");
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			/* finally
			{
				try
				{
					if(stmt!=null)
					{
						stmt.close(); //closing Statement
					}
				}
				catch(SQLException se)
				{
					//Do nothing
				}
				try
				{
					if(con!=null)
					{
						con.close(); //closing Connection
					}
				}
				catch(SQLException se)
				{
					se.printStackTrace();
				}
			} */
			return con;
		}

}
