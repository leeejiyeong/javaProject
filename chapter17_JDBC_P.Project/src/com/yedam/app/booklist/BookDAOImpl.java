package com.yedam.app.booklist;

import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO;

public class BookDAOImpl extends DAO implements BookDAO {
	//싱글톤
	private static BookDAO instance = null;
	
	public static BookDAO getInstance() {
		if(instance == null) {
			instance = new BookDAOImpl();
		}
		return instance;
	}
	
	//======전체조회========
	@Override	
	public List<BookVO> selectAll() {
		List<BookVO> list = new ArrayList<>();
		try {
			connect();
			
			stmt = conn.createStatement();
			String sql = "SELECT * FROM BookList";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				BookVO bookVO = new BookVO();
				bookVO.setISBN(rs.getInt("book_ISBN"));
				bookVO.setBook_title(rs.getString("book_title"));
				bookVO.setBook_writer(rs.getString("book_writer"));
				bookVO.setBook_content(rs.getString("book_content"));
				bookVO.setBook_stock(rs.getInt("book_stock"));
				list.add(bookVO);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	
	//======개별조회========
	@Override	
	public BookVO selectOne(BookVO bookVO) {
		BookVO findVO = null;
		try {
			connect();
			String sql = "SELECT * FROM BookList WHERE book_ISBN = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookVO.getISBN());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				findVO = new BookVO();
				findVO.setISBN(rs.getInt("book_ISBN"));
				findVO.setBook_title(rs.getString("book_title"));
				findVO.setBook_writer(rs.getString("book_writer"));
				findVO.setBook_content(rs.getString("book_content"));
				findVO.setBook_stock(rs.getInt("book_stock"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return findVO;
	}
	
	//======도서등록========
	@Override
	public void insert(BookVO bookVO) {
		try {
			connect();
			String sql = "INSERT INTO bookList VALUES (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookVO.getISBN());
			pstmt.setString(2, bookVO.getBook_title());
			pstmt.setString(3, bookVO.getBook_writer());
			pstmt.setString(4, bookVO.getBook_content());
			pstmt.setInt(5, bookVO.getBook_stock());
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("도서등록이 정상적으로 완료되었습니다.");
			}else {
				System.out.println("도서등록이 정상적으로 완료되지 않았습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

	//======도서수정========
	/***빌려갔을때는 수정하면 안되지 않나???***/
	@Override
	public void update(BookVO bookVO) {
		try {
			connect();
			String sql = "UPDATE BookList SET book_title = ?, book_writer =? WHERE book_ISBN = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookVO.getBook_title());
			pstmt.setString(2, bookVO.getBook_writer());
			pstmt.setInt(3, bookVO.getISBN());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("정상적으로 수정되었습니다.");
			}else {
				System.out.println("정상적으로 수정되지 않았습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
			
		}
	}

	//======도서삭제========
	/***빌려갔을때는 삭제하면 안되지 않나???***/
	@Override
	public void delete(int book_ISBN) {
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "DELETE FROM BookList WHERE book_ISBN = " + book_ISBN;
			int result = stmt.executeUpdate(sql);
			
			if(result>0) {
				System.out.println("정상적으로 삭제되었습니다.");
			}else {
				System.out.println("정상적으로 삭제되지 않았습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

}
