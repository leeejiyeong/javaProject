package com.yedam.java.ch06;

public class Game {
	//필드
	//객체로 만든다(인스턴스화 된다.)
	//=인스턴스 필드
	static String gameName = "마인크래프트";
	String server = "한국";
	String id;
	String passWd;
	
	//생성자
	//생성자 오버로딩 - 원래 생성자 이름 같은거 못쓰는데 매개변수를 다르게 해주면 같은이름 여러개 사용 가능.
	public Game() {
		
	}
	
	public Game(String id) {
		this.id = id;
	}	
	
	public Game(String id, String passWd) {	//매개변수 갯수가 다름
		this.id = id;
		this.passWd = passWd;
	}
	
	//메소드
	//인스턴스 메소드
	void getInfo() {
		System.out.println("GameName : " + gameName);
		System.out.println("id : " + id);
		System.out.println("password : " + passWd);
	}
	//메소드 오버로딩
	void getInfo(String temp) {
		
	}
	
	
	
	
	
	
	
	
}
