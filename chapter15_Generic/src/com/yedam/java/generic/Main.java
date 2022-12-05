package com.yedam.java.generic;

public class Main {
	public static void main(String[] args) {
		// 제네릭을 이용한 방식
		/*
		 * 내부에 어떤 클래스를 가질지 알려줘야한다.
		 */
		Box<String> box1 = new Box<String>();
		
		box1.set("홍길동");
		//set(1000);		-> 이 box는 string만 요구하기 때문에 타입오류남(빨간줄)
		String name = box1.get();	//기존 object방식과 다르게 강제 타입변환을 할 필요가 없다.
		
		Box<Integer> box2 = new Box<>();	//위에처럼 뒤에 꺽쇠에도 타입을 적어주는게 정석이지만 생략도 가능하다. 
		box2.set(1000);
		int value = box2.get();		//얘도 캐스팅괄호(강제변환) 안써도된다.
		
		Box<Apple> appleaBox = Utill.boxing(new Apple());
		Box<String> nameBox = Utill.boxing("신윤권");
		
		/*
		 * 제너릭을 직접 사용할일은 적지만(주로 라이브러리 만들때 사용) 공식 홈페이지에서 사용되는 문법중
		 * 가장 사용빈도가 높다. 그걸 읽기위해 알아야 하는것
		 */
		
		
	}
}
