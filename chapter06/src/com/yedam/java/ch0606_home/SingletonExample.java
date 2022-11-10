package com.yedam.java.ch0606_home;

public class SingletonExample {
	public static void main(String[] args) {
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
	}
}
