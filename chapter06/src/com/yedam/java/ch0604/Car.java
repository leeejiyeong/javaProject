package com.yedam.java.ch0604;

public class Car {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(this.gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;	//return이 있으면 해당 메서드가 종료되기 때문에 굳이 else를 쓸 필요가 없다.
		}
		
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(this.isLeftGas()) {	//this.gas>0이랑 같다.
				System.out.println("달립니다.(gas 잔량 : "+this.gas+")");
				this.gas--;
			}else {
				System.out.println("멈춥니다.(gas 잔량 : "+this.gas+")");
				return;
			}
		}
	}
	
}
