package com.yedam.java.ch0503;

import java.util.Calendar;

public class EnumExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();	 //달력 가져옴
		int week = cal.get(Calendar.DAY_OF_WEEK);	//요일정보 가져옴
		
		switch(week) {	//1이 일요일
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일 :"+today);
		if(today == Week.SUNDAY) {
			System.out.println("오늘은 먹터디를 갑니다.");
		}else {
			System.out.println("오늘은...");
		}
		
		
	}
}
