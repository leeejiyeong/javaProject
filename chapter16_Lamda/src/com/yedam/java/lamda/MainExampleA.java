package com.yedam.java.lamda;

public class MainExampleA {
	
	public static void main(String[] args) {
		MyInterfaceA fia = (a) -> {int result = a + 100;		//인터페이스에 매개변수가 있기 때문에 그냥 ()로 쓰면 빨간줄 오류남. 타입은 안써도됨
								   System.out.println("100을 더한 결과 : " + result);};		
		fia.method(20);
		
		fia = a -> System.out.println("100을 더한 결과 두번째 : " + (a + 100));		//매개변수가 하나뿐이면 괄호()생략 가능
		fia.method(20);
		
	}
	
	
}
