package com.yedam.java.ch0604;

public class MainExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int sumRes = myCalc.plus(5, 6); 	//return하는 타입일때 int float double 세가지 (자동타입변환이 가능하기 때문)
		System.out.println("sum : "+sumRes);
		
		byte x = 10;
		byte y = 4;
		double diviRes = myCalc.divide(x, y);
		System.out.println("divide : " + diviRes);
		
		
		//배열을 이용하여 값을 받는 방법	-> 번거롭다. 한번 할때마다 변수를 만들고 넣어야되기 때문. 
		
		Computer myCom = new Computer();
		int[] values1 = {1, 2, 3};					//변수배열을 먼저 선언하고 난다음
		int intResult1 = myCom.sum1(values1);		//그걸 통째로 넣어주기
		System.out.println("intResult1 : " + intResult1);
		
		int intResult2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("intResult2 : " + intResult2);
		
		int intResult3 = myCom.sum2(1, 2, 3);		//나열해서 주면 알아서 배열로 처리함
		System.out.println("intResult3 : " + intResult3);
		
		int intResult4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("intResult4 : " + intResult4);
		
		//
		
		myCalc.execute();
		
		//
		
		double result1 = myCalc.areaRectangle(10);
		
		double result2 = myCalc.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);
		
		
		
	}

}
