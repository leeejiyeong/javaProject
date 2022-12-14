package com.yedam.java.generic;

public class Apple {
	
}
/***
✔제네릭
- 제네릭을 모르면 api도큐먼트 해석이 어렵기 때문에 알아야 한다.
	class arraylist<E> → 꺽쇠 E 적혀있는게 제네릭이다.
	클래스 타입들을 집어넣을때 사용(int, string등등)

- 제네릭을 사용할때 장점
	실행시 타입에러(빨간줄)방지(실행하기전에 오류확인가능), 컴파일 시 타입을 강하게 체크해서 에러 사전방지
	캐스팅 괄호를 계속 안써도된다.(강제변환은 꼭 필요할때만 써야한다.)
	
- 제네릭은 원래 클래스나 인터페이스를 대체하는 애라서 기본타입은 사용할수 없다(?) 

- 클래스 자체가 아니라 클래스 안의 메소드가 제너릭으로 선언되는 경우도 있다.

Class classname<?> → ?에는 모든 객체 사용이 가능하다.
	 하지만 extends와, super를 사용하면 사용범위에 제한을 건다.

<? extends 상위타입> :  이때 ?에 올수있는거는 상위타입을 상속하고 있는 자식클래스로 한정된다.

<? super 하위타입> :  하위타입 이상의 타입을 요구한다.

***/