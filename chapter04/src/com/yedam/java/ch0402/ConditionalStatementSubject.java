package com.yedam.java.ch0402;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		// 문제1) 책 p.161 5번
		// for문을 이용해서 다음과 같이 *를 출력하는 코드
		// *
		// **
		// ***
		// ****
		// *****
		
		// 풀이1
		String str = "";
		for(int i=0; i<5; i++) {
			str += "*";
			System.out.println(str);
		}
		
		// 풀이2
		for(int i=1; i<=5; i++) { 	//line
			for(int j=1; j<=i; j++) {	//"*" 출력
				System.out.print("*");		//println(x), print(o)
			}
			System.out.println();
		}
		
		// 문제2) for문을 이용해서 1부터 100까지 정수 중에서 2의 배수가 아닌 숫자의 갯수를 구하세요.
		int count = 0;		//count 변수는 밖으로 끄집어 내야함. for문 안에 있으면 계속 0으로 돈다.
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) continue;
			count++;
		}
		System.out.println(count);
		
		// 문제3) 책 p.161 4번
		// 		 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해 중에서 
		//		 첫번째로 구해지는 값을 (x, y)형태로 출력	-> break위치를 바꾸던가, 밖에 for문에 이름을 붙이던가
		//		 단, x와 y는 10이하의 자연수입니다.
		
		// 1)중첩 for문, 2)x, y는 1부터 10까지 정수 		
		Outter : for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(4*x + 5*y == 60) {
					System.out.println(x + "," + y);
					break Outter;
				}
			}
		}
		
		//문제4) do ~ while문과 Math.random() 함수를 이용
		//		1 ~ 10의 정수 중 7이라는 수가 나올때까지 숫자를 출력
		int num = 0;
		do {
			num = (int)(Math.random() * 10)+1;
			System.out.println(num);
		} while (num != 7 );
		
		//문제5) 책 p.161 3번
		//		while문과 Math.random() 함수를 이용
		//		2개의 주사위를 던졌을 때 숫자를 (숫자1, 숫자2)로 출력
		// 		숫자의 합이 5일 경우에 종료, 아닌 경우에 계속 던짐
		//		최종으로 주사위를 몇번 던졌는지 횟수를 출력
		//		숫자의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)
		
		int total = 0;
		while(true){
			int dice1 = (int)(Math.random() * 5)+1;
			int dice2 = (int)(Math.random() * 5)+1;
			total++;	//랜덤으로 뽑고나서 횟수 +1해줌
			System.out.printf("( %d,%d )\n", dice1, dice2);	
			if(dice1 + dice2 ==5) {
				break;
			}
		}
		System.out.println("주사위 총 던진 횟수:" + total);
	}

}
