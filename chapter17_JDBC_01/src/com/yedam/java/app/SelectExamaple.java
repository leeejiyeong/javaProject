package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExamaple {

	public static void main(String[] args) {
		
		try {
		//어떤 프로그램을 만들든 JDBC를 사용할땐 이 6단계를 벗어날수 없다.
		// 1. JDBC Driver 로딩하기(★젤중요) - 클래스를 직접 메모리로 끌어올리기. import개념 x.
		Class.forName("org.sqlite.JDBC");
		
		// 2. DB 서버 접속하기 - 경로가 정해져있음
		String url = "jdbc:sqlite:/D:/dev/Database/testDataBase.db";
		Connection conn = DriverManager.getConnection(url);
		
		// 3. Statement or PreparedStatement 객체 생성하기 (통로 왔다갔다할 배달부 같은거)
		Statement stmt = conn.createStatement();
		
		// 4. SQL문 실행
		ResultSet rs = stmt.executeQuery("SELECT student_id, student_name, student_dept FROM students");
		
		// 5. 결과값 가져와서 출력하기
		while(rs.next()) {	//ResultSet이 sql테이블의 끝에 도달할때까지 반복된다.
			int sId = rs.getInt("student_id");
			String sName = rs.getString("student_name");
			String sDept = rs.getString("student_dept");
			System.out.println("학번 : " + sId);
			System.out.println("이름 : " + sName);
			System.out.println("학년 : " + sDept);
			
		}
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
		// 6. 자원해제하기 - 순서 핵중요 -> resultset, statement, connection (만든거 역순으로)
			if(rs != null) 	rs.close;		// =사용중인경우->close
			if(stmt != null) stmt.close;
			if(conn != null) conn.close;
			
		}
	}

}
