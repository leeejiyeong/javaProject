package com.yedam.chapter0701;

public class Application {
	public static void main(String[] args) {
		Child child = new Child();
		
//		//자식 클래스 고유 필드
//		child.lastName = "paul";
//		child.age = 20;
//		
//		//부모 클래스 필드
//		System.out.println(child.firstName + child.lastName);
//		
////		System.out.println(child.job);	//private로 선언됐기 때문에 상속할수 없음.
//		
//		//주의할점
//		//부모 -> 여러명의 자식  ==> 가능o
//		//자식 -> 여러명의 부모	 ==> 가능x
//		System.out.println("===========================");
//		
//		DmbCellPhone dmb = new DmbCellPhone("고아라폰", "화이트", 10);
//		
//		//부모 클래스 필드 사용
//		System.out.println("모델 : " + dmb.model);
//		System.out.println("색상 : " + dmb.color);
//		
//		//자식 클래스 필드 사용
//		System.out.println("채널 : " + dmb.channel);
//		
//	
//		System.out.println("===========================");
//		
//		//부모 클래스 메소드 사용
//		dmb.powerOn();
//		dmb.sendVoice("안녕하세요");
//		dmb.receiveVoice("안녕하세요 전 김또치 입니다.");
//		dmb.powerOff();
//		
//		//자식 클래스 메소드 사용
//		dmb.turnOnDmb();
//		
//		System.out.println("===========================");
//		
//		Member member = new Member("고길동","123456-1234567");
//		
//		//부모 객체의 필드 사용
//		System.out.println("name : " + member.name);
//		System.out.println("ssn : " + member.ssn);
//		
//		//자식 객체의 필드 사용
//		System.out.println("memberNo : " + member.stdNo);
		
//		System.out.println("===========================");
//		
//		Child cd = new Child();
//		
//		cd.method1();
//		cd.method2();
//		cd.method3();
//		
//		System.out.println("===========================");
//		
//		Compute com = new Compute();
//		double result = com.areaCircle(10);
//		System.out.println("result : " + result);
//		
//		System.out.println("===========================");
//		
//		SupersonicAirPlane sa = new SupersonicAirPlane();
//		
//		sa.takeOff();	//부모클래스에서 가져와서 쓰고
//		sa.fly();	//자식클래스에서 오버라이드 한거 가져와서 쓰고
//		
//		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
//		sa.fly();
//		
//		sa.flyMode = SupersonicAirPlane.NORMAL;
//		sa.fly();
//		
//		sa.land();	
//		
		System.out.println("===========================");
		
		Child chd = new Child();
		Parent parent = chd;
		//위에 두개를 한줄로 표현하면 Parent parent = new Child();
		//부모 클래스에 있는 필드, 메소드를 사용을 하되, 
		//만약 자식 클래스에 오버라이딩이 되어 있는 메소드가 존재 한다면
		//부모 클래스에 정의된 메소드를 사용하지 않고 자식 클래스에 있는 메소드를 사용하게 되는것.
		
		parent.method1();
		parent.method2();
//		parent.method3();	//부모타입만 쓸수있기 때문에 못씀
		
	}
}
