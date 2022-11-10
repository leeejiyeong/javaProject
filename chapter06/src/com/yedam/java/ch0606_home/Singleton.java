package com.yedam.java.ch0606_home;

public class Singleton {	//여러번 만들필요없이 하나만 만들어서 쓴다는거
	//전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩기법
	//어떻게?
	//1. 객체 생성을 막는다.->private  2. 단 하나만 만들게 한다. ->getInstance
	//방법1) - 일단 메모리에 올리고 봄
	private static Singleton singleton = new Singleton();
							//singleton = new Singleton();
	//방법2) - 필요할때 메모리에 올리겠다.
	//private static Singleton singleton = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
		//singleton = new Singleton();	
		
		//방법2)
	//public static Singleton getInstance(){
//		if(singleton == null) {
//			return singleton = new Singleton();
//		}else {
//			return singleton
//		}
		//}
		
	}
	
	//싱글톤 사용방법 -  즐겨찾기처럼 자주쓰는 기능들을 정의해주면 된다.
	public void run() {
		System.out.println("싱글톤이 작동중입니다.");
	}
	
	public void connectDB() {
		System.out.println("데이터베이스를 연결합니다.");
	}
}
