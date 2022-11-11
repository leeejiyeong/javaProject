package com.yedam.java.example;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Bank[] Bary = null;
		
		System.out.println("회원의 수 >");
		int count = Integer.parseInt(sc.nextLine());
		Bary = new Bank[count];
		
		// 배열 크기 만큼 반복문을 실행
		// 회원 정보를 객체 담아서 배열에 저장
		for (int i = 0; i < Bary.length; i++) {

			// 빈 깡통
			Bank bank = new Bank(); // 1

			// 1. 계좌 번호 입력
			System.out.println("계좌 번호 >");
			int account = Integer.parseInt(sc.nextLine());
			bank.setAccount(account);

			// 2. 은행 이름 입력
			System.out.println("은행 입력 >");
			String bName = sc.nextLine();
			bank.setBank(bName);

			// 3. 예금
			System.out.println("금액 설정 >");
			int money = Integer.parseInt(sc.nextLine());
			bank.setMoney(money);

			// 4. 고객 이름 입력
			System.out.println("고객 이름 >");
			String name = sc.nextLine();
			bank.setName(name);
			// ----------------------------------------
			// bank 객체 ( 계좌번호, 은행이름, 예금, 고객 이름)
			Bary[i] = bank;
		}
		
		for (int i = 0; i < Bary.length; i++) {
			Bary[i].getInfo();
		}
	}
}