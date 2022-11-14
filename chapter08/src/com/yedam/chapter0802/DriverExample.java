package com.yedam.chapter0802;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(bus);
		driver.drive(taxi);
		
		Vehicle vhc = new Bus();	//Bus로 만든 구현객체
		
		vhc.run();
		//vhc.checkFare(); -> 오류남 강제타입변환해야함
		
		//강제타입변환
		Bus bus2 = (Bus) vhc;	
		
		bus2.run();
		bus2.checkFare();
		
		System.out.println("==============");
		//객체타입확인 -> instanceof사용
		
		driver.drive(bus);
		driver.drive(taxi);
		
		
	}
}
