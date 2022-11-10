package com.yedam.java.ch0601;

//import 강제등록 -> 경로 직접쓰기
//import com.yedam.java.ch0604.Computer;

//import 간편등록 -> 생성자 만들어놓고 오류생기면 shift + ctrl + o 눌러서 고르기



public class Application {
	
	
	//필드
	int staticTest = 0;
	
	
	public static void main(String[] args) {
		
		Application ap = new Application();
		//staticTest  = 1; (x)
		ap.staticTest  = 1;		//쓰고싶으면 내자신을 인스턴스화(객체로 만듬)하고나서 사용
		Shoes shoes = new Shoes();
		
		shoes.makeRunning();
		shoes.makeSlipper();
		shoes.makeMule();
		shoes.getCount();
		
		System.out.println(shoes.totalCount);
		
		ConstantNo csno = new ConstantNo();
		System.out.println(csno.word);
		System.out.println(csno.words);
		
		System.out.println(ConstantNo.EARTH_ROUND);	//static필드는 어디에서나 불러와서(객체 안만들어도) 쓸수있다.
		
		//은행 고객 정보를 관리하는 클래스
		//1)main 2)Customer 3)Bank
		//1)main-> 생성자를 통한 고객의 정보를 저장, 출력
		//2)Bank -> 해당 은행의 금리를 저장
		//	현재잔액 + (현재잔액*금리)
		//3)Customer -> 고객의 정보를 저장
		//이름, 은행명, 계좌, 잔액에 대한 필드
		//getInfo() 메소드를 통해서 입력한 정보를 출력
		//withDraw():출금 할때 정보를 출력
		
		Access access = new Access();
		
		//1)public
		access.free = "public";
		access.free();
		
		//2)private
//		access.privacy = "privacy"; -> 외부에서 접근 불가
//		access.privacy();
		
		//3)protected
		access.parent = "parent";
		
		//4)default
		access.basic = "basic";
		
						//singleton == new Singleton()
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//두개는 같다.
		
		//진짜 같은지 위치 확인해본다.
		System.out.println(s1);
		System.out.println(s2);
		
		s1.run();
		s1.connectDB();
		
		//singleton == new Singleton()
		//getInstance() == singleton == new Singleton()
		//getInstance() == new Singleton()
		//(3단논법이라 보면됨)
		
		Member mem = new Member();
		
		//1) mem의 인스턴스 필드에 접근 가능한지 확인
		//2) setter, getter로 데이터 입력 및 출력
		mem.setId("yedam");
		mem.setTel("010-1234-1234");
		mem.setAge(10);
		
		System.out.println("ID : " + mem.getId());
		System.out.println("Tel : " + mem.getTel());
		System.out.println("Age : " + mem.getAge());
		
		
		 
		
		
		
		
		
		
		
		
	}
}
