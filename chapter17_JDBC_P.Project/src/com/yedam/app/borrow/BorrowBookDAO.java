package com.yedam.app.borrow;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.app.booklist.BookVO;
import com.yedam.app.common.DAO;

public class BorrowBookDAO extends DAO {

	// 싱글톤
	private static BorrowBookDAO bbDAO = null;

	private BorrowBookDAO() {
	}

	public static BorrowBookDAO getInstance() {
		if (bbDAO == null) {
			bbDAO = new BorrowBookDAO();
		}
		return bbDAO;
	}

	// 대출테이블에 등록
	public void insert(BorrowVO bv) {
		try {
			connect();
			String sql = "INSERT INTO bookBorrowCheckout (borrow_date, bor_name, bor_tel, "
					+ "book_info, borrow_end_date)" + "VALUES (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, bv.getBorrowDate());
			pstmt.setString(2, bv.getBorName());
			pstmt.setString(3, bv.getBorTel());
			pstmt.setString(4, bv.getBookInfo());
			pstmt.setString(5, bv.getBorrowEndDate());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("대출등록이 정상적으로 완료되었습니다.");
			} else {
				System.out.println("대출등록이 정상적으로 완료되지 않았습니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 대출하면 보유량 -1하기
	public void update(BookVO bookVO) {
		try {
			connect();
			String sql = "UPDATE BookList SET book_now_stock = ? WHERE book_ISBN  = ? ";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, bookVO.getBook_now_stock() - 1);
			pstmt.setInt(2, bookVO.getISBN());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 대출목록 전체조회
	public List<BorrowVO> selectAll() {
		List<BorrowVO> list = new ArrayList<>();
		try {
			connect();
			String sql = "SELECT * FROM BookBorrowCheckout";

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BorrowVO bv = new BorrowVO();
				bv.setBorrowDate(rs.getString("borrow_date"));
				bv.setBorName(rs.getString("bor_name"));
				bv.setBorTel(rs.getString("bor_tel"));
				bv.setBookInfo(rs.getString("book_info"));
				bv.setBorrowEndDate(rs.getString("borrow_end_date"));
				bv.setCheckoutDate(rs.getString("checkout_date"));
				bv.setBorrowCheckout(rs.getString("borrow_checkout"));
				list.add(bv);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 반납(대출목록에 1.반납날짜 추가하고 2.반납여부체크)
	public void ckoutUpdate(BorrowVO brVO) {
		try {
			connect();
			String sql = "UPDATE BookBorrowCheckout SET checkout_date =?, borrow_checkout = ? WHERE book_info =?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, brVO.getCheckoutDate());
			pstmt.setString(2, brVO.getBorrowCheckout());
			pstmt.setString(3, brVO.getBookInfo());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("반납이 정상적으로 완료되었습니다.");
			} else {
				System.out.println("반납이 정상적으로 완료되지 않았습니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 반납하면 보유량 +1하기
	public void stockUpdate(BookVO bookVO) {
		try {
			connect();
			String sql = "UPDATE BookList SET book_now_stock =? WHERE book_ISBN = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, bookVO.getBook_now_stock() + 1);
			pstmt.setInt(2, bookVO.getISBN());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 미반납도서조회
	public List<BorrowVO> notCkoutInfo() {
		List<BorrowVO> list = new ArrayList<>();
		try {
			connect();
			String sql = "SELECT * FROM BookBorrowCheckout WHERE checkout_date IS NULL OR borrow_checkout IS NULL";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				BorrowVO brVO = new BorrowVO();
				brVO.setBorrowDate(rs.getString("borrow_date"));
				brVO.setBorName(rs.getString("bor_name"));
				brVO.setBorTel(rs.getString("bor_tel"));
				brVO.setBookInfo(rs.getString("book_info"));
				brVO.setBorrowEndDate(rs.getString("borrow_end_date"));
				list.add(brVO);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

}
