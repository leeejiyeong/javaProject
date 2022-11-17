package com.yedam.app.booklist;

public class BookVO {
	
	//자바에서 사용할 필드 만들어 주기 
	private int book_ISBN;
	private String book_title;
	private String book_writer;
	private String book_content;
	private String book_stock;
	
	//Getter Setter 메소드 추가해주기
	public int getISBN() {
		return book_ISBN;
	}
	public void setISBN(int iSBN) {
		book_ISBN = iSBN;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_writer() {
		return book_writer;
	}
	public void setBook_writer(String book_writer) {
		this.book_writer = book_writer;
	}
	public String getBook_content() {
		return book_content;
	}
	public void setBook_content(String book_content) {
		this.book_content = book_content;
	}
	public String getBook_stock() {
		return book_stock;
	}
	public void setBook_stock(String book_stock) {
		this.book_stock = book_stock;
	}
	
	//클래스 값이 제대로 담긴지 확인 -> toString 사용
	@Override
	public String toString() {
		return "도서정보 [ISBN(도서번호) : " + book_ISBN + ", 책제목 : " + book_title + ", 저자 : " + book_writer
				+ ", 책 내용 : " + book_content + ", 대출 가능 권수 : " + book_stock + "]";
	}
	
	
	
}
