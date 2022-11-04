package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		//byte타입
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 127;
		byte var4 = 0;
//		byte var5 = 128;
		System.out.println(var1);
//		System.out.println(var5);
		
		long var6 = 10000000000L;
		long var7 = 1000000;
		
		//char타입
		
		char v1 = 65;
		char v2 = '가';
		int v3 = v1;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		// string 
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(job);
		System.out.println(job.charAt(3));
		
		// char VS String
		char v4 = 'A';
		
		float num1 = 3.14F;
		double num2 = 3.14;
		
		float varF = 0.123456789123456789F;
		double varD = 0.123456789123456789;
	
		System.out.println(varF);
		System.out.println(varD);
		
		//boolean
		
		boolean  stop = (1 >2);
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
				
	}

}
