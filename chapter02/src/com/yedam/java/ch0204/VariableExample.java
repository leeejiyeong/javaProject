package com.yedam.java.ch0204;

import java.util.Scanner;

public class VariableExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);

		double area = 3.14149 * 10 * 10;
		System.out.println(area);
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		
		Scanner sc = new Scanner(System.in);
		
//		String str = sc.nextLine();  //nextLine은 엔터까지 읽어들이기 때문에 next랑 같이 못쓴다
		
		/*
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("입력 : "+ (x+y));
		*/
		
		/*
		System.out.print("첫번째 : ");
		String x = sc.nextLine();
		System.out.print("두번째 : ");
		String y = sc.hasNextLine();
		int result = Integar.parseInt(x) + Interger.parseInt(y);
		System.out.println("결과 : ");
		*/
		
		String inputData;
		
		while(true) {
			inputData = sc.nextLine();
			System.out.printf("입력된 문자열: %s\n", inputData);
			if(inputData.equals("exit")) {
				break;
			}
		}
		System.out.println("종료");
	}

}
