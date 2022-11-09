package com.yedam.java.ch0604;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	//배열에 직접 입력하여 값을 받는건 번거롭기 때문에 자바가 새로운 문법을 내놓았다
	int sum2(int ... values) {	//...은 연산자와 비슷하다고 생각하자
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
