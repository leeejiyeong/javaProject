package com.yedam.java;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		/* 메뉴1) 주사위크기(5~10)를 입력. 범위를 벗어날경우 범위안내 메시지 출력.
		 * 메뉴2) 5가 나올때까지 주사위 몇번 굴리는지 구하고 출력
		 * 메뉴3) 메뉴2에서 각 주사위별로 몇번씩 나왔는지 출력
		 * 메뉴4) 메뉴2에서 가장 많이 나온 수가 몇인지 구하고 출력.
		 * 메뉴5) 프로그램 종료
		 */
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		int[] diceList = null;
		int count = 0;
		
		while(run) {
		System.out.println("=== 1.주사위 크기 2.주사위굴리기 3.결과보기 4. 가장 많이 나온 수 5.종료 ===");
		System.out.println("메뉴 > ");
		
		int menuNo = Integer.parseInt(sc.nextLine());
		
		if(menuNo == 1) {
			System.out.println("주사위 크기 > ");
			int diceSize = Integer.parseInt(sc.nextLine());
			if(diceSize>=5 && diceSize<=10) {
				int dice = (int)(Math.random()*diceSize)+1;
			}else {
				System.out.println("범위를 벗어났습니다");
				System.out.println("5~10사이의 숫자를 입력하세요.");
			}
		}else if(menuNo == 2) {
			for(int i=1; i<=5; i++) {
				int dice = (int)(Math.random())+1;
				if (count == 5) {
					break;
				}
			}
			System.out.printf("%d가 나올때까지 주사위를 %d번 굴렸습니다.\n",dice,count);
		}else if(menuNo == 3) {
			int[] list = new int[6];
			
			for(int i=0; i<count; i++) {
				int index = diceList[i] -1;
				list[index]++;
			}
			boolean isChecked = false;
			for(int i=0; i<list.length; i++) {
				if(list[i] <=1) continue;
				System.out.printf("%d은 %d번 나왔습니다.\n", i+1, list[i]);
				isChecked = true;
			}
			
		}else if(menuNo == 4) {
			
		}else if(menuNo == 5) {
			run = false;
			System.out.println("프로그램 종료");
		}else {
			System.out.println("메뉴 선택범위(1~5)를 벗어났습니다.");
			System.out.println("다시 번호를 입력하세요.");
		}
		

		}
	}
}
