package com.yedam.java;

public class Exam01 {

	public static void main(String[] args) {
//		변수 두개 선언해서 10, 2.0대입하고, 두변수의 사칙연산 !!!!결과를 정수로 출력!!!!하는 코드작성.
		int a = 10;
		double b = 2.0;
		
		//a+b
		System.out.printf("%d + %.1f = %.1f\n", a, b, (int)a+b);
		
		//a-b
		System.out.printf("%d - %.1f = %.1f\n", a, b, (int)a-b);
		
		//a*b
		System.out.printf("%d * %.1f = %.1f\n", a, b, (int)a*b);
		
		//a/b
		System.out.printf("%d / %.1f = %.1f\n", a, b, (int)a/b);
		
	}

}
