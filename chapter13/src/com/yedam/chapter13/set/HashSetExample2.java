package com.yedam.chapter13.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동", 30));	//100번지
		set.add(new Member("홍길동", 30));	//200번지로 서로 다른 번지수지만
		//내용이 같기 때문에 1개로 인식함.
		
		System.out.println("총 객체 수 : " + set.size());
		
	}
}
