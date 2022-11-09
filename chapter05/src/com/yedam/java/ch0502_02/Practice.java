package com.yedam.java.ch0502_02;

public class Practice {	
	public static void main(String[] args) {
		//책 p.200 문제 4번 - 최대값 구하기
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		System.out.println("max : " + max);
		
		
		//책 p.200 문제 5번 - 배열 전체항목의 합과 평균 구하기
		int[][] ary = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0; 		//count변수를 사용하는이유? 평균으로 나눌라면 배열의 총 갯수를 알아야되는데
		
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				sum += ary[i][j];
				count++;
//				int count = ary[i].length * ary[j].length; //for문 안에서 이렇게 쓰면 count가 for문 밖으로 나가면 변수가 사라져서 못쓴다
			}
		}
															//그렇다고 for문 밖에서 구하자니 인덱스값 i, j를 사용하지 못함. => 그래서 count사용하는것
		avg = (double)sum / count;
				
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
