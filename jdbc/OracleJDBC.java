package org.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleJDBC {
	public static void main(String[] args) {

		System.out.println("Oracle DB연결");

		Connection con = null; // 1. 커넥션 객체를 만들고 비워준다

		// 2-(1) driver위치
		String driver = "oracle.jdbc.driver.OracleDriver";
		// 2-(2) url, user, password를 할당한다
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		// 3. try catch문으로 실행한디
		try {
			// 3-(1) driver클래스가 있는지
			Class.forName(driver);
			System.out.println("OK");// jdbc driver가 있으면

			// 3-(2) driver와 커낵션 객체 연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Oracle DB 연결 OK");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 No");
		} catch (SQLException e) {
			System.out.println("DB No");
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}

	}
}
