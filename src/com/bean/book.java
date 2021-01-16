package com.bean;

public class book {
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private String studentName;
	private String studentRoll;
public book(int bookId, String bookName, String bookAuthor) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookAuthor = bookAuthor;
	
}

//I wanted to create it at the beginning but i need you to understand the difference b/w reserve and view
public book(String bookName, String studentName, String studentRoll)
{
	this.bookName=bookName;
	this.studentName=studentName;
	this.studentRoll=studentRoll;
}

public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentRoll() {
	return studentRoll;
}
public void setStudentRoll(String studentRoll) {
	this.studentRoll = studentRoll;
}



}
