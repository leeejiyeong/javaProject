package com.yedam.chapter11_hw;

import java.util.Scanner;

public class Assignment {
	
	public static void main(String[] args) {
		
	/* 	
	 * 문자열을 활용한 문제
		1) 문자열 뒤집기
		- 입력되는 문자열을 뒤집어서 출력
		ex) input : abc, output : cba

		2) 문자열 개수 세기
		- 아스키 코드 이용
		- 입력되는 문자열에서 알파벳과 숫자의 갯수를 구하기
		ex) input : 1a2v4b , output : 숫자 3개, 영어 3개

		3) 입력한 생년월일 6자리를 입력하였을 경우 만 나이를 구하는 프로그램 작성
		- 조건 -
		금년 기준으로 100년이 넘어간 경우는 제외 한다. 또한 생일은 신경쓰지 않는다.
		(221114 -> 1922년 11월 14일 X , 2022년 11월 14일 O)
		ex) input : 000510, output : 21살
	 */

		// 1번 - 뒤집기
		
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		
//		for(int i=(str.length()-1);i>=0; i--) {
//			System.out.print(str.charAt(i));
//		}
		
		//2번 - 갯수 세기
		//48~57:숫자, 65~90:대문자, 97~122:소문자
//		String str2 = sc.nextLine();
//		int numCount = 0;
//		int strCount = 0;
//		for(int i=0; i<str2.length(); i++) {
//			if(str2.charAt(i)>=48 && str2.charAt(i)<=57) {
//				numCount++;
//			}else if(str2.charAt(i)>=65 && str2.charAt(i)<=90) {
//				strCount++;
//			}else if(str2.charAt(i)>=97 && str2.charAt(i)<=122) {
//				strCount++;
//			}
//		}
//		System.out.println("숫자 : " + numCount);
//		System.out.println("문자 : " + strCount);
		
		//3번 - 만나이 구하기
		String str3 =  sc.nextLine();
		
		String bornYr = str3.substring(0,2);
		int by = Integer.parseInt(bornYr);
		if(122-by>=100) {
			System.out.println("만나이 :" + (122-by-101));
		}else if(122-by<100) {
			System.out.println("만나이 : "+ (122-by));
		}
		
		
		
		
		
		
		
		

	}

}