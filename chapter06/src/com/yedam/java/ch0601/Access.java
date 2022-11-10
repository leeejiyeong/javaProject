package com.yedam.java.ch0601;

public class Access {
	//대상 : 모든 속성, 필드, 메소드, 생성자 등등 자바의 모든 전부
	
	//public - 누구나, 어디서든 접근 가능함.
	//private : 내가 속한 클래스 내부에서만 사용가능
	//protected :  상속받은 상태에서 부모-자식간 사용가능(패키지 달라도 사용가능), 같은 패키지 내에서 사용가능.
	//default : 같은 패키지 내에서 사용 가능, 패키지가 다르면 사용 불가.
	
	
	//필드
	public String free;
	private String privacy;
	protected String parent;
	String basic; 	//(default)
	
	//생성자
	
	//메소드
	public void free() {
		System.out.println("접근 가능합니다.");
		privacy();	//privacy를 public으로 불러서 그 public을 불러오면 다른데서 사용가능.
	}
	private void privacy() {
		System.out.println("접근이 불가능합니다.");
	}
	
	
	
	
	
	
	
	
	
}
