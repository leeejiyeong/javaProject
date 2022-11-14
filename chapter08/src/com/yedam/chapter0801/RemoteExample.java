package com.yedam.chapter0801;

public class RemoteExample {
	public static void main(String[] args) {
		
		//TV를 객체로 해서 만듦.
		RemoteControl rc = new Television();
		
//		rc = new Audio();	//Audio를 넣음으로써 객체 변경(생성x)-> Audio로 출력될거임. 갈아끼워서 기능을 바꿀수가 있다. 
							//
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		
		Search search = new Television();
		
		search.search("google.com");
		
		
		Television tv = new Television();
		
		tv.turnOn();
		tv.setVolume(11);
		tv.turnOff();
		
		/*
		↑ 이래써도되는데 왜 굳이 저렇게 쓰냐?
	
		
		public void temp(RemoteControl rc){
		}
		-> 구현클래스를 넣으면 메소드 하나로 다섯가지 기능을 할수있다
		public void temp(Television tv){
		}
		->얘는 기능만큼 다 필요하다
		public void temp(audio ad){
		}
		....
		이렇게
		
		*/
		
		/*
		<추상클래스 vs 인터페이스>
		추상클래스(extends) : 필드, 생성자, 메소드
		- 한자식에 한부모만 연결 가능(상속은 하나만 가능)
		- 공동으로 쓸 필드나 생성자가 있다던지 할때는 추상클래스를 사용하는게 더 낫다.
		
		인터페이스(implements) : 상수, 추상메소드
		- =여러개 상속이 가능하다 이말이야
		- 생성자가 없다 -> 바로 구현클래스를 객체로 만들어 쓴다는것.
		- 단순 기능공유는 인터페이스를 사용하는게 깔끔하다.
		
		※ 근데 이게 더낫다 저게더낫다 하기가 애매하다- 써보면안다(?)
		   추상클래스보다는 인터페이스를 많이 쓰긴함
		*/
		
		
		
	}
}
