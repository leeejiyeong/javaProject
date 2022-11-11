package com.yedam.chapter0701;

public class DmbCellPhone extends CellPhone{
	//필드
	public int channel;
	
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		//super();생략되어있음
		this.model = model;		//얘네
		this.color = color;		//얘네 두개는 부모필드에서 가져와서 쓰고있다.	
		
		this.channel = channel;		//얘는 자식 필드
	}
	//메소드
	void turnOnDmb() {
		System.out.println("채널 : " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
}
