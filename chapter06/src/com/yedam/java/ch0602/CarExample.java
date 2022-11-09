package com.yedam.java.ch0602;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();	//인스턴스를 만들려면 new연산자로 호출
		
		System.out.println("제작회사 : "+ myCar.company);
		System.out.println("모델명 : "+ myCar.model);
		System.out.println("색깔 : " +myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도 : "+ myCar.speed);
		
		Car newCar = new Car();
		System.out.println("새로운 차의 현재속도 : " + newCar.speed);
		
		String str = new String("Con");
		

	}
}
