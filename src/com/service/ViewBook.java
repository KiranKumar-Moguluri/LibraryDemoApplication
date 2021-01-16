package com.service;

import java.sql.SQLException;
import java.util.ArrayList;
import com.DAO.BookReserve;

import com.bean.book;

public class ViewBook {
	public static ArrayList<book> viewBooks() throws SQLException
	{
		ArrayList<book> books=BookReserve.viewAllBooks();
		return books;
		
	}

	public static boolean reserve(book b) throws SQLException {
		boolean status=BookReserve.hold(b);
		return status;
	}
}
