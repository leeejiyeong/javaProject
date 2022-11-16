package com.yedam.chapter13.lifofifo;

import java.util.Stack;

public class StackExample {
	
	//lifo fifo는 기존의 배열과 다르게 값을 가져오면 사라짐.
	
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {		//coinBox가 비워질때까지 반복
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
		
		
	}
}
