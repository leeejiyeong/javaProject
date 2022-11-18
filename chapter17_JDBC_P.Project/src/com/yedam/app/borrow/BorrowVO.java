package com.yedam.app.borrow;

public class BorrowVO {
	
	private String borrowDate;
	private String borName;
	private String borTel;
	private String bookInfo;
	private String borrowEndDate;
	private String checkoutDate;
	private String borrowCheckout;
	
	public String getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	public String getBorName() {
		return borName;
	}
	public void setBorName(String borName) {
		this.borName = borName;
	}
	public String getBorTel() {
		return borTel;
	}
	public void setBorTel(String borTel) {
		this.borTel = borTel;
	}
	public String getBookInfo() {
		return bookInfo;
	}
	public void setBookInfo(String bookInfo) {
		this.bookInfo = bookInfo;
	}
	public String getBorrowEndDate() {
		return borrowEndDate;
	}
	public void setBorrowEndDate(String borrowEndDate) {
		this.borrowEndDate = borrowEndDate;
	}
	public String getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public String getBorrowCheckout() {
		return borrowCheckout;
	}
	public void setBorrowCheckout(String borrowCheckout) {
		this.borrowCheckout = borrowCheckout;
	}
	@Override
	public String toString() {
		return "대출날짜 : " + borrowDate 
				+ ", 대출인 : " + borName 
				+ ", 연락처 : " + borTel 
				+ ", 도서정보 : " + bookInfo 
				+ ", 반납예정일 : " + borrowEndDate 
				+ ", 반납일 : " + checkoutDate 
				+ ", 반납여부 : "+ borrowCheckout;
	}
	
	
	
}
