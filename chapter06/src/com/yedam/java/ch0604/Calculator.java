package com.yedam.java.ch0604;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y){		//void가 아니면 리턴값이 필요함.
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y){
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//// 내부의 기존 메소드를 호출하는 형식으로 사용.. 이미 선언되어있으면 그거를 가져와서 사용하자...필요한곳에서 해당메소드를 조합하자...힝..................
	double avg(int x, int y){
		int sum = plus(x,y);
		double result = sum / 2.0;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과 : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	//
	
	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
	
	
	
}
