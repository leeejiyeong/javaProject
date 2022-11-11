package com.yedam.chapter0701;

public class Compute extends Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("Compute 오버라이드 실행");
		return r*r*Math.PI;
	}
	
}
