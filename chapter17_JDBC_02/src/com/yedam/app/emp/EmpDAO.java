package com.yedam.app.emp;

import java.util.List;

public interface EmpDAO {
	//SQL배운것 : 조회, 등록, 수정, 삭제
	// 1-1.전체조회
	List<EmpVO> selectAll();
	
	// 1-2.단건조회
	EmpVO selectOne(EmpVO empVO);
	
	// 등록 
	void insert(EmpVO empVO);
	
	// 수정
	void update(EmpVO empVO);
	
	// 삭제
	void delete(int empNo);
	
}
