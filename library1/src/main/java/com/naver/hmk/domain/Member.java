package com.naver.hmk.domain;

public class Member {
	private int member_no;
	private Library library;
	private String member_name;
	private String member_level;
	private String member_address;
	private String member_phone;
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_level() {
		return member_level;
	}
	public void setMember_level(String member_level) {
		this.member_level = member_level;
	}
	public String getMember_address() {
		return member_address;
	}
	public void setMember_address(String member_address) {
		this.member_address = member_address;
	}
	public String getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}
	@Override
	public String toString() {
		return "Member [member_no=" + member_no + ", library=" + library + ", member_name=" + member_name
				+ ", member_level=" + member_level + ", member_address=" + member_address + ", member_phone="
				+ member_phone + "]";
	}
}
