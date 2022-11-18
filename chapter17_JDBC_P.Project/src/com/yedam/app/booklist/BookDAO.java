package com.yedam.app.booklist;

import java.util.List;

public interface BookDAO {
	
	//전체조회
	List<BookVO> selectAll();
	
	//개별조회
	BookVO selectOne(BookVO bookVO);
	
	//도서등록
	void insert(BookVO bookVO);
	
	//도서수정
	void update(BookVO bookVO);
	
	//도서삭제
	void delete(int book_ISBN);

}
