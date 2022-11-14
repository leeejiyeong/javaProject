package com.yedam.chapter11;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		
		//Key클래스 객체를 명확하게 가져오는 방법
		
		//1) 직접 클래스 가져오기
		Class clazz = Key.class;	
		System.out.println(clazz);
		
		//2) 경로를 통한 클래스 객체 가져오기
		Class clazz2  = Class.forName("com.yedam.chapter11.Key");
		System.out.println(clazz2);
		
		//3) 객체로부터 클래스 객체 얻기
		Key key = new Key(1);
		
		Class clazz3 = key.getClass();
		System.out.println(clazz3);
		
		String photoPath = clazz.getResource("loopy.jpg").getPath();
		System.out.println(photoPath);
		
		
		
	}
}
