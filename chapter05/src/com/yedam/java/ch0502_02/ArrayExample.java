package com.yedam.java.ch0502_02;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[][]	mathScores = new int[2][3];	//int배열을 값으로 가지고 있음. 뒤에있는게 int배열의 크기. 앞에있는건 그 int배열이 몇개인지
		
		for(int i=0; i<mathScores.length; i++) {
			System.out.println("인덱스 " + i + ">");
			int[] mathScore = mathScores[i];	//
			for(int j=0; j<mathScore.length; j++) {
				System.out.println("내부 배열 인덱스 "+j+ "> "+ mathScore[j]);
			}
		}
	}

}
