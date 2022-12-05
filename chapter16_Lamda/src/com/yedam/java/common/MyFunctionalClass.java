package com.yedam.java.common;

public class MyFunctionalClass implements MyFunctionalInterface {

	@Override
	public void method() {
		System.out.println("정석대로 구현해서 실행하는 경우");
	}
	
	public void func() {
		System.out.println("클래스 소유");
	}

}
