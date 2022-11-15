package com.yedam.chapter11;

public class BoxingUnboxing {
	public static void main(String[] args) {
		//박싱
		//1) 생성자를 사용한 박싱
		Integer obj1 = new Integer(100);	//가로취소선 -> 구문을 사용할수는 있지만 권유하지 않는다는 뜻
		Integer obj2 = new Integer("200");	
		
		//2) 생성자를 사용하지 않는 박싱
		Integer obj3 =  Integer.valueOf("300");
		
		
		//언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1+value2+value3);
		System.out.println(value2);
		System.out.println(value3);
		
		System.out.println("===================");
		
		//자동 박싱
		Integer obj4 = 100;
		
		//자동 언박싱
		int value4 = obj4;
		int value5 = obj4.intValue();	//이것도 된다 다만 위에것이 더 편할뿐
		
		//타입변환
		int value6 = Integer.parseInt("777");
		double value7 = Double.parseDouble("333");
		boolean value8 = Boolean.parseBoolean("true");
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
		System.out.println("==================");
		
		//포장값 비교
		Integer obj10 = 300;
		Integer obj11 = 300;
		System.out.println(obj10 == obj11);		//false가 나오는 이유 :  값의 범위(-128~127)를 넘어갔기 때문
		
		
		
	}
}
