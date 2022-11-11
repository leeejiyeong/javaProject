package com.yedam.chapter0702;

public class Tire {
	//필드
	public int maxRotation;	//최대 회전수
	public int accRotation; //누적 회전수
	public String location;	//타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accRotation;
		   //누적회전수 < 최대회전수
		if(accRotation < maxRotation) {
			System.out.println(location + "Tire 수명" + (maxRotation - accRotation) + "회");
			return true;
		}else {
			System.out.println(" ### " + location + "Tire 평크 ###");
			return false;
		}
	}
	
	
}
