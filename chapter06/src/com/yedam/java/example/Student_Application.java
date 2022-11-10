package com.yedam.java.example;

import java.util.Scanner;

public class Student_Application {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총 입력할 학생 수 > ");
		int count = Integer.parseInt(sc.nextLine());
		Student[] sAry = new Student[count];
		
		for(int i=0; i<sAry.length; i++) {
			Student stu = new Student();
			
			System.out.println("이름 입력 > ");
			String sName = sc.nextLine();
			stu.setsName(sName);
			
			System.out.println("번호 입력 > ");
			String sNo = sc.nextLine();
			stu.setNo(sNo);
			
			System.out.println("국어 성적 > ");
			int kor = Integer.parseInt(sc.nextLine());
			stu.setKor(kor);
			
			System.out.println("수학 성적 > ");
			int math = Integer.parseInt(sc.nextLine());
			stu.setMath(math);
			
			System.out.println("영어 성적 > ");
			int eng = Integer.parseInt(sc.nextLine());
			stu.setEng(eng);
			
			sAry[i] = stu;
		}
		//방법1)
		for(int i=0; i<sAry.length; i++) {
			sAry[i].getInfo();
		}
		
		//방법2) - get을 이용
		/*
		for(int i=0; i<sAry.length; i++) {
			System.out.println("이름 입력 > " + sAry[i].getsName());
			System.out.println("학번 입력 > " + sAry[i].getsNo());
			System.out.println("국어 입력 > " + sAry[i].getKor());
			System.out.println("수학 입력 > " + sAry[i].getMath());
			System.out.println("영어 입력 > " + sAry[i].getEng());
			//..불러올거 다 적어주면됨
		}
		*/
	}
}
