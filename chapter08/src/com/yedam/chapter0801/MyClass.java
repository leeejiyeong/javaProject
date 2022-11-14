package com.yedam.chapter0801;

public class MyClass {
	
	//필드
	//1)
	//public int a = 1;
	RemoteControl rc = new Television();
	 
	//생성자
	//2)
	public MyClass() {
		
	}
	
	public MyClass(RemoteControl rc) {	//생성자 오버로딩
		 this.rc = rc;
		 rc.turnOn();
		 rc.turnOff();
	}
	
	//메소드
	//3)
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
	
	//4)
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
	
}
