package com.yedam.java.ch0402;

import java.util.Scanner;

public class PracticeBalance {

	public static void main(String[] args) {
		//책 p.161 7번
		
		boolean run =  true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("=================================");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("=================================");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo ==1) {
				//메뉴 : 예금
				System.out.print("예금액> ");
				int money = Integer.parseInt(scanner.nextLine());
				balance += money;
			}else if(selectNo == 2) {
				//메뉴 : 출금
				System.out.print("출금액> ");
				int money = Integer.parseInt(scanner.nextLine());
				balance -= money;
			}else if(selectNo == 3) {
				//메뉴 : 잔고
				System.out.println("잔고> "+balance);
			}else if(selectNo == 4) {
				//메뉴 : 종료
				//break; =>되기는하는데 임의로 종료하는 거기 때문에 권장x,
				run = false;
			}else {
				//기타입력일경우
				System.out.println("정해진 메뉴(1~4)중에서 선택해주세요.");
			}
			
		}
		System.out.println("프로그램 종료");

	}

}
