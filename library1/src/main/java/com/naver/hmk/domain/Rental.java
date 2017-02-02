package com.naver.hmk.domain;

public class Rental {
	private int rentalNo;
	private int memberNo;
	private int bookNo;
	private int rentalStartday;
	private int rentalEndday;
	public int getRentalNo() {
		return rentalNo;
	}
	public void setRentalNo(int rentalNo) {
		this.rentalNo = rentalNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public int getRentalStartday() {
		return rentalStartday;
	}
	public void setRentalStartday(int rentalStartday) {
		this.rentalStartday = rentalStartday;
	}
	public int getRentalEndday() {
		return rentalEndday;
	}
	public void setRentalEndday(int rentalEndday) {
		this.rentalEndday = rentalEndday;
	}
	@Override
	public String toString() {
		return "Rental [rentalNo=" + rentalNo + ", memberNo=" + memberNo + ", bookNo=" + bookNo + ", rentalStartday="
				+ rentalStartday + ", rentalEndday=" + rentalEndday + "]";
	}
	
}
