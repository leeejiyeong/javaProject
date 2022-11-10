package com.yedam.java.ch0605_home;

public class ConstantNoExample {
	public static void main(String[] args) {
		
		//지금 main 메소드는 정적메소드이기 때문에 일반 인스턴스맴버(words, word)를 사용하고 싶으면
		//객체를 먼저 생성하고 참조변수로 불러와야한다.
		ConstantNo csno = new ConstantNo();	 //불러온거.
		System.out.println(csno.word);
		System.out.println(csno.words);
		
		System.out.println(ConstantNo.EARTH_ROUND);	
		//같은 static필드는 어디에서나 불러와서(객체 안만들어도) 쓸수있다.
		
		
	}
}
