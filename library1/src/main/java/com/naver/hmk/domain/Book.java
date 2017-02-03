package com.naver.hmk.domain;

public class Book {
	private int bookNo;
	private int libraryNo;
	private int categoryNo;
	private String categoryName;
	private String bookName;
	private String bookWriter;
	private String bookPublisher;
	private String bookState;
	private int bookTotalrental;
	private String bookRentalstate;
	private String bookStartday;
	private String bookDate;
	public String getBookDate() {
		return bookDate;
	}
	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public int getLibraryNo() {
		return libraryNo;
	}
	public void setLibraryNo(int libraryNo) {
		this.libraryNo = libraryNo;
	}
	public int getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookWriter() {
		return bookWriter;
	}
	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public String getBookState() {
		return bookState;
	}
	public void setBookState(String bookState) {
		this.bookState = bookState;
	}
	public int getBookTotalrental() {
		return bookTotalrental;
	}
	public void setBookTotalrental(int bookTotalrental) {
		this.bookTotalrental = bookTotalrental;
	}
	public String getBookRentalstate() {
		return bookRentalstate;
	}
	public void setBookRentalstate(String bookRentalstate) {
		this.bookRentalstate = bookRentalstate;
	}
	public String getBookStartday() {
		return bookStartday;
	}
	public void setBookStartday(String bookStartday) {
		this.bookStartday = bookStartday;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", libraryNo=" + libraryNo + ", categoryNo=" + categoryNo + ", categoryName="
				+ categoryName + ", bookName=" + bookName + ", bookWriter=" + bookWriter + ", bookPublisher="
				+ bookPublisher + ", bookState=" + bookState + ", bookTotalrental=" + bookTotalrental
				+ ", bookRentalstate=" + bookRentalstate + ", bookStartday=" + bookStartday + ", bookDate=" + bookDate
				+ "]";
	}

	
	
}
