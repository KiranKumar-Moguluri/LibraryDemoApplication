package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.book;
import com.service.ViewBook;

/**
 * Servlet implementation class ReserveServlet
 */
@WebServlet("/ReserveServlet")
public class ReserveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReserveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text.html");
		PrintWriter out = response.getWriter();
		
		String studentName=request.getParameter("studentName"); 
		String studentRoll=request.getParameter("studentRoll"); 
		String bookName=request.getParameter("bookName");
	 
		//For the purpose of Testing
		/*
		System.out.println(studentName);
		System.out.println(studentRoll);
		System.out.println(bookName);
		*/
		ViewBook obj= new ViewBook();
		try {
			boolean status=obj.reserve(new book(bookName, studentName, studentRoll));
			if(status)
			{	out.println("Successfully Reserved your Book");
				RequestDispatcher rd= request.getRequestDispatcher("ViewBooks.jsp");
				rd.include(request, response);
			}
			else
			{
				out.println("Sorry! There is some problem in reserving a book for U :(");
				RequestDispatcher rd= request.getRequestDispatcher("ViewBooks.jsp");
				rd.include(request, response);
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
