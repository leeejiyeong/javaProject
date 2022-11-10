package com.yedam.java.ch0601;

public class Student {
	//필드
	
	private String stuName;
	private String schName;
	private String stuNum;
	private String grade;

	private int kor;
	private int eng;
	private int math;
	
	//생성자
	public String getStuName() {
		return stuName;
	}
	
	public String getSchName() {
		return schName;
	}
	
	public String getStuNum() {
		return stuNum;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	
	//메소드
	//getInfo() -> 학생의 내용을 출력할 수 있는 기능 
	public void getInfo() {
		System.out.println("내가 다니는 학교 : " + schName);
	}
	
}
