package com.yedam.ap;

import java.util.List;
import java.util.Scanner;

import com.yedam.app.mng.MngDAO;
import com.yedam.app.mng.MngDAOImpl;
import com.yedam.app.mng.MngVO;

public class MngManagement {
	Scanner sc = new Scanner(System.in);
	MngDAO mngDAO = MngDAOImpl.getInstance();

	public MngManagement() {
		while (true) {
			// 메뉴 출력
			menuPrint();

			// 메뉴 선택
			int menuNo = menuSelect();

			// 각 메뉴의 기능을 실행
			if (menuNo == 1) {
				// 전체조회
				selectAll();
			} else if (menuNo == 2) {
				// 단건조회
				selectOne();
			} else if (menuNo == 3) {
				// 관리자등록
				insertMng();
			} else if (menuNo == 4) {
				// 관리자수정
				updateMng();
			} else if (menuNo == 5) {
				// 관리자삭제
				deleteMng();
			} else if (menuNo == 6) {
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
		System.out.println("-----------------------------------");
		System.out.println("메뉴를 잘못 입력하였습니다. 번호를 확인하세요");
		System.out.println("-----------------------------------");
	}

	private void end() {
		System.out.println("-----------------------------------");
		System.out.println("프로그램을 종료합니다.");
		System.out.println("-----------------------------------");
	}

	private void menuPrint() {
		System.out.println("========================================================================");
		System.out.println("1. 관리자전체조회 | 2. 관리자조회 | 3. 관리자등록 | 4. 관리자수정 | 5. 관리자삭제 | 6. 종료");
		System.out.println("========================================================================");

	}

	private int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());

		} catch (NumberFormatException e) {
			System.out.println("메뉴는 숫자입니다.");
		}
		return menuNo;
	}

	private void selectAll() {
		List<MngVO> list = mngDAO.selectAll();
		if (list.isEmpty()) {
			System.out.println("정보가 존재하지 않습니다.");
			return;
		}
		for (MngVO mngVO : list) {
			System.out.printf("%d: %s, %s, %s \n", mngVO.getEmpNo(), mngVO.getDeptNo(), mngVO.getFromDate(),
					mngVO.getToDate());
		}
	}

	private void selectOne() {
		MngVO findMng = inputMngInfo();
		MngVO mngVO = mngDAO.selectOne(findMng);
		if (mngVO == null) {
			System.out.printf("%d 관리자는 존재하지 않습니다. \n", findMng.getEmpNo());
		} else {
			System.out.println("검색결과 > ");
			System.out.println(mngVO);
		}
	}

	private void insertMng() {
		MngVO mngVO = inputMngAll();
		mngDAO.insert(mngVO);
	}

	private void updateMng() {
		MngVO mngVO = inputMngInfo();
		mngDAO.update(mngVO);
	}

	private void deleteMng() {
		System.out.println("삭제할 사원번호 > ");
		int empNo = inputMngNo();
		mngDAO.delete(empNo);
	}

	private MngVO inputMngAll() {
		MngVO mngVO = new MngVO();
		System.out.println("부서 > ");
		mngVO.setDeptNo(sc.nextLine());
		System.out.println("사원번호 > ");
		mngVO.setEmpNo(Integer.parseInt(sc.nextLine()));
		System.out.println("입사일(yyyy-MM-dd) > ");
		mngVO.setFromDate(sc.nextLine());
		System.out.println("퇴사일(yyyy-MM-dd) > ");
		mngVO.setToDate(sc.nextLine());

		return mngVO;
	}

	private MngVO inputMngInfo() {
		MngVO mngVO = new MngVO();
		System.out.println("사원번호 > ");
		mngVO.setEmpNo(Integer.parseInt(sc.nextLine()));
		System.out.println("입사일 수정(yyyy-MM-dd) > ");
		mngVO.setFromDate(sc.nextLine());

		return mngVO;
	}

	private int inputMngNo() {
		int empNo = 0;
		try {
			empNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("사원번호는 숫자입니다.");
		}
		return empNo;
	}

}
