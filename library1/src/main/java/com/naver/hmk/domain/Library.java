package com.naver.hmk.domain;

public class Library {
	private int library_no;
	private String library_name;
	private Local local;
	public int getLibrary_no() {
		return library_no;
	}
	public void setLibrary_no(int library_no) {
		this.library_no = library_no;
	}
	public String getLibrary_name() {
		return library_name;
	}
	public void setLibrary_name(String library_name) {
		this.library_name = library_name;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	@Override
	public String toString() {
		return "Library [library_no=" + library_no + ", library_name=" + library_name + ", local=" + local + "]";
	}
}
