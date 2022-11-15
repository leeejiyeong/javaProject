package com.yedam.chapter13.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		//List<E> list2 = new ArrayList<>();		//String쓰면 String밖에 못쓰는데 E를 쓰면 다양하게 쓸수있다.제너릭(?). 매개변수 다형성 처럼..
		
		//객체 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");	//얘는 3번으로 밀림
		list.add(2, "DataBase");	//2번에 있는애를 밀어내고 거기 들어감
		list.add("iBATIS");
		
		//배열 list.length와 같은 개념
		int size = list.size();		
		System.out.println("총 객체수 : " + size);
		System.out.println("-----------");
		
		//skill = list[2]
		String skill = list.get(2);
		System.out.println("2 : " + skill + "\n");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		System.out.println("------------");
		
		list.remove(2);
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println("------------");
		
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println("---------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
