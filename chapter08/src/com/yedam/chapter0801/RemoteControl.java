package com.yedam.chapter0801;

public interface RemoteControl {	//상수, 추상메소드 두개만 선언이 가능하다.

	//상수
	//public static final PI = 3.14;
	
	//추상메소드
	//public void method1();
	
	//기본 설계도
	//대규모 프로젝트같은걸 하면 번역같은걸 한다. 
	//A: 영어->한글 (메소드:번역)
	//B: 영어 ->일본어(메소드 : method1())
	//C:영어->중국어(메소드 : method2())
	//같은 기능인데 사람마다 메소드 이름이 다르다.
	//인터페이스를 활용하게 되면 abc들이 설계도를 받아서 일하게 되는것. 필요한 기능(인터페이스)을 정해놓으면 개발자들이 거기에 맞춰서 진행하게 된다.
	
	//프로젝트를 완료 하게되면
	//똑같은 메소드 이름으로 구현
	
	//public static final int MAX_VOLUME = 10;를 간략하게 표현한것. (static final 생략)
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상메소드
	//public abstract void turnOn();이랑 같은거임 (abstract생략)
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	
	
}
