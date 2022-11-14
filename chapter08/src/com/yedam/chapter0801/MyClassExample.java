package com.yedam.chapter0801;

public class MyClassExample {
	public static void main(String[] args) {	//책 p.380
		System.out.println("1)-----");
		//rc => RemoteControl rc = new Television();
		MyClass mc = new MyClass();
		mc.rc.turnOn();		
		mc.rc.turnOff();	//mc안의 rc안의 turnoff메소드
		
		System.out.println("2)-----");
		//RemoteControl rc = new Audio();
		MyClass mc2 = new MyClass(new Audio());
		//rc.turnOn();
		//rc.setVolume();
		
		System.out.println("3)-----");
		//RemoteControl rc = new Audio();
		MyClass mc3 = new MyClass();
		mc3.methodA();
		//rc.turnOn();
		//rc.setVolume(5);
		
		System.out.println("4)-----");
		//RemoteControl rc = new Television();
		MyClass mc4 = new MyClass();
		mc4.methodB(new Television());
		//rc.turnOn();
		//rc.turnOff();
		
		
	}
}
