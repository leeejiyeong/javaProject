package com.yedam.java.ch0605_home;

public class Car2 {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		myCar.speed = 60;
		myCar.run();
	}
}
