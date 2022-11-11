package com.yedam.homework;

public class EmpDept extends Employee {

		
		//필드
		String dpt;
		
		//생성자
		
		public EmpDept(String name, int money) {
			super(name, money);
		}
		public EmpDept(String name, int money, String dpt) {
			super(name, money);
			this.dpt = dpt;
		}

		
		//메소드
		public String getDpt() {
			return dpt;
		}
		
		@Override
		public void getInformation() {
			super.getInformation();
			System.out.println("부서 : " + dpt);
		}

		@Override
		public void print() {
			System.out.println("수퍼클래스\n서브클래스");
		}
		
		
		
		
		
		
		
	
}

