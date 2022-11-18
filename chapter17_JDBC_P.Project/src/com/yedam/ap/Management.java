package com.yedam.ap;

import java.util.List;
import java.util.Scanner;

import com.yedam.app.booklist.BookDAO;
import com.yedam.app.booklist.BookDAOImpl;
import com.yedam.app.booklist.BookVO;
import com.yedam.app.borrow.BookStockManagement;
import com.yedam.app.borrow.BorrowBookDAO;

public class Management {
	protected Scanner sc = new Scanner(System.in);
	protected BookDAO bkDAO = BookDAOImpl.getInstance();
	protected BorrowBookDAO brDAO = BorrowBookDAO.getInstance();

	public void run() {
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
				new BookStockManagement();
			}else if(menuNo == 7) {
				//도서반납
				new BookStockManagement();
			}else if(menuNo == 8) {
				//미반납도서
				new BookStockManagement();
			}else if(menuNo == 9) {
				//종료
				end();
				break;
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
		System.out.println("------------------------------------");
		System.out.println("프로그램을 종료하고 로그인 화면으로 돌아갑니다");
		System.out.println("------------------------------------");
	}

	private void menuPrint() {
		System.out.println("===========================================================");
		System.out.println(" 1. 전체조회 | 2. 개별조회 | 3. 도서등록 | 4. 도서수정 | 5. 도서삭제 ");
		System.out.println(" 6. 도서대출 | 7. 도서반납 | 8. 미반납도서목록 | 9. 종료  ");
		System.out.println("===========================================================");
	}

	// 메뉴선택
	private int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("메뉴는 숫자입니다. 다시 입력해주세요");
		}
		return menuNo;
	}

	// 1. 전체조회
	private void selectAll() {
		List<BookVO> list = bkDAO.selectAll();
		if (list.isEmpty()) {
			System.out.println("정보가 존재하지 않습니다");
			return;
		}
		for (BookVO bookVO : list) {
			System.out.printf("%d \t %s \t %s \t %s \t 재고:%s \n", bookVO.getISBN(), bookVO.getBook_title(),
					bookVO.getBook_writer(), bookVO.getBook_content(), bookVO.getBook_stock());
		}
	}

	// 2. 개별조회
	private void selectOne() {
		BookVO findBook = findBookInfo();
		BookVO bookVO = bkDAO.selectOne(findBook);
		if (bookVO == null) {
			System.out.printf("%d번의 도서는 존재하지 않습니다.\n", findBook.getISBN());
		} else {
			System.out.println("검색결과 > ");
			System.out.println(bookVO);
		}
	}

	// 3. 도서등록
	private void insertBook() {
		BookVO bookVO = inputBookAll();
		bkDAO.insert(bookVO);
	}

	// 4. 도서수정
	private void updateBook() {
		
		BookVO bookVO2 = inputBookInfo();
		bkDAO.update(bookVO2);
	}

	// 5. 도서삭제
	/*** 대출중인거 삭제안되게 하기 ***/
	private void deleteBook() {
		System.out.println("삭제할 도서번호 > ");
		int book_ISBN = inputBookISBN();
		bkDAO.delete(book_ISBN);

	}
	
	//2-1. 도서 개별조회 항목
	protected BookVO findBookInfo() {
		BookVO bookVO = new BookVO();
		System.out.println("도서번호(ISBN) 입력 > ");
		bookVO.setISBN(Integer.parseInt(sc.nextLine()));
		
		return bookVO;
	}
	
	//3-1. 도서등록 항목
	private BookVO inputBookAll() {
		BookVO bookVO = new BookVO();
		System.out.println("도서번호(ISBN) > ");
		bookVO.setISBN(Integer.parseInt(sc.nextLine()));
		System.out.println("도서명 > ");
		bookVO.setBook_title(sc.nextLine());
		System.out.println("저자 > ");
		bookVO.setBook_writer(sc.nextLine());
		System.out.println("도서내용 > ");
		bookVO.setBook_content(sc.nextLine());
		System.out.println("수량(재고) > ");
		bookVO.setBook_stock(Integer.parseInt(sc.nextLine()));
		
		return bookVO;
	}
	
	//4-1.도서 수정 항목
	private BookVO inputBookInfo() {
		BookVO bookVO = new BookVO();
		System.out.println("도서번호(ISBN) > ");
		bookVO.setISBN(Integer.parseInt(sc.nextLine()));
		System.out.println("도서명 수정 > ");
		bookVO.setBook_title(sc.nextLine());			
		System.out.println("저자 수정 > ");
		bookVO.setBook_writer(sc.nextLine());
		
		return bookVO;
	}
	
	//5-1. 도서삭제 항목
	/*** 대출중인거 삭제안되게 하기 ***/
	private int inputBookISBN() {
		int book_ISBN = 0;
		try {
			book_ISBN = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("숫자로 입력해주세요");
		}
		return book_ISBN;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
