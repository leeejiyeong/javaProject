package com.yedam.java.ch0401;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		//기본 IF문
		int score = 90;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");	
			System.out.println("등급은 A입니다.");
		}
		System.out.println("if문 상관없이 실행됩니다.");		//true일때 내부의 것만 추가 실행된다.
		
		if(score < 90) 
			System.out.println("점수가 90보다 작습니다.");		//한줄까지는 중괄호를 생략해도 if문으로 취급됨. 근데 한줄 넘어가면 그냥 문장으로 취급
			System.out.println("등급은 B입니다.");				//그냥 중괄호로 묶어서 쓰도록 하자
		
		
		//if~else 문
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");	//하나의 조건문에 true와 false값을 다르게 주고싶다면 if else문이 적당하다
			System.out.println("등급은 A입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다.");		
			System.out.println("등급은 B입니다.");	
		}
		
		//if~else if~else 문
		if(score >= 90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score >=80) {		//score <90 && score>=80
			System.out.println("점수가 89~80입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score >= 70) {	//score <80 && score>70
			System.out.println("점수가 79~70입니다.");
			System.out.println("등급은 C입니다.");
		}else {		//score <70
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		
		/*	주사위 숫자 무작위 출력하기 (책 p.137)
		 1) 0.0 <= Math.random() < 1.0
		 2) 0.0 * 10 <= Math.random() * 10 < 1.0 * 10	(전부 10을 곱해서 1.xx..2.xx로 만들어준다. 근데 아직 실수임)
		 3) (int) 0 <= (int)(Math.random() *10) < (int)10	(정수가 필요하기 때문에 int 사용)
		 4) (int) 0 + 1 <= (int))(Math.random() * 10) + 1 < 10 + 1	(시작 숫자가 1이어야 하기 때문에 +1)
		 5) 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		 
		 -> (int)(Math.randon() * count) + start값
		 */
		
		int num = (int)(Math.random() * 6) + 1;
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		}else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		}else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		}else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		}else if (num == 6) {
			System.out.println("6번이 나왔습니다.");	//근데 똑같이 반복되는게 많아서 보기 불-편... -> 이럴때 switch문을 쓰면 편-안
		}
		
		//switch문
		num = (int)(Math.random() * 6) + 1;
		
		switch(num) {
		case 1:		//num == 1일때
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default : 
			System.out.println("6번이 나왔습니다.");
		}
		
		// break 문이 없는 case는 어떻게 될까? -> 선택된거에서 빠져나오지 않고 밑에것이 다 출력된다.
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재시각 : " + time + "시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
		
		//char 타입의 switch문 (break를 사용하지 않는경우도 있다. - 대소문자를 같은걸로 인식시키기 위해 묶어서 사용)
		//쇼핑몰 : 우수회원 - A, 일반회원 - B, 일반회원 - 손님
		char grade =  'B';
				
		switch (grade) {
			case 'A':
			case 'a':
				System.out.println("우수회원 입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반회원 입니다.");
				break;
			default:
				System.out.println("손님 입니다.");
		}
		
		//String 타입의 switch문
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
		
		
	}

}
