package com.yedam.chapter11;

import java.io.UnsupportedEncodingException;

public class StringExample {

	// String에 대하여

	// String a = "1"; //100번지
	// String c = "1"; //100번지
	// String b = new String("1"); 200번지 - new연산자로 만들면 다른 주소에 데이터가 드감.

	public static void main(String[] args) {

		// 바이트 -> 문자열
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		// 배열 전체를 String 객체로 생성
		String str1 = new String(bytes);
		System.out.println(str1);

		// String str2 = new String(바이트 배열, 시작점, 갯수);
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);

		// String 메소드
		// 1) charAt(int index) - 특정 문자 위치를 반환

		String ssn = "123456-1890123";
		char sex = ssn.charAt(7);

		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}

		// 문자열 비교
		// equals()사용
		String strVar1 = new String("자바");
		String strVar2 = "자바";
		String strVar3 = "자바";

		// 주소를 비교
		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}

		if (strVar1.equals(strVar3)) {
			System.out.println("같은 문자열 가짐");
		} else {
			System.out.println("다른 문자열 가짐");
		}

		// 바이트 배열로 변환(한글자씩 쪼개기)
		byte[] bytes2 = null;
		String str = "안녕하세요";
		bytes2 = str.getBytes();

		System.out.println(bytes2.length);

		String str3 = new String(bytes2);
		System.out.println("bytes2 -> String : " + str3);

		try {
			byte[] bytes3 = str.getBytes("EUC-KR");
			System.out.println("bytes3.length : " + bytes3.length);

			String str4 = new String(bytes3, "EUC-KR");
			System.out.println("bytes3 -> String : " + str4);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// 문자열 찾기
		String subject = "자바 프로그래밍";

		int index = subject.indexOf("프로그래밍");
		System.out.println(index);

		index = subject.indexOf("a");
		System.out.println(index); // 안들어가있는 문자 있으면 -1나옴

		// 문자열의 문자 개수 얻기
		System.out.println(subject.length());

		// 문자열 대체
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "java");

		// java 프로그래밍
		System.out.println(newStr);

		// oldStr = "자바"; //100번지
		// oldStr += "프로그래밍"; //200번지
		// oldStr += "재밌당"; //300번지 => 계속 새로 만들어져서 각각 메모리를 차지하게된다.
		// 그럼 과부하 될수도 있음->해결책은? ↓

		// (책에없음)StringBuilder 또는 buffer(임시 저장소)
		StringBuilder sb = new StringBuilder();
		StringBuffer sb2 = new StringBuffer();

		sb.append("자바 "); // 500번지
		sb.append("프로그래밍 "); // 500번지
		sb.append("재미..있..다.."); // 500번지 로 번지수가 같다.

		System.out.println(sb);

		// 대소문자 바꾸기
		String strVal = "holooloolooolooloo";
		String strVal2 = "WALALLALLLALLALLLAL";

		System.out.println(strVal.toUpperCase());
		System.out.println(strVal2.toLowerCase());

		// trim
		String strTrim = "     자바        ";
		System.out.println(strTrim);
		System.out.println(strTrim.trim());
		
		//substring(문자열 자르기)
		//substring(index, end) - index부터 end번호까지 짜르세요
		//substring(index) - index부터 끝까지 짜르세요
		
		String ssn2 = "880815-1234567";
		
		String firstNum = ssn2.substring(0,6);
		String secondNum = ssn2.substring(7);
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		//(책에없음) split()
		String strSplit = "1-4-5-3-6-2-7-5-8";
		
		String[] strAry = strSplit.split("-");
		
		for(String temp:strAry) {
			System.out.println(temp);
		}
		
		//문자열 변환
		//숫자, 소수, 불리언 -> string으로 변환
		String strChng = String.valueOf(false);
		String strChng2 = String.valueOf(10);
		String strChng3 = String.valueOf(10.7);
		
		System.out.println(strChng);
		System.out.println(strChng2);
		System.out.println(strChng3);
 		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
