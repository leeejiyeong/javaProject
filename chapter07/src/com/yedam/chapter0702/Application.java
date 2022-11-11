package com.yedam.chapter0702;

public class Application {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemTire = car.run();	//car메소드에서 적었던 if문 -> 문제있는 타이어 번호를 알려줌
			
			switch(problemTire) {
			case 0:
				System.out.println("4짝이 다 멀쩡합니다.");
				break;
			case 1:
				System.out.println("왼쪽앞바퀴 HankookTire로 교체");
				//frontLeftTire -> Tire
				//frontLeftTire가 펑크나면 자식클래스인 hankook타이어로 교체
				//부모클래스에서 오버라이딩 한 내용을 바꿔끼우게 되는것
				//자동타입변환이 있어서 가능한 일.
				//HankookTire Tire = newHankookTire("왼쪽앞바퀴", 15);
				//car.frontLeftTire = tire
				//위에 두줄이 밑에 한줄이랑 같은거임
				
				car.frontLeftTire = new HankookTire("왼쪽앞바퀴", 15);		//★★★★
				break;
			case 2:
				System.out.println("오른쪽앞바퀴 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("오른쪽앞바퀴", 13);
				break;
			case 3:
				System.out.println("왼쪽뒷바퀴 HankookTire로 교체");
				car.backLeftTire = new HankookTire("왼쪽뒷바퀴",14);
				break;
			case 4:
				System.out.println("오른쪽뒷바퀴 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("오른쪽뒷바퀴", 17);
				break;
			
			}
			System.out.println("------------------------");
		}
	}
}
