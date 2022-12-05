package com.yedam.java.lamda;

public class MainExample {	
	
	public static void main(String[] args) {	//람다식은 구현클래스가 필요없고 바로 메인 클래스에서 사용하면된다.
		//MyFuncInterface fi1 = new MyFunctionalClass();	-> 일반적인 형식
		
		MyFuncInterface fi1 = () -> {System.out.println("람다식 메소드 구현");};	//람다식
		fi1.method();
		/*
		 * ↑ 인터페이스에 하나의 추상메소드만 존재하도록 하는것
		 * 나열되어있는 람다식 () -> {System.out.println("람다식 메소드 구현");};을 맵핑하는것
		 * 람다식은 이름이 없기 때문에 인터페이스에 메소드가 여러개면 뭘 가져올건지 알수가 없다
		 * 1) 추상메소드가 하나만 존재하는 인터페이스 필요
		 * 2) 걔를 사용할때 람다식이 어떤식으로 작동하는지 실행구문을(sys("람다식 메소드구현")) 적어준다
		 */
		
		MyFuncInterface fi2 = new MyFuncInterface() {		
			
			@Override
			public void method() {
				System.out.println("익명 구현 객체 메소드 구현");	 		
				
			}
		};
		
		fi2.method();
		
		fi1 = () -> System.out.println("람다식 메소드 구현 시 실행구분 생략");		//실행구문이 하나일 경우에는 중괄호 생략 가능
		fi1.method();
		
	}
}
