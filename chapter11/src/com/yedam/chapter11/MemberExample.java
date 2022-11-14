package com.yedam.chapter11;

import java.util.HashMap;

public class MemberExample {
	public static void main(String[] args) {
		//객체 동등 비교 조건 -> 값이 같다 or 다르다
		//강제타입변환
		//Object -> 여러클래스
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등");
		}else {
			System.out.println("obj1과 obj2는 같지않음");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등");
		}else {
			System.out.println("obj1과 obj3는 같지않음");
			
			HashMap<Member, String>member = new HashMap<>();
			//new Member("1") -> 주소가 "1"의 10이고, 해쉬코드 1
			
			member.put(new Member("1"),"홍길동");
			//new Member("1") -> 주소가 "1"의 10이고, 해쉬코드 1
			String value = member.get(new Member("1"));
			 System.out.println(value);
			
		}
	}
}
