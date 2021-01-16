package com.service;

import java.sql.SQLException;

import com.DAO.LoginDAO;
import com.bean.Librarian;

public class LibrarianService {

	public static boolean login(Librarian librarian) throws SQLException {
		boolean status=LoginDAO.checkLibrarian(librarian);
		return status;
	}

}
