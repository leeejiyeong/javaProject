package com.yedam.exam;

import java.util.Scanner;

public class Exam05 {
	/* 메뉴1) 주사위크기(5~10)를 입력. 범위를 벗어날경우 범위안내 메시지 출력.	//=> 직접 입력해야 하므로 scanner사용해야함. 
	 * 메뉴2) 5가 나올때까지 주사위 몇번 굴리는지 구하고 출력					//=> while문 으로 돌리다가 if로 5일때 멈추게 해야함. 몇번 굴렸는지 셀려야 하니까 count도 필요함.
	 * 메뉴3) 메뉴2에서 각 주사위별로 몇번씩 나왔는지 출력					//=> 이미 계산끝나고 나온걸 출력하는거기 때문에 for문을 이용하여 인덱스와 값을 단순 출력하면됨
	 * 메뉴4) 메뉴2에서 가장 많이 나온 수가 몇인지 구하고 출력.				//=> 배열 값 중에서 최대값과 횟수를 구하면됨.
	 * 메뉴5) 프로그램 종료
	 */															//==> 이걸 숫자 넣을때 마다 반복해야 하기 때문에 while문으로 반복 실행되게 해야함.
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		int[] dice = null;	//주사위의 각 숫자별로 몇번씩 나왔는지 기록하는 용도.
							//index는 웬만하면 변동x	-> index는 주사위의 각 숫자
							//대신 각 index별로 가지는 값은 변동o
							//index의 각 값은 주사위의 각 숫자가 가지는 횟수		//=>빈 배열을 줘놓고 2.주사위 굴리기를 하면  그 숫자들로 채워지게 해야함.
		int size = 0;
		
		while(run) {
			System.out.println("=== 1.주사위 크기 2.주사위굴리기 3.결과보기 4. 가장 많이 나온 수 5.종료 ===");
			System.out.println("메뉴 > ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {		//주사위 크기 입력		
				System.out.print("주사위 크기 > ");
				size = Integer.parseInt(sc.nextLine()); 		//=> 변수'size'는 메뉴2번 if문에서도 사용해야 하기 때문에 while문 밖에다가 초기화를 시켜주자.
				if (size>=5 && size<=10) {
					dice = new int[size];						//=> 길이가 'size'인(사용자가 입력한 값) 배열을 new 연산자로 생성한다.
				}else {
					System.out.println("주사위 크기는 5~10사이만 가능합니다.");
					size = 0;
				}
			}else if(selectNo == 2) {		//주사위 굴리기 -> 주 기능
				int count = 0;										//횟수 헤아려야 되기 때문에 count 변수 주고 초기화 해줌.
				while(true) {	// index = num-1 , index+1 = num
					int num = (int)(Math.random()*size) +1;			
					count++;
					dice[num-1] = dice[num]+1;	//배열이 만들어지기만 했지 배열 내용은 빈칸이기 때문에 나오는걸 채워줘야한다.
												//num은 1~6(=사용자 지정숫자)까지의 수이기 때문에 인덱스 숫자보다 +1큼. 그래서 인덱스 번호를 나타내려면 -1해줘야됨
												//ex)굴려서 4나옴. dice[4-1]=dice[4]-1 -> dice[3] = dice[4]-1 (?????????)
												//(좌)그 부여받은 인덱스 번호에다가 (우)??????
					
					if(num == 5) {
						break;
					}
				}
				System.out.println("5가 나올때까지 주사위를 "+count+"번 굴렸습니다");
			}else if(selectNo == 3) {		//결과 보기
				for(int i=0; i<dice.length; i++) {					//결과는 2번에서 계산했던걸 나열하면 되기 때문에 for문을 이용해서 배열 길이만큼 반복해줌.
					System.out.println((i+1)+"은"+dice[i]+"번 나왔습니다.");
				}
			}else if(selectNo == 4) {		//가장 많이 나온 수 = 배열의 값중 최대값을 찾아라. 문제는 횟수라는것.
				int maxCount = dice[0];		//나온 횟수를 구하기 위한 배열의 초기화
				int maxIndex = 0;			//나온 index값의 변수 초기화
				for(int i=0; i<dice.length; i++) {	//여기서부턴 전에 했던 최대값 구하기임.
					if(maxCount < dice[i]) {		//배열의 숫자가 최대값 보다 크면
						maxCount = dice[i];			//그 숫자가 최대값이 되는것이다.
						maxIndex = i;				//이때 i는 인덱스 번호가 되는거지. for문이 i=0부터 시작했으니까
					}
				}
				System.out.println("가장 많이 나온 수는 "+(maxIndex+1)+"입니다.");
			}else if(selectNo == 5) {		//종료
				run = false;
			}else {		//메뉴(1~5)외 입력 시
				System.out.println("메뉴를 잘못 입력 하셨습니다. 다시 입력하세요");
			}
		}
		System.out.println("프로그램 종료");
	}

}
