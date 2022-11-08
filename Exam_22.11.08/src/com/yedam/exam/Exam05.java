package com.yedam.exam;

import java.util.Scanner;

public class Exam05 {
	/* 메뉴1) 주사위크기(5~10)를 입력. 범위를 벗어날경우 범위안내 메시지 출력.
	 * 메뉴2) 5가 나올때까지 주사위 몇번 굴리는지 구하고 출력
	 * 메뉴3) 메뉴2에서 각 주사위별로 몇번씩 나왔는지 출력
	 * 메뉴4) 메뉴2에서 가장 많이 나온 수가 몇인지 구하고 출력.
	 * 메뉴5) 프로그램 종료
	 */
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		int[] dice = null;	//주사위의 각 숫자별로 몇번씩 나왔는지 기록하는 용도.
							//index는 웬만하면 변동x	-> index는 주사위의 각 숫자
							//대신 각 index별로 가지는 값은 변동o
							//index의 각 값은 주사위의 각 숫자가 가지는 횟수
		int size = 0;
		
		while(run) {
			System.out.println("=== 1.주사위 크기 2.주사위굴리기 3.결과보기 4. 가장 많이 나온 수 5.종료 ===");
			System.out.println("메뉴 > ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {		//주사위 크기 입력
				System.out.print("주사위 크기 > ");
				size = Integer.parseInt(sc.nextLine());
				if (size>=5 && size<=10) {
					dice = new int[size];
				}else {
					System.out.println("주사위 크기는 5~10사이만 가능합니다.");
					size = 0;
				}
			}else if(selectNo == 2) {		//주사위 굴리기 -> 주 기능
				int count = 0;
				while(true) {	// index = num-1 , index+1 = num
					int num = (int)(Math.random()*size) +1;
					count++;
					dice[num-1] = dice[num]+1;	//배열이 만들어지기만 했지 배열 내용은 빈칸이기 때문에 나오는걸 채워줘야한다.
					if(num == 5) {
						break;
					}
				}
				System.out.println("5가 나올때까지 주사위를 "+count+"번 굴렸습니다");
			}else if(selectNo == 3) {		//결과 보기
				for(int i=0; i<dice.length; i++) {
					System.out.println((i+1)+"은"+dice[i]+"번 나왔습니다.");
				}
			}else if(selectNo == 4) {		//가장 많이 나온 수 = 배열의 값중 최대값을 찾아라. 문제는 횟수라는것.
				int maxCount = dice[0];	//나온 횟수
				int maxIndex = 0;	//나온 index값
				for(int i=0; i<dice.length; i++) {	//여기서부턴 전에 했던 최대값 구하기임.
					if(maxCount < dice[i]) {
						maxCount = dice[i];
						maxIndex = i;	
					}
				}
				System.out.println("가장 많이 나온 수는 "+(maxIndex+1)+"입니다.");
			}else if(selectNo == 5) {		//종료
				run = false;
			}else {		//메뉴(1~5)외 입력 시
				System.out.println("메뉴를 잘못 입력 하셨습니다. 다시 입력하세요");
			}
		}
		System.out.println("프로그램 종료");
	}

}
