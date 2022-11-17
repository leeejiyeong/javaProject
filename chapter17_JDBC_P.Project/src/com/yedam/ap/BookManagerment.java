package com.yedam.ap;

import java.util.List;
import java.util.Scanner;

import com.yedam.app.booklist.BookDAO;
import com.yedam.app.booklist.BookDAOImpl;
import com.yedam.app.booklist.BookVO;

public class BookManagerment {
	Scanner sc = new Scanner(System.in);
	BookDAO bookDAO = BookDAOImpl.getInstance();

	public BookManagement() {
		while(true) {
			//메뉴출력
			menuPrint();
			
			//메뉴선택
			int menuNo = menuSelect();
			
			//각 메뉴 기능을 실행
			if(menuNo == 1) {	
				//전체조회
				selectAll();
			}else if(menuNo == 2) {		
				//개별조회
				selectOne();
			}else if(menuNo == 3) {
				//도서등록
				insertBook();
			}else if(menuNo == 4) {
				//도서수정
				updateBook();
			}else if(menuNo == 5) {
				//도서삭제
				deleteBook();
			}else if(menuNo == 6) {
				//도서대출
				borrowBook();
			}else if(menuNo == 7) {
				//도서반납
				checkoutBook();
			}else if(menuNo == 8) {
				//미반납도서
				notCheckout();
			}else if(menuNo == 9) {
				//종료
				end();
			}else {
				//기타사항
				printErrorMessage();
			}
		}
	}
	
	private void printErrorMessage() {
		System.out.println("------------------------------------");
		System.out.println("메뉴를 잘못입력하였습니다. 번호를 확인해주세요");
		System.out.println("------------------------------------");
	}
	
	private void end() {
		System.out.println("----------------");
		System.out.println("프로그램을 종료합니다");
		System.out.println("----------------");
	}
	
	private void menuPrint() {
		System.out.println("===========================================================");
		System.out.println(" 1. 전체조회 | 2. 개별조회 | 3. 도서등록 | 4. 도서수정 | 5. 도서삭제 ");
		System.out.println(" 6. 도서대출 | 7. 도서반납 | 8. 미반납도서목록 | 9. 종료  ");
		System.out.println("===========================================================");
	}
	
	//메뉴선택
	private int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("메뉴는 숫자입니다. 다시 입력해주세요");
		}
		return menuNo;
	}
	
	//1. 전체조회
	private void selectAll() {
		List<BookVO> list = bookDAO.selectAll();
		if(list.isEmpty()) {
			System.out.println("정보가 존재하지 않습니다");
			return;
		}
		for(BookVO bookVO : list) {
			System.out.printf("%d \t %s \t %s \t %s\n",bookVO.getISBN(),bookVO.getBook_title(), bookVO.getBook_writer(), bookVO.getBook_content());
		}
	}
	
	//2. 개별조회
	private void selectOne() {
		BookVO findBook = inputBookInfo();
		BookVO bookVO = bookDAO.selectOne(findBook);
		if(bookVO == null) {
			System.out.printf("%d번의 도서는 존재하지 않습니다.\n", findBook.getISBN());
			System.out.printf("'%s'단어를 포함하는 도서는 존재하지 않습니다.\n", findBook.getBook_title());
			System.out.printf("'%s'단어를 포함하는 저자는 존재하지 않습니다.\n", findBook.getBook_writer());
		}else {
			System.out.println("검색결과 > ");
			System.out.println(bookVO);
		}
	}
	
	//3. 도서등록
	private void insertBook() {
		BookVO bookVO = inputBookAll();
		bookDAO.insert(bookVO);
	}
	
	//4. 도서수정
	private void updateBook() {
		BookVO bookVO = inputBookInfo();
		bookDAO.update(bookVO);
	}
	
	//5. 도서삭제
	/***대출중인거 삭제안되게 하기 ***/
	private void deleteBook() {
		int book_ISBN = inputBookISBN();
		
	}
	
	
	
	
	
	
	
}
