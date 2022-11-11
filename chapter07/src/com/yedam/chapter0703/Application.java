package com.yedam.chapter0703;

public class Application {
	public static void main(String[] args) {
		
		//추상 클래스는 자신을 객체화(인스턴스화) 할 수 없다.
//		Phone phone = new Phone("아이폰");
		
//		SmartPhone smartPhone = new SmartPhone("고길동");
//		
//		smartPhone.turnOn();
//		
//		smartPhone.internetSearch();
//		
//		smartPhone.turnOff();
		
		System.out.println("============================");
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("------");
		
		Animal animal = null;
		
		animal = new Dog();
		animal.sound();
		
		animal.breathe();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("------");
		
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
