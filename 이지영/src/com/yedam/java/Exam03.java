package com.yedam.java;

public class Exam03 {
	public static void main(String[] args) {
		//변수 operator값이 +, -, *, / 인 경우에 각 사칙연산을 수행하는 프로그램을
		//if~else if문 혹은 switch문을 사용해 작성.
		
		int num1 = 10;
		int num2 = 2;
		char operator1 ='+';
		char operator2 ='-';
		char operator3 ='*';
		char operator4 ='/';
		
		
		if(operator1 == '+') {
			System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
		}
		if(operator2 =='-') {
			System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		}
		if(operator3 == '*') {
			System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
		}
		if(operator4 == '/')
			System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
		}
}
