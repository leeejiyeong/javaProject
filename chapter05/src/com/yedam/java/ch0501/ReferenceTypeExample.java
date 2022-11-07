package com.yedam.java.ch0501;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		// null과 nullPointerException
		String str = null;
//		System.out.println("길이 : " + str.length());
		
		//String(문자열) 비교
		String strVar1 = "신미철";
		String strVar2 = "신미철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVal1과 strVal2는 참조가 같음");		
			}else {
			System.out.println("strVal1과 strVal2는 참조가 다름");
		}
		if(strVar1.equals(strVar2)){
			System.out.println("strVal1과 strVal2는 문자열이 같음");
		}
		System.out.println("============================================");
		
		String strVar3 = new String("신미철");	//기존에 있던 없던 무조건 새로만듬
		String strVar4 = new String("신미철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVal3과 strVal4는 참조가 같음");		//객체는 다르지만 값자체는 같은경우
			}else {
			System.out.println("strVal3과 strVal4는 참조가 다름");
			}
		if(strVar3.equals(strVar4)) {	//객체를 까고 들어가서 실제로 가지고 있는값이 같은지 아닌지를 비교함
			System.out.println("strVal3과 strVal4는 문자열이 같음");
		}
	
	}
}
