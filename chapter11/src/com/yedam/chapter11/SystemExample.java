package com.yedam.chapter11;

public class SystemExample {
	public static void main(String[] args) {
//		// System.exit()
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//			if (i == 5) {
//				System.exit(0);		//얘 만나면 프로그램 종료됨. 왠만하면 안쓰는게 좋다. 강제종료를 해야할 경우는 거의 없기 때문.
//			}
//		}
//		System.out.println("프로그램 종료");

		// 현재시각 읽기
		long time1 = System.nanoTime(); // 시작. 컴퓨터 시간 읽어오는거

		int sum = 0;
		for (int i = 1; i <= 100000; i++) {
			sum += 1;
		}

		long time2 = System.nanoTime(); // 한번더쓰면 끝

		System.out.println("sum : " + sum);
		System.out.println("계산시간 : " + (time2 - time1) + "나노 초(s)가 소요됨.");
		
		long time3 = System.currentTimeMillis();		//현재시간 읽어오는거 - 시간은 지나면 돌아오지 않는다. 그래서 절대 중복되는 데이터가 나올수 없음.
		System.out.println(time3);

	}
}
