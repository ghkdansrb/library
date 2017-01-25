package com.naver.hmk.domain;

public class Local {
	private int local_no;
	private String local_name;
	public int getLocal_no() {
		return local_no;
	}
	public void setLocal_no(int local_no) {
		this.local_no = local_no;
	}
	public String getLocal_name() {
		return local_name;
	}
	public void setLocal_name(String local_name) {
		this.local_name = local_name;
	}
	@Override
	public String toString() {
		return "Local [local_no=" + local_no + ", local_name=" + local_name + "]";
	}
}
