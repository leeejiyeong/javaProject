package com.yedam.app.borrow;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO;

public class BorrowBookDAO extends DAO{
	
	//싱글톤
	private static BorrowBookDAO bbDAO = null;
	private BorrowBookDAO() {}
	public static BorrowBookDAO getInstance() {
		if(bbDAO == null) {
			bbDAO = new BorrowBookDAO();
		}
		return bbDAO;
	}
	
	//대출테이블에 등록
	public void insert(BorrowVO bv) {
		try {
			connect();
			String sql = "INSERT INTO bookBorrowCheckout (borrow_date, bor_name, bor_tel, "
						+ "book_info, borrow_end_date)" 
						+ "VALUES (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
		
			pstmt.setString(1, bv.getBorrowDate());
			pstmt.setString(2, bv.getBorName());
			pstmt.setString(3, bv.getBorTel());
			pstmt.setString(4, bv.getBookInfo());
			pstmt.setString(5, bv.getBorrowEndDate());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("대출등록이 정상적으로 완료되었습니다.");
			}else {
				System.out.println("대출등록이 정상적으로 완료되지 않았습니다.");
			}
			
			//재고 -1하기
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	/***
	 * - borrow_date
	- bor_name
	- bor_tel
	- book_info
	- borrow_end_date
	- checkout_date
	- borrow_checkout***/
	//대출목록 전체조회
	public List<BorrowVO> selectAll(){
		List<BorrowVO> list = new ArrayList<>();
		try {
			connect();
			String sql = "SELECT * FROM bookBorrowCheckout ORDER BY borrow_date";
			
			pstmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				BorrowVO bv = new BorrowVO();
				bv.setBorrowDate(rs.getString("borrow_date"));
				bv.setBorName(rs.getString("bor_name"));
				bv.setBorTel(rs.getString("bor_tel"));
				bv.setBookInfo(rs.getString("book_info"));
				bv.setBorrowEndDate(rs.getString("borrow_end_date"));
				bv.setCheckoutDate(rs.getString("checkout_date"));
				bv.setBorrowCheckout("borrow_checkout");
				list.add(bv);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	
	//반납(대출목록에서 삭제)
		public void delete(String borName) {
			try {
				connect();
				String sql = "DELETE FROM bookBorrowCheckout WHERE bor_name = " + borName;
				stmt = conn.createStatement();
				int result = stmt.executeUpdate(sql);
				if(result>0) {
					System.out.println("반납이 정상적으로 완료되었습니다.");
				}else {
					System.out.println("반납이 정상적으로 완료되지 않았습니다.");
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}
		}
		
	//미반납도서조회
		
}
