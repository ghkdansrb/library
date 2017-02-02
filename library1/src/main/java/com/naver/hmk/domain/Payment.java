package com.naver.hmk.domain;

public class Payment {
	private int paymentNo;
	private int memberNo;
	private int rentalNo;
	private int paymentPrice;
	private String paymentState;
	public int getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(int paymentNo) {
		this.paymentNo = paymentNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public int getRentalNo() {
		return rentalNo;
	}
	public void setRentalNo(int rentalNo) {
		this.rentalNo = rentalNo;
	}
	public int getPaymentPrice() {
		return paymentPrice;
	}
	public void setPaymentPrice(int paymentPrice) {
		this.paymentPrice = paymentPrice;
	}
	public String getPaymentState() {
		return paymentState;
	}
	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}
	@Override
	public String toString() {
		return "Payment [paymentNo=" + paymentNo + ", memberNo=" + memberNo + ", rentalNo=" + rentalNo
				+ ", paymentPrice=" + paymentPrice + ", paymentState=" + paymentState + "]";
	}


}
