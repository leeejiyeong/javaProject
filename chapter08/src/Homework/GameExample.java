package Homework;

public class GameExample {
	public static void main(String[] args) {
		/*
		 * 4)  아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
	- 출력결과
		RPGgame 실행
		캐릭터가 위쪽으로 이동한다.
		캐릭터가 한칸단위로 점프한다.
		현재 모드 : HARD_MODE
		캐릭터가 두칸단위로 점프한다.
		캐릭터가 HIT 공격.
		캐릭터가 아래쪽으로 이동한다.
		현재 모드 : NORMAL_MODE
		캐릭터가 일반 공격.
		======================
		ArcadeGame 실행
		캐릭터가 앞쪽으로 이동한다.
		캐릭터가 일반 공격
		캐릭터가 뒤쪽으로 이동한다.
		현재 모드 : HARD_MODE
		캐릭터가 연속 공격.
		캐릭터가 앞쪽으로 이동한다.
		캐릭터가 Double HIT 공격.
		 */
		
		Keypad kp = new RPGgame();
		
		kp.leftUpButton();
		kp.rightUpButton();
		kp.changeMode();
		kp.rightUpButton();
		kp.rightDownButton();
		kp.leftDownButton();
		kp.changeMode();
		kp.rightDownButton();
		
		System.out.println("=====================");
		
		Keypad kp2 = new ArcadeGame();
		
		kp2.leftUpButton();
		kp2.rightUpButton();
		kp2.leftDownButton();
		kp2.changeMode();
		kp2.rightUpButton();
		kp2.leftUpButton();
		kp2.rightDownButton();
		
		
		
		
		
		
	}
}
