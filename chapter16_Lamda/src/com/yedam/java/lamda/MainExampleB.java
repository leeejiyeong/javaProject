package com.yedam.java.lamda;

public class MainExampleB {
	
	public static void main(String[] args) {		//람다식은 무조건 ✔()괄호 ->화살표 {}중괄호✔
		MyInterfaceB fib = (x, y) -> {int result = x + y;
										return result;};	
										
		System.out.println(fib.method(10, 25));
		
		fib = (x, y) -> { return x + y; };		//이렇게도 쓸수있다. return 구문은 한줄이라도 중괄호는 생략불가
		
		fib = (x, y) -> x + y;		//중괄호를 생략하고 싶다면 return까지 같이 생략하면 된다
		
		fib = (x, y) -> sum(x, y);		//sum함수를 호출해서 값을 넘겨줌
										//fib = (x, y) -> {return sum(x, y);};와 같은 의미. return과 중괄호를 같이 생략한것
	}
	
	public static int sum(int x, int y) {
		return x + y;
	}
	
}
