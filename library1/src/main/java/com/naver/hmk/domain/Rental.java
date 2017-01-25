package com.naver.hmk.domain;

public class Rental {
	private int rental_no;
	private Member member;
	private Book book;
	private int rental_startday;
	private int rental_endday;
	public int getRental_no() {
		return rental_no;
	}
	public void setRental_no(int rental_no) {
		this.rental_no = rental_no;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getRental_startday() {
		return rental_startday;
	}
	public void setRental_startday(int rental_startday) {
		this.rental_startday = rental_startday;
	}
	public int getRental_endday() {
		return rental_endday;
	}
	public void setRental_endday(int rental_endday) {
		this.rental_endday = rental_endday;
	}
	@Override
	public String toString() {
		return "Rental [rental_no=" + rental_no + ", member=" + member + ", book=" + book + ", rental_startday="
				+ rental_startday + ", rental_endday=" + rental_endday + "]";
	}
}
