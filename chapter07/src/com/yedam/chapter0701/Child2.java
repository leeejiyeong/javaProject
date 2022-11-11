package com.yedam.chapter0701;

import com.yedam.chapter07.Parent;

public class Child2 extends Parent {	//다른 패키지의 부모를 상속받음
	//필드
	
	//생성자
	
	//메소드
	void getInfo() {
//		System.out.println(firstName + lastName + bloodType + age);
			//default는 다른 패키지에서 사용할수 없기 때문에 오류남.
			//protected는 원래 다른패키지에서 사용할수 없지만, 상속받으면 사용가능
	}
	
}
