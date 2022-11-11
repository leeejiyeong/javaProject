package com.yedam.chapter0702;

public class Car {
	
	//필드
	Tire frontLeftTire = new Tire("왼쪽앞바퀴", 6);
	Tire frontRightTire = new Tire("오른쪽앞바퀴", 2);
	Tire backLeftTire = new Tire("왼쪽뒷바퀴",3);
	Tire backRightTire = new Tire("오른쪽뒷바퀴",4);
	
	//생성자
	
	//메소드
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll() == false) {	//타이어 펑크났을때
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}

