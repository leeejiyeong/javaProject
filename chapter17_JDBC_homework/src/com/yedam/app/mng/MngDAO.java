package com.yedam.app.mng;

import java.util.List;

public interface MngDAO {
	// 전체조회
	List<MngVO> selectAll();

	// 단건조회
	MngVO selectOne(MngVO mngVO);

	// 등록
	void insert(MngVO mngVO);

	// 수정
	void update(MngVO mngVO);

	// 삭제
	void delete(int empNo);
}
