package com.yedam.java.ch0601;

public class ConstantNo {
	//==필드==
	static final double PI = 3.14;		//static->전역에서 쓸수있는 필드인데, final-> 불변의 필드가 된다. final은 대문자로 써주는게 관례
	static final int EARTH_ROUND = 46250;		//합성어는 가운데 언더바 사용
	static final int LIGHT_SPEED = 127000;
	
	String words = "This is Java";
	char word = 'Y';

	//==생성자==
	
	
	//==메소드==
	//static 멤버에 사용범위(scope)
	
	//static 메소드
	//static간에 필드 사용
	static void getCircle(int radius) {
		//원넓이 = pi * r * r
		System.out.println("원넓이 : " +(PI*radius*radius));
	}
	
	//메소드에 static 필드 호출
	public void allData() {
		double result = PI + EARTH_ROUND + LIGHT_SPEED;
		System.out.println(result);
		getCircle(1);
	}
	
	//static 메소드에 일반 필드, 메소드 사용
	public static void words() {	//static메소드 안에서는 일반 메소드, 일반 필드 사용불가.
		//String getWord = words + String.valueOf(word); (x)
	}
}
