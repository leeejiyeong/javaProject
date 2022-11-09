package com.yedam.java.ch0601;
	//라이브러리클래스는 main이 없다..?

public class Car {
	//필드 : 속성
	int maxspeed = 100;
	String color = "red";
	
	//생성자 - 클래스와 이름이 같다. 본인의 이름을 가질수 없음.
	public Car() {
		System.out.println("자동차가 출하되었습니다.");
	}
	
	//메소드	: 동작
	public void run() {
		System.out.println("자동차가 동작 중입니다.");
	}
	
}
