package com.yedam.chapter0801;

public class WashingExample {
	public static void main(String[] args) {
		WashingMachine wm = new LGWashingMachine();
		
		washing(new LGWashingMachine());
		//washing(new SamsungWashingMachine());
	}
	
	public static void washing(WashingMachine wm) {	//매개변수 : LGWashingMachine()
		wm.startBtn();
		System.out.println("세탁기 속도는 : " + wm.changeSpeed(3));
		wm.stopBtn();
	}
}
