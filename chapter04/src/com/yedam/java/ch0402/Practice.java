package com.yedam.java.ch0402;

public class Practice {
	public static void main(String[] args) {
		
		//while
		// 주사위 두개를 굴립니다. 합이 3이 될때까지 계속 굴리는 경우.
		
		while(true) {
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			System.out.println(a + "," +b);
			if(a+b ==3) {
			System.out.println(a + "," +b);
			break;
			}
		}
		
		// 문제1) 책 p.161 5번
				// for문을 이용해서 다음과 같이 *를 출력하는 코드
				// *
				// **
				// ***
				// ****
				// *****
		String str = "";
		for(int i=1; i<6; i++) {
			str +="*";
			System.out.println(str);
		}
		
		for(int i=1; i<6; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//     *
		//    **
		//   ***
		//  ****
		// *****
		String star = "";
		for(int i=1; i<6; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			System.out.println(star+="*");
		}
		
		
	}
}

