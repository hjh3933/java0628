package org.java.oracleJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleJDBC {
	public static void main(String[] args) {
		
		Connection conn = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		
		try {
			Class.forName(driver);
			System.out.println("xe OK");
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Driver OK");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("xe No");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Driver No");
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
