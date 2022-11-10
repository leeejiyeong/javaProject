package com.yedam.java.bank;

import java.util.Scanner;

public class MainBankExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String confirm;		//출금할때 쓰는 변수 선언
		
		Customer customer = new Customer("고길동", "농협", 123456888, 1000000);
		
		customer.getInfo();		//customer안에있는 인스턴스 출력
		
		customer.withDraw();
		System.out.println("출금 하시겠습니까? Y/N");
		
		confirm = sc.nextLine();
		if(confirm.toLowerCase().equals("y")) {	//넣은문자 다 소문자로 바꾸고 y랑 같으면
			
			System.out.println("출금 완료");
			
		} else {
			System.out.println("시스템 종료");
		}
	}

}
