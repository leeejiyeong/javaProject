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
	// DAO클래스에서 만든 싱글톤 불러오기
	protected BookDAO bkDAO = BookDAOImpl.getInstance();
	protected BorrowBookDAO brDAO = BorrowBookDAO.getInstance();

	public void run() {
		while (true) {
			// 메뉴출력
			menuPrint();

			// 메뉴선택
			int menuNo = menuSelect();

			// 각 메뉴 기능을 실행
			if (menuNo == 1) {
				// 전체조회
				selectAll();
			} else if (menuNo == 2) {
				// 개별조회
				selectOne();
			} else if (menuNo == 3) {
				// 도서등록
				insertBook();
			} else if (menuNo == 4) {
				// 도서수정
				updateBook();
			} else if (menuNo == 5) {
				// 도서삭제
				deleteBook();
			} else if (menuNo == 6) {
				// 도서대출, 반납, 미반납조회
				new BookStockManagement();
			} else if (menuNo == 9) {
				// 종료
				end();
				break;
			} else {
				// 기타사항
				printErrorMessage();
			}
		}
	}

	private void printErrorMessage() {
		System.out.println("번호를 확인하고 다시 입력하세요.");
	}

	private void end() {
		System.out.println("프로그램을 종료하고 로그인 화면으로 돌아갑니다");
	}

	private void menuPrint() {
		System.out.println("===========================================================");
		System.out.println(" 1. 전체조회 | 2. 개별조회 | 3. 도서등록 | 4. 도서수정 | 5. 도서삭제 ");
		System.out.println(" 6. 대출/반납 및 미반납조회 | 9. 종료  ");
		System.out.println("===========================================================");
	}

	// 메뉴선택
	private int menuSelect() {
		int menuNo = 0;
		try {
			// 메뉴 숫자 입력
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("메뉴는 숫자입니다.");
		}
		return menuNo;
	}

	// 1. 전체조회
	private void selectAll() {
		// sql이 저장된 메소드를 불러와서 리스트 만들기
		List<BookVO> list = bkDAO.selectAll();
		//리스트가 비었을경우
		if (list.isEmpty()) {
			System.out.println("정보가 존재하지 않습니다.");
			return;
		}
		//리스트 있을경우 순서대로 출력
		for (BookVO bookVO : list) {
			System.out.printf("%d \t %s \t %s \t %s \t 보유:%s \t 재고:%s \n", bookVO.getISBN(), bookVO.getBook_title(),
					bookVO.getBook_writer(), bookVO.getBook_content(), bookVO.getBook_now_stock(),
					bookVO.getBook_total_stock());
		}
	}

	// 2. 개별조회
	private void selectOne() {
		// 2-1.의 도서번호 입력받기
		BookVO findBook = findBookInfo();
		// 해당번호의 도서정보 출력
		BookVO bookVO = bkDAO.selectOne(findBook);
		//번호가 없거나 잘못입력시
		if (bookVO == null) {
			System.out.println("도서가 존재하지 않습니다.");
		//제대로 입력시
		} else {
			System.out.println("검색결과 > ");
			System.out.println(bookVO);
		}
	}

	// 3. 도서등록
	private void insertBook() {
		try {
			//3-1.의 등록정보 입력받기
			BookVO bookVO = inputBookAll();
			//등록전에 등록여부 물어봄
			System.out.println("등록하시겠습니까?(Y/N)");
			String answer = sc.nextLine();
			//y면 등록o
			if(answer.equals("y") || answer.equals("Y")) {
				bkDAO.insert(bookVO);
			//n이면 등록x	
			}else if(answer.equals("n") || answer.equals("N")) {
				System.out.println("등록이 취소되었습니다.");
				return;
			//그외의 문자 등록x
			}else {
				System.out.println("(Y/N)중에 입력하세요");
				System.out.println("등록이 취소되었습니다.");
			}
		} catch (NumberFormatException e) {
			System.out.println("도서번호, 보유량, 재고량은 숫자입니다.");
		}
	}

	// 4. 도서수정
	private void updateBook() {
		// 2-1의 개별정보 이용하여 수정할 도서번호 확인
		BookVO findBook = findBookInfo();
		// 해당 번호의 도서정보 출력
		BookVO bookVO = bkDAO.selectOne(findBook);
		//번호없거나 잘못입력시
		if (bookVO == null) {
			System.out.println("도서가 존재하지 않습니다.");
		//제대로 입력시
		} else {
			System.out.println("검색결과 > ");
			System.out.println(bookVO);

			// 보유량과 재고량이 같을때만 수정o
			if (bookVO.getBook_now_stock() == bookVO.getBook_total_stock()) {
				System.out.println("수정가능");
				//수정할 내용 입력
				//수정전에 수정여부 물어봄
				System.out.println("수정하시겠습니까?(Y/N)");
				String answer = sc.nextLine();
				//y면 수정o
				if(answer.equals("y") || answer.equals("Y")) {
					BookVO bookVO2 = inputBookInfo();
					bkDAO.update(bookVO2);
				//n이면 수정x	
				}else if(answer.equals("n") || answer.equals("N")) {
					System.out.println("메뉴로 돌아갑니다.");
					return;
				//기타문자 수정x
				}else {
					System.out.println("(Y/N)중에 입력하세요");
					System.out.println("메뉴로 돌아갑니다.");
				}
			//보유량 재고량 같지않을때(대출중일때) 수정x
			} else {
				System.out.println("수정불가");
			}
		}
	}

	// 5. 도서삭제
	private void deleteBook() {
		// 2-1.개별정보 이용하여 삭제할 도서번호 확인
		BookVO findBook = findBookInfo();
		// 해당번호 도서정보 출력
		BookVO bookVO = bkDAO.selectOne(findBook);
		// 없는번호거나 잘못입력시
		if (bookVO == null) {
			System.out.println("도서가 존재하지 않습니다.");
		//제대로 입력시
		} else {
			System.out.println("검색결과 > ");
			System.out.println(bookVO);

			// 보유량과 재고량이 같을때만 삭제o
			if (bookVO.getBook_now_stock() == bookVO.getBook_total_stock()) {
				System.out.println("삭제가능");
				//삭제할 도서번호 입력받기
				System.out.println("삭제할 도서번호 입력 > ");
				int book_ISBN = inputBookISBN();
				//삭제전에 삭제여부 물어봄
				System.out.println("삭제하시겠습니까?(Y/N)");
				String answer = sc.nextLine();
				
				//y입력하면 삭제o
				if (answer.equals("y") || answer.equals("Y")) {
					bkDAO.delete(book_ISBN);
				//n이면 삭제x
				} else if (answer.equals("n") || answer.equals("N")) {
					System.out.println("삭제가 취소되었습니다.");
					return;
				//기타문자 삭제x
				} else {
					System.out.println("(Y/N)중에 입력하세요");
					System.out.println("삭제가 취소되었습니다.");
				}
			//보유량 재고량 다르면(대출중이면) 삭제x	
			} else {
				System.out.println("삭제불가");
			}

		}
	}

	// 2-1. 도서 개별조회 출력
	protected BookVO findBookInfo() {
		BookVO bookVO = new BookVO();
		System.out.println("도서번호(ISBN) 입력 > ");
		try {
			bookVO.setISBN(Integer.parseInt(sc.nextLine()));
		} catch (NumberFormatException e) {
			System.out.println("도서번호를 숫자로 입력하세요.");
		}
		return bookVO;
	}

	// 3-1. 도서등록 출력
	private BookVO inputBookAll() {
		BookVO bookVO = new BookVO();
		System.out.println("등록할 도서번호 입력 > ");
		bookVO.setISBN(Integer.parseInt(sc.nextLine()));
		System.out.println("도서명 > ");
		bookVO.setBook_title(sc.nextLine());
		System.out.println("저자 > ");
		bookVO.setBook_writer(sc.nextLine());
		System.out.println("도서내용 > ");
		bookVO.setBook_content(sc.nextLine());
		System.out.println("보유 > ");
		bookVO.setBook_now_stock(Integer.parseInt(sc.nextLine()));
		System.out.println("재고 > ");
		bookVO.setBook_total_stock(Integer.parseInt(sc.nextLine()));
		return bookVO;
	}

	// 4-1.도서 수정 출력
	private BookVO inputBookInfo() {
		BookVO bookVO = new BookVO();
		try {
			System.out.println("수정할 도서번호 입력 > ");
			bookVO.setISBN(Integer.parseInt(sc.nextLine()));
			System.out.println("도서명 수정 > ");
			bookVO.setBook_title(sc.nextLine());
			System.out.println("저자 수정 > ");
			bookVO.setBook_writer(sc.nextLine());

		} catch (NumberFormatException e) {
			System.out.println("숫자로 입력하세요.");
		}
		return bookVO;
	}

	// 5-1. 도서삭제
	private int inputBookISBN() {
		int book_ISBN = 0;
		try {
			book_ISBN = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("숫자로 입력하세요.");
		}
		return book_ISBN;
	}
}
