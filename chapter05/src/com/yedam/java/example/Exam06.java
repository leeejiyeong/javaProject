package com.yedam.java.example;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);	//ctrl + shift + o(영어)
		
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {	//반복문 안에선 switch문은 안쓰는게 좋다. 
			case 1:
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				break;
			case 2:
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]> ");
					int score = Integer.parseInt(sc.nextLine());
					scores[i] = score;
				}
				break;
			case 3:
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]);
				}
				break;
			case 4:
				int sum = 0;
				int max = scores[0];
				
				for(int i=0; i<scores.length; i++) {
					//최고점수
					if(max < scores[i]) {
						max = scores[i];
					}
					//총합
					sum += scores[i];
				}
				System.out.println("최고 점수 :" + max);
				System.out.println("평균 : " + (double)sum / scores.length);	//계산 결과는 항상 int이기 때문에 정확한 소숫점을 출력하려면 둘중 하나는 double써주자
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
				default:
					System.out.println("정해진 메뉴를 입력하지 않았습니다.");
					System.out.println("다시 입력하세요");
			}
		}
	}
}
