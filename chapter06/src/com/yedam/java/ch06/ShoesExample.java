package com.yedam.java.ch06;

public class ShoesExample {
	
	public static void main(String[] args) {
		Application ap = new Application();
		//staticTest  = 1; (x)
		ap.staticTest  = 1;		//쓰고싶으면 내자신을 인스턴스화(객체로 만듬)하고나서 사용
		Shoes shoes = new Shoes();
		
		shoes.makeRunning();
		shoes.makeSlipper();
		shoes.makeMule();
		shoes.getCount();
		
		System.out.println(shoes.totalCount);
	}
}
