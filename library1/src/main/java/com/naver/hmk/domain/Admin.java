package com.naver.hmk.domain;

import java.io.Serializable;

public class Admin implements Serializable{
	private int adminNo;
	private String adminId;
	private String adminPw;
	private String adminName;
	private int libraryNo;
	private String libraryName;
	public int getAdminNo() {
		return adminNo;
	}
	public void setAdminNo(int adminNo) {
		this.adminNo = adminNo;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public int getLibraryNo() {
		return libraryNo;
	}
	public void setLibraryNo(int libraryNo) {
		this.libraryNo = libraryNo;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	@Override
	public String toString() {
		return "Admin [adminNo=" + adminNo + ", adminId=" + adminId + ", adminPw=" + adminPw + ", adminName="
				+ adminName + ", libraryNo=" + libraryNo + ", libraryName=" + libraryName + "]";
	}
	
}
