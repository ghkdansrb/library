package com.naver.hmk.domain;

public class Payment {
	private int payment_no;
	private Member member;
	private Rental rental;
	private int payment_price;
	private String payment_state;
	public int getPayment_no() {
		return payment_no;
	}
	public void setPayment_no(int payment_no) {
		this.payment_no = payment_no;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Rental getRental() {
		return rental;
	}
	public void setRental(Rental rental) {
		this.rental = rental;
	}
	public int getPayment_price() {
		return payment_price;
	}
	public void setPayment_price(int payment_price) {
		this.payment_price = payment_price;
	}
	public String getPayment_state() {
		return payment_state;
	}
	public void setPayment_state(String payment_state) {
		this.payment_state = payment_state;
	}
	@Override
	public String toString() {
		return "Payment [payment_no=" + payment_no + ", member=" + member + ", rental=" + rental + ", payment_price="
				+ payment_price + ", payment_state=" + payment_state + "]";
	}
}
