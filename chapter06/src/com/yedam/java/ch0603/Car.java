package com.yedam.java.ch0603;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	
	int maxSpeed = 350;
	int speed;
	
	//생성자
	
	public Car() {
		
	}
	
	public Car(String model) {
		//this.model = model;
		this(model, "은색", 250);
	}
	
	public Car(String model, String color) {
		//this.model = model;					//this =>괄호가 없다? => 인스턴스
		//this.color = color;						   =>괄호가 있다? => 생성자
			//this.company = "웨스턴";				   =>그 외	    => 메서드
		this(model, color, 250);	//생성자 호출은 반드시 첫번째 줄에 있어야 함. 얘가 실행되어야 그다음걸 할수가 있다. 
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
