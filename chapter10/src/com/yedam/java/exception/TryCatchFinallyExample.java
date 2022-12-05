package com.yedam.java.exception;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result1 = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result1);
			
			//throw new NullPointerException();
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 시키는 경우 값이 2개이상 필요합니다.");
		}catch(NumberFormatException e){
			System.out.println("실행 시키는 경우 숫자가 입력되어야 합니다.");
		}catch(Exception e){
			System.out.println("기타　예외가　발생했습니다.");
		}finally {
			System.out.println("다시 실행하세요.");
		}
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("=====================");
			e.printStackTrace();	//default
		}
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class Clazz = Class.forName("java.lang.String2");	
		//forname메소드자체에 throws가 걸려있기 때문에 throws를 하던가 try catch를 사용하던가 해야한다.
	}
}
