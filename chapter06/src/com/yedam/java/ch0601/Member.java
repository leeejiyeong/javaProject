package com.yedam.java.ch0601;

public class Member {
	
	//필드 -  다 private면 값을 어케 넣냐? -> 1 생성자를 통해서 넣거나, 2 getter setter통해서 넣거나
	private String id;
	private String tel;
	private int age;		//우클릭 -> source -> generate getter setter하면 자동생성
	
	//생성자
	
	
	//메소드
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//private String id;
	public String getId() {
		//원본 데이터(yedam)
		//yedam님 입니다.
		//id +="님 입니다.";
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {	//나이는 0보다 적을수가 없음.
		if(age<=0) {
			System.out.println("0보다 적은 나이가 저장되었습니다. 다시 확인하세요.");
			return;
		}else {
			this.age = age;
		}
		this.age = age;
	}
	
	
}
