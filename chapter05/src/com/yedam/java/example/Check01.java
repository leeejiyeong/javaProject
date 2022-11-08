package com.yedam.java.example;

public class Check01 {

	public static void main(String[] args) {
		// 문제1) 주어진 배열의 총합과 평균을 구하세요.
		int[] array = {10, 53, 26, 85, 75};
		
		int sum =0;
		for(int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		
		double avg = sum / (double)array.length;	//둘다 int이기 때문에 하나는 반드시 double로 바꿔주자
		System.out.printf("배열 총합: %d, 배열 평균: %.2f\n", sum, avg);
		
		// 문제2) 배열의 최대값과 최소값을 구하세요.
		int aryMax = array[0];	//array[array.length-1]를 사용해도 된다.(인덱스 최대값)
		int aryMin = array[0];
		
		for(int i=0; i<array.length; i++) {
			//최대값
			if(array[i] > aryMax) {	//더 크면
				aryMax = array[i];	//그 값으로 덮어써버림
			} 
			//최소값
			if(array[i] < aryMin){
				aryMin = array[i];
			}
		}
		System.out.printf("최대값:%d, 최소값:%d\n",aryMax, aryMin);
		
		System.out.println("=============================");
		
		// 문제3) 문제2에서 구한 최대값과 최소값이 각각 몇번째 값인지 구하세요.
		int maxindex = 0;
		int minindex = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] == aryMax) {
				maxindex = i;
			}
			if(array[i] == aryMin) {
				minindex = i;
			}
		}
		System.out.printf("최대값 %d는 %d번째 입니다.\n", aryMax, maxindex+1);
		System.out.printf("최소값 %d는 %d번째 입니다.\n", aryMin, minindex+1);
	}

}
