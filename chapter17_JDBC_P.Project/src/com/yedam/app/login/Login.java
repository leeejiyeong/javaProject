package com.yedam.app.login;

public class Login {
	private String loginId;
	private String loginPw;
	
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPw() {
		return loginPw;
	}
	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}
	
	@Override
	public String toString() {
		return "login [loginId=" + loginId + ", loginPw=" + loginPw + "]";
	}
	
	
	
}
