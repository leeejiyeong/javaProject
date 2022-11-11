package com.yedam.homework;

public class EmpPrint {
	public static void main(String[] args) {
		
		EmpDept emp = new EmpDept("이지나",3000,"교육부");
		
		emp.getInformation();
		
		emp.print();
	}
}
