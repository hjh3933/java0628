package org.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleJDBC {
	public static void main(String[] args) {

		System.out.println("Oracle DB����");

		Connection con = null; // 1. Ŀ�ؼ� ��ü�� ����� ����ش�

		// 2-(1) driver��ġ
		String driver = "oracle.jdbc.driver.OracleDriver";
		// 2-(2) url, user, password�� �Ҵ��Ѵ�
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		// 3. try catch������ �����ѵ�
		try {
			// 3-(1) driverŬ������ �ִ���
			Class.forName(driver);
			System.out.println("OK");// jdbc driver�� ������

			// 3-(2) driver�� Ŀ���� ��ü ����
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Oracle DB ���� OK");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� No");
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
