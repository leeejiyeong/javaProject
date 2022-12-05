package com.yedam.java.common;

public class Main {
	public static void main(String[] args) {
		// 기존 object를 이용한 방식
		
		Box box = new Box();
		
		box.set("홍길동");
		//box.set(1000);	-> 빨간줄은 없지만 실행시키면 오류남
		String name = (String)box.get();
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();
		
		/*왜 자동과 강제가 존재하는걸까?
		 * 자동은 상관없으나
		 * 자식은 부모 +a이기 때문에 내가 가진 고유한걸 버리면 부모가 됨
		 * 근데 부모가 자식을 대신할수는 있나? -> 없음
		 * == 이 코드는 전제조건이 성립될때만 된다.
		 * == 얘를 사용할때는 box에 반드시 string타입이 있어야되는데 아무도 보장할수 없다.
		 * == 이런 위험부담을 줄이면서 클래스 자체에 대한 재활용도를 높이기 위한게 제네릭 타입이다.
		 */
	}
}
