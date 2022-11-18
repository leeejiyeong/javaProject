package com.yedam.app.common;

import java.util.Scanner;

import com.yedam.ap.Management;
import com.yedam.app.login.Login;
import com.yedam.app.login.LoginDAO;

public class LoginControl {
	private Scanner sc = new Scanner(System.in);
	private static Login LoginInfo = null;
	public static Login getLoginInfo() {
		return LoginInfo;
	}
	
	public LoginControl() {
		while(true) {
			menuPrint();
			int menuNo = menuSelect();
			if(menuNo == 1) {
				//로그인
				login();
			}else if(menuNo == 2) {
				//종료
				exit();
				break;
			}else {
				//기타 메시지
				printErrorMessage();
			}
		}
	}
	
	//로그인 메뉴 출력
	private void menuPrint() {
		System.out.println("=================");
		System.out.println("1. 로그인 | 2. 종료");
		System.out.println("=================");
	}
	
	private int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("숫자 형식으로 입력하세요");
		}
		return menuNo;
	}
	
	private void exit() {
		System.out.println("프로그램을 종료합니다");
	}
	
	private void printErrorMessage() {
		System.out.println("메뉴를 다시 확인해주세요");
	}
	
	//로그인하기
	private void login() {
		//아이디, 비번 입력
		Login inputInfo = inputLogin();
		
		//로그인시도
		LoginInfo = LoginDAO.getInstance().selectOne(inputInfo);
		
		//실패할 경우 실행 종료
		if(LoginInfo == null)
			return;
		
		//성공할 경우 프로그램 실행
		new Management().run();
	}
	
	private Login inputLogin() {
		Login info = new Login();
		System.out.print("아이디 > ");
		info.setLoginId(sc.nextLine());
		System.out.print("비밀번호 > ");
		info.setLoginPw(sc.nextLine());
		
		return info;
	}
	
	
	
	
	
	
	
	
	
}
