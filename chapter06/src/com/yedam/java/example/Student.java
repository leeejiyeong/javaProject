package com.yedam.java.example;

public class Student {
	
	//1)각 필드를 저장할 수 있는 getter, setter작성
	//2)모든 정보를 출력할수 있는 메소드 하나 작성
	//3)School 클래스 만들고 main을 작성해서 학생의 정보를 넣는 프로그램을 만들자
	//4)아까 했던 bank처럼 학생 수를 입력받고, 각 필드의 데이터를 받아와서 학생 정보가 담긴 프로그램을 만들자
	//5)모든 학생의 정보를 출력.
	
	//필드
	private String sName;
	private String sNo;
	private int kor;
	private int math;
	private int eng;
	
	//생성자
	
	//메소드
	
	public void getInfo() {
		System.out.println("--입력한 학생 정보--");
		System.out.println("이름 : " + sName);
		System.out.println("번호 : " + sNo);
		System.out.println("국어점수 : "+ kor);
		System.out.println("수학점수 : " + math);
		System.out.println("영어점수 : " + eng);
	}
	
		//getter,setter
	public String getsName() {
		return sName;
	}

	public void setsName(String name) {
		this.sName = name;
	}

	public String getNo() {
		return sNo;
	}

	public void setNo(String no) {
		sNo = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
}
