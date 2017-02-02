package com.naver.hmk.domain;

public class Library {
	private int libraryNo;
	private String libraryName;
	private int localNo;
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
	public int getLocalNo() {
		return localNo;
	}
	public void setLocalNo(int localNo) {
		this.localNo = localNo;
	}
	@Override
	public String toString() {
		return "Library [libraryNo=" + libraryNo + ", libraryName=" + libraryName + ", localNo=" + localNo + "]";
	}
	
}
