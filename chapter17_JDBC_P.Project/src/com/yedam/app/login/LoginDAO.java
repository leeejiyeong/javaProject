package com.yedam.app.login;

import com.yedam.app.common.DAO;

public class LoginDAO extends DAO {

	// 싱글톤
	private static LoginDAO dao = null;
	private LoginDAO() {
	}
	public static LoginDAO getInstance() {
		if (dao == null) {
			dao = new LoginDAO();
		}
		return dao;
	}

	// 아이디, 비번 정보 가져오기
	public Login selectOne(Login login) {

		Login loginInfo = null;
		try {
			connect();
			String sql = "SELECT * FROM login WHERE mng_id = '" + login.getLoginId() + "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			// 아이디가 존재할경우
			if (rs.next()) {
				// 비번이 일치하면
				if (rs.getString("mng_pw").equals(login.getLoginPw())) {
					// 로그인성공
					loginInfo = new Login();
					loginInfo.setLoginId(rs.getString("mng_id"));
					loginInfo.setLoginPw(rs.getString("mng_pw"));
				} else {
					// 비번일치x
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				// 아이디 존재x
				System.out.println("아이디가 존재하지 않습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return loginInfo;
	}
}
