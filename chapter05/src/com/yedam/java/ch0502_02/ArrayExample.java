package com.yedam.java.ch0502_02;

public class ArrayExample {

	public static void main(String[] args) {
		
		//다차원 배열
		int[][]	mathScores = new int[2][3];	//int배열을 값으로 가지고 있음. 뒤에있는게 int배열의 크기. 앞에있는건 그 int배열이 몇개인지
		
		//방법1: 변수를 사용한거
		for(int i=0; i<mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");
			int[] mathScore = mathScores[i];	
			
			for(int j=0; j<mathScore.length; j++) {
				System.out.println("\t mathScore ["+j+ "] :"+ mathScore[j]);
			}
		}
		System.out.println("======================================");
		
		//방법2 : 변수 사용을 안하는거
		for(int i=0; i<mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");
			
			for(int j=0; j<mathScores[i].length; j++) {
				System.out.println("\t mathScores["+i+"]["+j+"] :"+ mathScores[i][j]);
			}
		}
		
		//계단식 다차원 배열
		//방법1 - 직접 입력
		int[][] scoreList = {						//다차원 배열도 직접 값을 줄수 있다.
								{86, 65},
								{58, 95, 73}
							};
		
		for(int i=0; i<scoreList.length; i++) {
			System.out.println(i+"번째 학생 성적 ===");
			for(int j=0; j<scoreList[i].length; j++) {	//scoreList[0]으로 하면 0번째 배열의 길이에 맞춰서 출력되기 때문에 1번째 배열이 더길면 짤림
				System.out.println(scoreList[i][j] +" ");
			}
			System.out.println();
		}
		
		//방법2
		int[][] englishScore = new int[2][];		// 서랍장의 칸만 정해주고 칸막이는 안정해줌(=배열 갯수만 정하고 배열 크기는 안정함)
		englishScore[0] = new int[3];
		englishScore[1] = new int[2];				//각 서랍장의 칸막이크기를 정해줌(=배열크기를 각각 정해줌)
		
		for(int i=0; i<englishScore.length; i++) {
			for(int j=0; j<englishScore[i].length; j++) {
				System.out.println("englishScore["+i+"]["+j+"] : "+ englishScore[i][j]);
			}
		}
		System.out.println("======================================");
		
		//객체를 참조하는 배열
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);		//참조하는 객체(번지수)가 같음
		System.out.println(strArray[1] == strArray[2]);		//참조하는 객체(번지수)가 다름
		System.out.println(strArray[1].equals(strArray[2]));	//번지수는 다르지만 문자열(내용)이 같기 때문에 같음.
		
		System.out.println("======================================");
		
		//for문으로 배열 복사 - 앞에서부터 순차적으로 복사하는거
		int[] oldIntAry = {1, 2, 3};
		int[] newIntAry = new int[5];		// 0 0 0 0 0 배열 생성
		for(int i=0; i<oldIntAry.length ; i++) {
			newIntAry[i] = oldIntAry[i];	//old배열의 값들을 new배열에 대입함.
		}
		
		for(int i=0; i<newIntAry.length; i++) {
			System.out.println(newIntAry[i]);
		}
		
		System.out.println("======================================");
		
		//System.arraycopy()
		String[] oldStrAry = {"java", "array", "copy"};
		String[] newStrAry = new String[5];
		
		System.arraycopy(oldStrAry, 0, newStrAry, 2, oldStrAry.length);	//old의, 0번째부터, new에다가, 2번부터, old의 길이만큼 복사
		for(int i=0; i<newStrAry.length; i++) {
			System.out.println(newStrAry[i]);
		}
		
		System.out.println("======================================");
		
		//향상된 for문 - 단순히 순환을 하는 경우, 인덱스를 사용하지 않아도 되는 경우에 사용.->인덱스를 사용할거면 굳이 향상된 for문 사용할 필요가 없음.
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		//int index = -1;
		for(int score:scores) {		//왼쪽은 그 배열을 담을 임시변수 : 오른쪽은 배열이름
									//scores의 인덱스 순서대로 score임시변수에 값이 담김.
			sum+=score;
			//System.out.println("인덱스 :"+ ++index);
		}
		System.out.println("점수 총합:" + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 :" + avg);
		
		
		
		
		
	}

}
