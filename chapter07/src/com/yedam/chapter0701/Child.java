package com.yedam.chapter0701;

public class Child extends Parent{	//child는 parent를 상속하겠다는 뜻
	//필드
	public String lastName;
	public int age;
	
	//생성자
	
	//메소드
	
	@Override	//부모 메소드를 내입맛대로 좀 바꾸겠다
	public void method1() {
		 System.out.println("Child 클래스 재정의 된 method1 호출");
	}
	
	public void method3() {
		System.out.println("Child 클래스 method3 호출");
	}
}
