package com.yedam.app.mng;

import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO;

public class MngDAOImpl extends DAO implements MngDAO {
	// 싱글톤
	private static MngDAO instance = null;

	public static MngDAO getInstance() {
		if (instance == null)
			instance = new MngDAOImpl();
		return instance;
	}

	@Override
	public List<MngVO> selectAll() {
		List<MngVO> list = new ArrayList<>();
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM dept_manager";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				MngVO mngVO = new MngVO();
				mngVO.setDeptNo(rs.getString("dept_no"));
				mngVO.setEmpNo(rs.getInt("emp_no"));
				mngVO.setFromDate(rs.getString("from_date"));
				mngVO.setToDate(rs.getString("to_date"));
				list.add(mngVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public MngVO selectOne(MngVO mngVO) {
		MngVO findVO = null;
		try {
			connect();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM dept_manager WHERE emp_no = " + mngVO.getEmpNo();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				findVO = new MngVO();
				findVO.setDeptNo(rs.getString("dept_no"));
				findVO.setEmpNo(rs.getInt("emp_no"));
				findVO.setFromDate(rs.getString("from_date"));
				findVO.setToDate(rs.getString("to_date"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return findVO;
	}

	@Override
	public void insert(MngVO mngVO) {
		try {
			connect();
			String sql = "INSERT INTO dept_manager VALUES (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mngVO.getDeptNo());
			pstmt.setInt(2, mngVO.getEmpNo());
			pstmt.setString(3, mngVO.getFromDate());
			pstmt.setString(4, mngVO.getToDate());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("정상적으로 등록되었읍니다.");
			} else {
				System.out.println("정상적으로 등록되지 않았읍니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void update(MngVO mngVO) {
		try {
			connect();
			String sql = "UPDATE dept_manager SET from_date = ? WHERE emp_no =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mngVO.getFromDate());
			pstmt.setInt(2, mngVO.getEmpNo());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("정상적으로 수정되었읍니다.");
			} else {
				System.out.println("정상적으로 수정되지 않았읍니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void delete(int empNo) {
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "DELETE FROM dept_manager WHERE emp_no = " + empNo;
			int result = stmt.executeUpdate(sql);

			if (result > 0) {
				System.out.println("정상적으로 삭제되었읍니다.");
			} else {
				System.out.println("정상적으로 삭제되지 않았읍니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}
}
