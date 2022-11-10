package com.yedam.java.ch06;

public class Shoes {
	static int totalCount;
	int running;
	int slipper;
	int mule;
	
	void makeRunning() {
		running +=1;
	}
	void makeSlipper() {
		slipper +=1;
	}
	void makeMule() {
		mule +=1;
	}
	
	//총 몇켤레 만들었는지 확인하는 메소드
	void getCount() {
		totalCount = running + slipper + mule;
	}
}
