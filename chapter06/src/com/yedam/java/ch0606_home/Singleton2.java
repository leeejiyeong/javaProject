package com.yedam.java.ch0606_home;

public class Singleton2 {
	
	private static Singleton2 singleton = new Singleton2();	
	
	private Singleton2() {
		
	}
	
	static  Singleton2 getInstance() {
		return singleton;
	}
	
}
