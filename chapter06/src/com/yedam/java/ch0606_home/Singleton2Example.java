package com.yedam.java.ch0606_home;

public class Singleton2Example {
	public static void main(String[] args) {
		/*
		Singleton2 obj1 = new Singleton2();		//private로 선언했기 때문에 불러올수 없다. 
		Singleton2 obj2 = new Singleton2();
		*/
		
		Singleton2 obj1 = Singleton2.getInstance();
		Singleton2 obj2 = Singleton2.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton2 객체입니다.");
		} else {
			System.out.println("다른 Singleton2 객체입니다.");
		}
	}
}
