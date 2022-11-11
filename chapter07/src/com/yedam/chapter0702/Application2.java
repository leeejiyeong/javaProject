package com.yedam.chapter0702;

public class Application2 {
	public static void main(String[] args) {
		HankookTire hTire = new HankookTire("right", 10);
		KumhoTire kTire = new KumhoTire("left", 20);
		
		//Tire객체에 자식 객체인 hTire가 들어감
		//tire -> 한국타이어 사용중 
		Tire tire = hTire;
		System.out.println(tire.roll());
		
		tire = kTire;
		System.out.println(tire.roll());
		
		tire = hTire;
		System.out.println(tire.roll());
		
	}
}
