package com.yedam.java.ch0602;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();	//만들어논 클래스 Car를 외부 클래스인 CarExample에서 사용하기 위해서 myCar라는 변수(이름)로 객체를 우선 생성해주자.
		
		System.out.println("제작회사 : "+ myCar.company);		//Car클래스의 필드값을 읽어오는것임
		System.out.println("모델명 : "+ myCar.model);
		System.out.println("색깔 : " +myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		myCar.speed = 60;									//필드값을 변경하고 싶을때
		System.out.println("수정된 속도 : "+ myCar.speed);
		
		Car newCar = new Car();
		System.out.println("새로운 차의 현재속도 : " + newCar.speed);
		
		String str = new String("Con");
		

	}
}
