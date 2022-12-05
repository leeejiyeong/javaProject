package com.yedam.java.generic;

public class Utill {
	/*
	 * 클래스 이름만 봤을때는 일반 클래스인데 메소드를 보면 제네릭 타입이다.
	 * 기존의 메소드명에서 앞에 <T>를 붙인다. (static 다음에 쓴거)
	 * 기존의 문법을 해치지 않으면서 표시하고있다
	 */
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
