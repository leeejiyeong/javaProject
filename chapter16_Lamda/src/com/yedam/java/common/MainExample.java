package com.yedam.java.common;

public class MainExample {
	public static void main(String[] args) {
		MyFunctionalInterface mfi1 = new MyFunctionalClass();
		mfi1.method();
		
		MyFunctionalClass mic1 = new MyFunctionalClass();
		mic1.func();
		
		//익명 구현 객체(chapter9에 중첩클래스에 있음)
		//1) 상속 혹은 구현의 관계에서만 가능
		//2) 재사용이 불가
		//3) 고유의 메소드를 가질수는 있으나 외부에서 호출 불가
		MyFunctionalInterface mfi2 = new MyFunctionalInterface() {

			@Override
			public void method() {
				System.out.println("익명 구현 객체를 통해 실행");
				func();
			}
			
			public void func() {
				System.out.println("익명 구현 객체 소유");
			}
			
		};
		
		mfi2.method();
		
		MyFunctionalClass mfc2 = new MyFunctionalClass() {
			@Override
			public void method() {
				System.out.println("부모 클래스 상속 후 오버라이딩");
			}
			
			@Override
			public void func() {
				System.out.println("부모클래스 상속 후 오버라이딩2222");
				
			}
		};
		
		
		mfc2.method();
		mfc2.func();
		
		
		/*
		 * new 연산자 : 인스턴스를 생성하는 생성자역할
		 * 기존의 클래스를 만드는 형식이 아니라 인터페이스에 구현객체를 만들겠다는 것
		 * 지금까지 new연산자 뒤에 인터페이스가 오는 경우는 없었다 
		 * 기존처럼 클래스가아니라 인터페이스가 오면서 클래스가 없기 때문이 이름이 없음(?)
		 * 쓰는이유 : 재사용되지 않는 보통 한번만 처리하면 되는 클래스에서 사용된다.
		 * 편한만큼 단점도 있다. -> 인터페이스 이름으로만 사용할 수 있다
		 * - 클래스는 클래스대로 따로 사용할 수 있다. 익명구현객체는 내꺼가 없기 때문에(이름이 없자나) 나를 부를수가 없다.
		 * - 내가 활동할수 있는건 나를 구현하는 인터페이스 뿐이다.
		 */
		
		
	}
}
