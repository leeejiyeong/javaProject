package com.yedam.java.ch0402;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		// for문

		// 1부터 10까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		//
		int x = 1;
		for (; x <= 100; x = x + 15) {
			System.out.println("출력");
		}
		System.out.println("x : " + x);

		// 조건 여러개
		for (int i = 0, j = 100; i <= 50 && j >= 50; i++, j--) {
		}

		// 1~100까지 출력, 동시에 1~100까지 합을 출력
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum = sum + i; // sum += i;
		}
		System.out.println("1~100까지의 합계 :" + sum);

		// float 타입 카운터 변수 - 사용은 할수있으나 우리가 생각하는 값이 안나옴
		// -> 정확하게 0.1이아니라 0.1에 근접한 값이기 때문에 누적되면 정밀도가 떨어짐
		for (float f = 0.1f; f <= 1.0f; f += 0.1f) {
			System.out.println(f);
		}

		// 구구단을 2~9단 까지 출력
		for (int i = 2; i < 10; i++) {
			System.out.println("***" + i + "단***");
			for (int j = 1; j < 10; j++) { // 밖에있는 for문이 1번 돌때, 안에있는 for문은 9번 돌아야함
				System.out.println(i + "X" + j + "=" + (i * j));
			}
		}

		// while문 ->조건식밖에 없다.

		// 1~10까지 출력
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}

		count = 0;
		while (count <= 9) {
			count++;
			System.out.println(count); // 증감식(++)이 어디에있냐에 따라 조건을 주는게 조금 달라진다.
		}

		// 1부터 100까지 출력, 동시에 1부터 100까지 합을 출력
		count = 1;
		sum = 0;

		while (count <= 100) {
			System.out.println(count);
			sum += count;
			count++; // 다른 식이 추가될때는 웬만하면 증감식 이전에 적는 경우가 많다.(먼저 합이 계산되고나서 +1을 해야하기 때문)
		}
		System.out.println("1~" + (count - 1) + "까지 합 :" + sum); // 카운트가 101이 되어야 false가 되어 while문을 빠져나오기 때문에
																  // -1을 해줘야 100이 출력이 된다.

		// 주사위 두개를 굴립니다. 합이 3이 될때까지 계속 굴리는 경우. -> for문은 불가능 하다.
		int index = 1;

		while (index != 1) {
			System.out.println("while 반복문이 " + index + "번 실행됩니다.");
		}
		
		do {
			System.out.println("do ~ while 반복문이 " + index + "번 실행됩니다.");
		} while (index != 1);
		
		//break로 while문 종료
		while(true) {
			int num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
			if(num == 6)
				break;
		}
		
		//이중 for문에서 break문 사용
		for(char upper = 'A'; upper <='Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower =='g') {
					break;
				}
			}
			System.out.println("1)안쪽 for문 종료");
		}
		System.out.println("2)바깥쪽 for문 종료");
		
		System.out.println("===================================");
		
		Outter:for(char upper = 'A'; upper <='Z'; upper++) {		// 이중 for문인데 나는 바깥쪽 for문을 종료시키고 싶다 
			for(char lower = 'a'; lower <= 'z'; lower++) {			// => for문에 이름을 붙여서 사용하면 된다.
				System.out.println(upper + "-" + lower);
				if(lower =='g') {
					break Outter;
				}
			}
			System.out.println("1)안쪽 for문 종료");
		}
		System.out.println("2)바깥쪽 for문 종료");
		
		//continue를 사용한 for문
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) continue;		// if(i%2!=0){ 
			System.out.println(i);			// System.out.println(i); }랑 같음 => 짝수가 아닐때 출력
		}	// -> 짝수일때 그냥 통과
		
		
		
		
		
		
		
		
		
	}
}
