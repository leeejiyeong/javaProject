package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {
		//부호연산자
		int a  = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("result : " + result1);
		System.out.println("result : " + result2);
		
		byte b = 100;
//		byte result3 = (byte)-b;	//그냥 -b쓰면 에러남.(연산 결과는 int이기 때문) 정 쓰고 싶으면 앞에 casting괄호 붙여줘야함
		int result3 = -b;
		System.out.println("result3 :" + result3);
				
		//증감연산자 
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------------");
		x++;	// => 11
		++x;	// => 12
		System.out.println("x = " + x);
		
		System.out.println("--------------------------");
		y--;	// 9
		--y;	// 8
		System.out.println("y = " + y);
		
		System.out.println("--------------------------");
		z = x++;
		System.out.println("z = " + z);	//12	++이 뒤에 있으니까 대입연산자부터 연산하기때문에 z=x 먼저 대입되고 그다음에 +1을 더하기 때문에 z는 일단 12 가 되는것
		System.out.println("x = " + x);	//13	대입연산자를 연산한 후에 x를 물어보면 ++이 됐기 때문에 13이 되는것
		
		System.out.println("--------------------------");
		z = ++x;
		System.out.println("z = " + z);	// 14	++이 앞에 있으므로 먼저 1을 더한 14를 z에 대입하는거라서 z=14
		System.out.println("x = " + x);	// 14	
		
		System.out.println("--------------------------");
		z = ++x + y++;
		System.out.println("z =" + z);	//23	x는 앞에 ++이 있으니까 1 더한 15, y는 뒤에++가 있으니까 그냥 8, x+y 하면 23, 그 이후에 y에서 -1 하면 y=9
		System.out.println("x =" + x);	//15	
		System.out.println("y =" + y);	//9
		
		// 1) ++x =>15
		// 3) x + y	=> 15 + 8 => 23
		// 2) y++	<=얘가 문제, ++가 뒤에있기 때문에 밑에있는 +와 순서가 바뀜 =>8에서 증가가 되니느거니까 9
		// 4) =대입연산자가 마지막 => z = (x+y) => z = 23
		
		/***/
		
		x = 5;
		y = 5;
		
		System.out.println("--------------------------");
		z = x++ + --y;
		System.out.println("z =" + z);	// 9	x는 ++이 뒤에 있으니까 일단 그냥 5, y는 앞에--가 있으니까 4, x+y 하면 9, 그리고 x에 1 더해줘서 x는 6
		System.out.println("x =" + x);	//6
		System.out.println("y =" + y);	//4
		
		// 2) --y => 4
		// 3) x+y	=> 5+4 =>9
		// 1) x++	=> 6  => 대입연산자 앞까지 밀려남
		// 4) z=x+y 대입연산자는 무조건 마지막.	=>9
		
		System.out.println("--------------------------");
		z = --x + y++;
		System.out.println("z =" + z);	// 9	x는 앞에 --가 있으니까 5, y는 뒤에 ++이 있으니까 일단 그냥 4, x+y하면 9, 그리고 y에 1 더해줘서 5
		System.out.println("x =" + x);	// 5
		System.out.println("y =" + y);	// 5
		
		// 1) --x 	=> 5
		// 3) x + y	 => 5+4
		// 2) y++	=>5
		// 4) =		=>9
		
		//논리 부정 연산자
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);	//true를 부정 -> false
		
		play = !play;
		System.out.println(play);	//false된거를 다시 부정 -> true
		
		boolean isOpen = true;
		
		if(!isOpen) {
			System.out.println("영업시간이 종료되었습니다.");
		}else {
			System.out.println("영업 중입니다.");
		}
		System.out.println("--------------------------");
		//산술 연산자
		
		int v1 = 5;
		int v2 = 2;
		int result;
		
		result = v1 + v2;
		System.out.println("result:" + result);
		
		result = v1 - v2;
		System.out.println("result:" + result);
		
		result = v1 * v2;
		System.out.println("result:" + result);
		
		result = v1 / v2;
		System.out.println("result:" + result);
		
		result = v1 % v2;
		System.out.println("result:" + result);
		
		System.out.println("--------------------------");
		
		//비교 연산자
		int num1 = 10;
		int num2 = 10;
		boolean bResult;
		
		bResult = ( num1 >= num2 );
		System.out.println(">= : " + bResult);
		
		bResult = (num1 == num2);
		System.out.println("== : " + bResult);
		
		bResult = (num1 != num2);
		System.out.println("!= : " + bResult);		//==와 !=는 값이 반대로 나올수밖에 없다. 같을수 없음
		
		char char1 = 'A';	//65
		char char2 = 'B';	//66
		System.out.println("문자 비교 : "+(char1 > char2));
		
		int v3 = 1;
		double v4 = 1.0;
		System.out.println("int VS double : " +(v3 == v4));
		
		float v5 = 0.1F;
		double v6 = 0.1;
		System.out.println("float VS double : "+ (v5 == v6));	//왜다름? =>인식하는 정밀도가 달라서 그럼
		//사람이 보기에 같아도 자바가 생각하는 값은 다를수가 있다.
		//정수는 상관없는데 실수는 차이난다.
		
		System.out.println("float VS float : " + (v5 ==(float)v6));		//비교때는 동일한 타입으로 바꾸고 하는게 좋다.
		
		System.out.println("--------------------------");
		
		//논리 연산자
		int charCode = 'A';		//int가 char타입보다 크기 때문에 가능함
		
		//유니코드 중 65보다 크거나 같고 90보다 작거나 같으면 대문자
		if((charCode >= 65) && (charCode <= 90)) {		//&는 하나쓰나 두개쓰나 차이없음. 하지만 두개를 자주쓴다.
			System.out.println("대문자");					//역할 자체는 같지만 &는 앞뒤 둘다 true 여야 true고, &&는 앞만 true면 true가 나옴.
		}
		
		//유니코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자
		if((charCode >= 97) & (charCode <= 122)) {
			System.out.println("소문자");
		}
		
		//유니코드 중 48보다 크고 57 보다 작으면 숫자 0~9
		if((charCode > 48) && (charCode < 57)) {
			System.out.println("숫자 0~9");
		}
		
		int numValue = 6;
		
		if((numValue % 2 == 0) | (numValue % 3 == 0)){		//|가 한개면 앞에가 true면 몽땅 true(&&랑 반대임)
			System.out.println("2 또는 3의 배수군요.");
		}
		
		if((numValue % 2 == 0) || (numValue % 3 == 0)){
			System.out.println("2 또는 3의 배수군요.");
		}
		
		//복합 대입 연산자
		int resultA = 0;
		resultA += 10;	//resultA = resultA + 10
		System.out.println("+= : "+ resultA);
		
		resultA -= 5;	//resultA = resultA - 5
		System.out.println("-= : "+ resultA);
		
		resultA *= 3;	//resultA = resultA * 3
		System.out.println("*= : "+ resultA);
		
		resultA /= 5;	//resultA = resultA / 5
		System.out.println("/= : "+ resultA);
		
		resultA %= 3;	//resultA = resultA % 3
		System.out.println("%= : "+ resultA);
		
		
		//삼항연산자 - ? : ;로 골격부터 맞춰놓고 적자
		int score = 85;
		char grade = (score> 90) ? 'A': 'B' ;
		System.out.printf("성적은 %d이고 등급은 %c 입니다.\n", score,grade); 		//%c : char타입에 대응되는거. %s가 더 넓은 개념이라 %s 써도 상관 없음.
		
		int age = 17;
		String message = (age >= 20)? "성인" : "미성년" ;
		System.out.printf("나이는 %d살이며 %s입니다.\n", age, message);
	}

}
