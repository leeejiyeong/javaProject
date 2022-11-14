package com.yedam.chapter0802;

public class Car {
	Tire frontLeftTire = new NexonTire();
	Tire frontRightTire = new NexonTire();
	Tire backLeftTire = new NexonTire();
	Tire backtRightTire = new NexonTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backtRightTire.roll();
	}
	
}
