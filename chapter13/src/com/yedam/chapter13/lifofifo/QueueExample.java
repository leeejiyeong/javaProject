package com.yedam.chapter13.lifofifo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk","홍두깨"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
				case "sendMail" :
					System.out.println(message.to +"님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					
			}
		}
		//입력한 순서대로 실행된다.
		//자료구조는 목적이 있다. 지금처럼 한번 사용하고 데이터가 사라지는것들에서 기존의 map,set등은 사용하기가 어렵다.
		//그래서 lifo, fifo를 사용하는것.
	}
}
