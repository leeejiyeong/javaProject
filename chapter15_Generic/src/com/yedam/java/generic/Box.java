package com.yedam.java.generic;

public class Box<T> {		//제네릭타입을 쓰는 클래스나 인터페이스는 꺽쇠를 사용해 T(지정한 문자)로 사용한다는것을 알려줘야햔다.
	
	private T field;	
	
	
	public void set(T value) {
		this.field = value;
	}
	
	public T get() {
		return this.field;
	}
	
	/*
	 * 기존에 있는 클래스가 아니다. 타입을 담을수 있는 변수를 선언하고 걔들을 적절한 위치에 사용하면된다.
	 * 이름이 길어지면 다른 클래스 이름과 겹칠수있기 때문에 보통 영어 대문자 한글자만 아무거나 쓴다.
	 * 필요하다면 2~3를 더 선언해서 쓸수도 있다.(보통은 3개이하로 쓴다)
	 */
}
