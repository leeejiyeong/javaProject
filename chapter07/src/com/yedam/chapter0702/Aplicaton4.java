package com.yedam.chapter0702;
	
public class Aplicaton4 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		
		//a ->b 상속관계
		//b->a 상속관계
		//c->b->a 상속관계
		
		A a1 = b;
		A a2 = c;
		    
	}
}
