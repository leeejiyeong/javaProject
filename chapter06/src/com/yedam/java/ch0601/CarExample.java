package com.yedam.java.ch0601;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();	//new연산자가 생성자를 호출한다.
		System.out.println("최대 스피드 :"+ car1.maxspeed);
		System.out.println("색깔 :" +car1.color);
		car1.run();
		
		System.out.println();
		
		Car car2 = new Car();
		System.out.println("최대 스피드 :"+ car2.maxspeed);
		System.out.println("색깔 :" +car2.color);
		car2.run();
		
		System.out.println();
		
		if(car1 == car2) {	//똑같은 class를 기반으로 만들어진건 맞는데 서로 다른 존재이다.
							//왜? -> new연산자로 새로 만들었잖아
			System.out.println("car1과 car2는 동일한 객체를 참조합니다.");
		}else {
			System.out.println("car1과 car2는 서로 다른 객체를 참조합니다.");
		}
		
	}

}
