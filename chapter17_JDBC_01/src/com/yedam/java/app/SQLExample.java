package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExample {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// 1. JDBC Driver 로딩하기(무조건)
			Class.forName("org.sqlite.JDBC");
			
			// 2. DBMS 서버와 접속하기
			String url = "jdbc:sqlite:/D:/dev/Database/testDataBase.db";
			conn = DriverManager.getConnection(url);
			
			/**************************** INSERT *****************************/
			// 3. Statement or PreparedStatement 객체 생성하기
			String insert = "INSERT INTO students (student_id, student_name) VALUES (?, ?)";		//값을 집어넣고자 하는곳에 ?넣는다.	
																									//미완성의 sql문을 받고 메소드를 이용해 내용 채움
			ps = conn.prepareStatement(insert);
			ps.setInt(1, 110);
			ps.setString(2, "윤달하");	//위에 쓴 ?순서랑 호출하는 순서랑은 상관없음(setString부터 써도됨)
			
			// 4. SQL문 실행하기
			int result = ps.executeUpdate();

			// 5. 결과 출력하기
			System.out.println("insert 결과 : " + result);
			
			/**************************** SELECT *****************************/
			// 3. Statement or PreparedStatement 객체 생성하기
			stmt = conn.createStatement();
			
			// 4. SQL문 실행하기
			String select = "SELECT student_id, student_name, student_dept FROM students";
			rs = stmt.executeQuery(select);
			
			// 5. 결과 출력하기
			while(rs.next()) {
				int id = rs.getInt("student_id");
				String name = rs.getString("student_name");
				String dept = rs.getString("student_dept");
				
				System.out.printf("학번 : %d, 이름 : %s, 학년 : %s \n", id, name, dept);
						
			}
			
			/**************************** UPDATE *****************************/
			// 3. Statement or PreparedStatement 객체 생성하기
			String uptate = "UPDATE students SET student_dept =? WHERE student_id =?";
			ps = conn.prepareStatement(uptate);
			ps.setInt(2, 110);
			ps.setString(1, "3학년");
			
			// 4. SQL문 실행하기
			result = ps.executeUpdate();
			
			// 5. 결과 출력하기
			System.out.println("UPDATE 결과 : " + result);
			
			/**************************** DELETE *****************************/
			// 3. Statement or PreparedStatement 객체 생성하기
			stmt = conn.createStatement();
			
			// 4. SQL문 실행하기
			String delete = "DELETE FROM students WHERE student_id =" + 110;
			//출력결과 : DELETE FROM students WHERE student_id = 110
			result = stmt.executeUpdate(delete);

			// 5. 결과 출력하기
			System.out.println("delete 결과 :" + result);
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver Loding Fail");
		} catch (SQLException e) {
			System.out.println("SQL관련 예외 : " + e.getMessage());
		} catch (Exception e) { // 모든 예외의 부모격
			e.printStackTrace(); // 우리가 만나는 빨간줄
		} finally {
			try {
				// 6. 자원해제하기
				// finally에 쓰는이유 -> 비정상종료되었을때 DBMS에게 신호를 보내는것임 연결해제하라고
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (ps != null) ps.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				System.out.println("정상적으로 자원이 해제되지 않았습니다.");
			}
		}

	}
}
