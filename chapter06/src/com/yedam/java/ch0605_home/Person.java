package com.yedam.java.ch0605_home;

public class Person {
	//필드
	final String nation = "korea";	//final -> 이 클래스를 활용해서 만들어진 객체(인스턴스)들은 무조건 nation이 korea로 고정
	final String ssn;	//ssn = 주민번호.  한번 부여받은 주민번호를 계속 사용할수 있게끔 고정
	String name;
	
	//생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
}
