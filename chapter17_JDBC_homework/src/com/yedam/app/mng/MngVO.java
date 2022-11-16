package com.yedam.app.mng;

import java.sql.Date;

public class MngVO {
	
	private String deptNo;
	private int empNo;
	private String fromDate;
	private String toDate;

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "MngVo [deptNo=" + deptNo + ", empNo=" + empNo + ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}

}
