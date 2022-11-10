package com.yedam.java.ch0606_home;

public class AccessExample {
	public static void main(String[] args) {
		
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
	}
}
