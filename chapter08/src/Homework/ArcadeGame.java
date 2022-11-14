package Homework;

public class ArcadeGame implements Keypad{

	/*
	 * 3) ArcadeGame 클래스를 정의한다.
	- Keypad를 구현하는 클래스.
	- 현재 모드를 값으로 가지는 필드를 가지며 생성자를 이용하여 값을 초기화한후 "ArcadeGame 실행"을 출력한다.
	  ( 단, 매개변수를 이용하지 않으며 최초의 값은 NORMAL_MODE 이다. )
	- Keypad 인터페이스에 정의된 추상 메서드를 다음과 같이 오버라이딩한다.
	(1) public abstract void leftUpButton() : "캐릭터가 앞쪽으로 이동한다"를 출력한다.
	(2) public abstract void leftDownButton() : "캐릭터가 뒤쪽으로 이동한다"를 출력한다.
	(3) public abstract void rightUpButton()
		- NORMAL_MODE : "캐릭터가 일반 공격"를 출력한다.
		- HARD_MODE : "캐릭터가 연속 공격"를 출력한다.
	(4) public abstract void rightDownButton()
		- NORMAL_MODE : "캐릭터가 HIT 공격."를 출력한다.
		- HARD_MODE : "캐릭터가 Double HIT 공격."를 출력한다.
	(5) public abstract void changeMode() : 모드를 바꾸고 현재 모드를 출력하는 기능 
	( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
	 */
	
public int nowMode = 0;
	
	public ArcadeGame() {
		System.out.println("ArcadeGame 실행");
	}
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다");
	}
	
	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤쪽으로 이동한다");
	}
	
	@Override
	public void rightUpButton() {
		if(nowMode == NORMAL_MODE) {
			this.nowMode = Keypad.NORMAL_MODE;
			System.out.println("캐릭터가 일반공격");
		}else if(nowMode == HARD_MODE) {
			this.nowMode = Keypad.HARD_MODE;
			System.out.println("캐릭터가 연속공격");
		}
	}
	
	@Override
	public void rightDownButton() {
		if(nowMode == NORMAL_MODE) {
			this.nowMode = Keypad.NORMAL_MODE;
			System.out.println("캐릭터가 HIT공격");
		}else if(nowMode == HARD_MODE) {
			this.nowMode = Keypad.HARD_MODE;
			System.out.println("캐릭터가 double HIT공격");
		}
	}
	
	@Override
	public void changeMode() {
		if(nowMode == NORMAL_MODE) {
			this.nowMode = Keypad.HARD_MODE;
			System.out.println("현재모드 : HARD_MODE");
		}else if(nowMode == HARD_MODE) {
			this.nowMode = Keypad.NORMAL_MODE;
			System.out.println("현재모드 : NORMAL_MODE");
		}
	}
}
