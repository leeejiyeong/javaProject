package com.yedam.java.ch0501;

public class Practice {	
	public static void main(String[] args) {
		// 배열을 선언
		//값을 초기화하면서 배열을 생성 (변수를 선언하면서 바로사용)
		int [] scores = {83, 90, 87};
		System.out.println("scores[0]: "+ scores[0]);
		System.out.println("scores[1]: "+ scores[1]);
		System.out.println("scores[2]: "+ scores[2]);
		
		int sum =0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합:"+sum);
		double avg = sum /3;
		System.out.println("평균:"+avg);
		
		//주의사항 - 변수를 선언하고 나서 후에 사용하면 안된다. -> 이때는 new연산자 사용해야한다.
	}
}
