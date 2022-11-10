package com.yedam.java.ch0605_home;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("1234567-1234567","김자바");
		
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		System.out.println(p1.nation);
		
		//p1.nation = "usa";
		//p1.ssn = "1234455-1234588";	-> nation, ssn은 final함수로 고정되었기 때문에 따로 입력할수 없다.
		p1.name = "홍상수";
		
		System.out.println(p1.name);
	}
}
