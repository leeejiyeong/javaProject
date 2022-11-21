package com.yedam.app.borrow;

import java.util.List;

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
				//대출목록조회
				selectAll();
			}else if(menuNo == 4) {
				//미반납도서조회
				notCkout();
			}else if(menuNo == 5) {
				//뒤로가기
				back();
				break;
			}else {
				printErrorMessage();
			}
		}
	}
	
	protected void menuPrint() {
		System.out.println("===========================================================");
		System.out.println("1. 대출 | 2. 반납 | 3. 대출목록조회 | 4. 미반납도서조회 | 5. 뒤로가기");
		System.out.println("===========================================================");
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
	 * 대출할 도서번호 입력받기 ->재고 확인후 가능/불가능 확인하기 
	 * -> 가능하면 대출자 정보(이름, 연락처)입력받기, 불가능하면 재고없다고 알려주기 
	 * -> 도서대출테이블에 등록하기
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
			
			//보유 1 이상이면 대출 가능
			if((bookVO.getBook_now_stock()) > 0) {
				System.out.println("대출가능");
				BorrowVO brVO = borInfo();
				brDAO.insert(brVO);
				brDAO.update(bookVO);
			} else if(bookVO.getBook_now_stock() <= 0) {
				System.out.println("대출불가");
				return;
			}
		}
	}
	
	//1-1. 대출
	protected BookVO findBookInfo() {
		BookVO bookVO = new BookVO();
		try {
			System.out.println("도서번호(ISBN) 입력 > ");
			bookVO.setISBN(Integer.parseInt(sc.nextLine()));
		//실수로 문자입력했을때 뜨는 메시지
		}catch(NumberFormatException e) {
			System.out.println("도서번호는 숫자입니다.");
		}
		return bookVO;
	}
	
	//1-2. 대출
	protected BorrowVO borInfo() {
		BorrowVO brVO = new BorrowVO();
		System.out.println("대출날짜(yyyy/MM/dd) > ");
		brVO.setBorrowDate(sc.nextLine());
		System.out.println("대출인 > ");
		brVO.setBorName(sc.nextLine());
		System.out.println("연락처 > ");
		brVO.setBorTel(sc.nextLine());
		System.out.println("대출할 도서번호(ISBN) > ");
		brVO.setBookInfo(Integer.parseInt(sc.nextLine()));
		System.out.println("대출만료일(yyyy/MM/dd) > ");
		brVO.setBorrowEndDate(sc.nextLine());
		
		return brVO;
	}
	
	//3.대출목록조회
	private void selectAll() {
		List<BorrowVO> list = brDAO.selectAll();
		if(list.isEmpty()) {
			System.out.println("대출목록이 비었습니다");
			return;
		}
		for(BorrowVO brVO : list) {
			System.out.printf("대출일:%s\t 대출인:%s\t 연락처:%s\t 책번호:%s\t 반납예정일:%s\t 반납일:%s\n"
					, brVO.getBorrowDate(), brVO.getBorName(), brVO.getBorTel(), brVO.getBookInfo()
					, brVO.getBorrowEndDate(), brVO.getCheckoutDate());
		}
	}
	
	//2. 반납
	/***
	 * 대출한 책번호 입력받기 -> 대출 도서정보 확인 -> 반납가능하면 도서대출DB에 반납일자 추가되게하기 
	 * 불가하면 불가 메시지 -> 도서목록테이블에 재고 다시 추가하기
	 * ***/
	private void bookCk() {
		//대출한 도서번호 입력받기
		BookVO brBook = findBookInfo();
		BookVO bookVO = bkDAO.selectOne(brBook);
		if(bookVO == null) {
			System.out.printf("%d번의 도서는 존재하지 않습니다.\n", brBook.getISBN());
		}else {
			System.out.println("검색결과 > ");
			System.out.println(bookVO);
			
			//보유량이 더 적을때만 반납 가능
			if(bookVO.getBook_now_stock() < bookVO.getBook_total_stock()) {
				System.out.println("반납가능");
				BorrowVO brVO = ckInfo();
				brVO.setBookInfo(bookVO.getISBN());
				brDAO.ckoutUpdate(brVO);
				brDAO.stockUpdate(bookVO);
			} else if(bookVO.getBook_now_stock() >= bookVO.getBook_total_stock()) {
				System.out.println("대출된 도서가 없습니다.");
				return;
			}
		}
	}
	
	//2-1. 반납
	protected BorrowVO ckInfo() {
		BorrowVO brVO = new BorrowVO();
		System.out.println("반납날짜(yyyy/MM/dd) > ");
		brVO.setCheckoutDate(sc.nextLine());
		
		return brVO;
	}
	
	//4. 미반납목록조회(대출 테이블에 반납일 기록이 안된사람만 뽑아서 리스트로 출력)
	/*** [대출일 대출한사람 연락처 책번호 반납예정일] ***/
	private void notCkout() {
		List<BorrowVO> list = brDAO.notCkoutInfo();
		if(list.isEmpty()) {
			System.out.println("미반납도서가 없습니다");
			return;
		}
		for(BorrowVO brVO : list) {
			System.out.printf("대출일:%s\t 대출인:%s\t 연락처:%s\t 책번호:%s\t 반납예정일:%s\n"
					, brVO.getBorrowDate(), brVO.getBorName(), brVO.getBorTel()
					, brVO.getBookInfo() ,brVO.getBorrowEndDate());
		}
	}
}
