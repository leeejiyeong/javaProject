package com.yedam.chapter0702;

public class Application3 {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - child 변환 성공");
		}else {
			System.out.println("변환 실패");
			
			System.out.println("========================");
		}System.out.println("metho1 -chld변환  =성공");
	}
	
	
	
	public static void main(String[] args) {
		
		Parent parentA = new Child();
		method1(parentA);
		
		
		System.out.println("=======================");
		
		Driver driver = new Driver();
		
		//bus, taxi는 vehicle부모 클래스를 모시고 있는거임
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//driver.drive(Vehicle vehicle = new Bus())
		driver.drive(bus);
		driver.drive(taxi);
		
		System.out.println("=======================");
		
		Animal animal = null;
		
		animal = new Cat();
		animal.speak();
		
		animal = new Dog();
		animal.speak();
		
		System.out.println("=======================");
		
		Parent parent = new Child();
		
		parent.field = "parent";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "child";	->오류남
//		parent.method3();
		
		//Casting(강제타입변환)
		Child child = (Child)parent;
		child.method3();
		
		child.field2 = "child";
		child.method3();
		
		child.field = "parent";
		
		
		
		
		
	}
}
