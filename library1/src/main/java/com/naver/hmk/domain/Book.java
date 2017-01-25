package com.naver.hmk.domain;

public class Book {
	private int book_no;
	private Library library;
	private Category category; 
	private String book_name;
	private String book_writer;
	private String book_publisher;
	private String book_state;
	private int book_totalrental;
	private int book_rentalstate;
	private String book_startday;
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_writer() {
		return book_writer;
	}
	public void setBook_writer(String book_writer) {
		this.book_writer = book_writer;
	}
	public String getBook_publisher() {
		return book_publisher;
	}
	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}
	public String getBook_state() {
		return book_state;
	}
	public void setBook_state(String book_state) {
		this.book_state = book_state;
	}
	public int getBook_totalrental() {
		return book_totalrental;
	}
	public void setBook_totalrental(int book_totalrental) {
		this.book_totalrental = book_totalrental;
	}
	public int getBook_rentalstate() {
		return book_rentalstate;
	}
	public void setBook_rentalstate(int book_rentalstate) {
		this.book_rentalstate = book_rentalstate;
	}
	public String getBook_startday() {
		return book_startday;
	}
	public void setBook_startday(String book_startday) {
		this.book_startday = book_startday;
	}
	@Override
	public String toString() {
		return "Book [book_no=" + book_no + ", library=" + library + ", book_name=" + book_name + ", book_writer="
				+ book_writer + ", book_publisher=" + book_publisher + ", book_state=" + book_state
				+ ", book_totalrental=" + book_totalrental + ", book_rentalstate=" + book_rentalstate
				+ ", book_startday=" + book_startday + "]";
	}
	
}
