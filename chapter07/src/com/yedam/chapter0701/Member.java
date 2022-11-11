package com.yedam.chapter0701;

public class Member extends People {
	
	public int stdNo;
	
	public Member(String name, String ssn, int stdNo) {
		super(name, ssn);
		this.stdNo = stdNo;
	}
}
