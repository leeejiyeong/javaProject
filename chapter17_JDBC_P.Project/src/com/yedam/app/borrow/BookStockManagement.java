package com.yedam.app.borrow;

import java.time.LocalDate;

import com.yedam.ap.Management;
import com.yedam.app.booklist.BookVO;

public class BookStockManagement extends Management{
	//하위 대출 반납 프로그램
	public BookStockManagement() {
		while(true) {
			menuPrint();
			
			int menuNo = menuSelect();
			
			if(menuNo == 1) {
				//대출
				bookBr();
			}else if(menuNo == 2) {
				//반납
				bookCk();
			}else if(menuNo == 3) {
				//미반납도서
				notCkout();
			}else if(menuNo == 4) {
				//뒤로가기
				back();
				break;
			}else {
				printErrorMessage();
			}
		}
	}
	
	protected void menuPrint() {
		System.out.println("============================================");
		System.out.println("1. 대출 | 2. 반납 | 3. 미반납도서조회 | 4. 뒤로가기");
		System.out.println("============================================");
	}
	
	private void back() {
		System.out.println("메인 메뉴로 돌아갑니다");
	}
	
	private void printErrorMessage() {
		System.out.println("메뉴 번호를 확인해주세요");
	}
	
	protected int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		}
		return menuNo;
	}

	//1. 대출
	/***
	 * 대출할 도서명 or 저자 or //번호// 입력받기 ->재고 확인후 가능/불가능 확인하기 
	 * -> 가능하면 대출자 정보(이름, 연락처)입력받기, 불가능하면 재고없다고 알려주기 
	 * -> 반납일자 알려주기 -> 도서대출테이블에 등록하기
	 * ***/
	private void bookBr() {
		//대출할거 검색
		BookVO brBook = findBookInfo();
		BookVO bookVO = bkDAO.selectOne(brBook);
		if(bookVO == null) {
			System.out.printf("%d번의 도서는 존재하지 않습니다.\n", brBook.getISBN());
		}else {
			System.out.println("검색결과 > ");
			System.out.println(bookVO);
			
			//재고1 이상이면 대출 가능
			if(bookVO.getBook_stock() > 0) {
				System.out.println("대출가능");
				BorrowVO brVO = borInfo();
				brDAO.insert(brVO);
			} else {
				System.out.println("대출불가");
				return;
			}
		}
		
	}
	/***
	//현재날짜
	LocalDate now = LocalDate.now();
	//일
	int date = now.getDayOfMonth();
	***/
	
	//1-1. 대출
	protected BookVO findBookInfo() {
		BookVO bookVO = new BookVO();
		System.out.println("도서번호(ISBN) 입력 > ");
		bookVO.setISBN(Integer.parseInt(sc.nextLine()));
		
		return bookVO;
	}
	
	//1-2. 대출
	protected BorrowVO borInfo() {
		BorrowVO brVO = new BorrowVO();
		System.out.println("대출날짜(yyyy-MM-dd) > ");
		brVO.setBorrowDate(sc.nextLine());
		System.out.println("대출인 > ");
		brVO.setBorName(sc.nextLine());
		System.out.println("연락처 > ");
		brVO.setBorTel(sc.nextLine());
		System.out.println("도서번호(ISBN) > ");
		brVO.setBookInfo(sc.nextLine());
		System.out.println("대출만료일 > ");
		brVO.setBorrowEndDate(sc.nextLine());
		
		return brVO;
	}
	
	
	
	//2. 반납
	/***
	 * 대출인 이름 입력받기 -> 대출 도서정보 확인
	 * -> 반납일 이내이면 정상반납 알려주기, 반납일 이후이면 밀린 날만큼 대출불가 메시지 
	 * -> 도서대출DB에 반납일자 반납여부 추가되게하기 
	 * -> 도서목록테이블에 재고 다시 추가하기
	 * ***/
	private void bookCk() {
		
		
	}
	
	
	
	//미반납도서목록
	/*** [반납되지 않은 도서명  대출한사람  연락처  반납일  연체일] ***/
	private void notCkout() {
		
	}
	
	
	
	
	
	
	
	
	
}
