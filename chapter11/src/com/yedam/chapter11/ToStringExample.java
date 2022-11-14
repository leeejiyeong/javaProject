package com.yedam.chapter11;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		
		Object obj = new Object();
		
		System.out.println(obj.toString());
		
		Date obj2 = new Date();		//ctrl + shift + o -> java.util.Date;
		
		System.out.println(obj2.toString());
	}
}
