package com.yedam.java.ch0601;

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone iphone14Pro = new SmartPhone();	//클래스를 활용해서 객체를 만들때(메모리 공간을 할당할때) new연산자 사용
		//클래스      변수이름?	  new연산자  생성자
		
		iphone14Pro.maker = "Apple";
		iphone14Pro.name = "iphone14Pro";
		iphone14Pro.price = 1000000;
		
		System.out.println("나의 핸드폰 제조사는 " + iphone14Pro.maker + "입니다.");
		System.out.println("나의 핸드폰 기종은 " + iphone14Pro.name+ "입니다.");
		
		iphone14Pro.call();
		iphone14Pro.hangUp();
		
		System.out.println("-----------------------");
		
		SmartPhone zflip4 = new SmartPhone();
		
		System.out.println("객체 생성시 생성자에 초기값을 안 넣어준 경우");
		System.out.println(zflip4.name);
		
		zflip4.name = "z-filp4";
		zflip4.maker = "Samsung";
		zflip4.price = 900000;
		
		zflip4.call();
		zflip4.hangUp();
		
		System.out.println(iphone14Pro);	//com.yedam.java.ch0601.SmartPhone@5aaa6d82 -> 클래스 번지수가 출력된다.
		System.out.println(zflip4);
		
		
	}

}
