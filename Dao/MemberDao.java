package org.java.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import org.java.DBConnect.DbConnect;
import org.java.Dto.MemberDto;

public class MemberDao {
	// 싱글톤
	private static final MemberDao INSTANCE = new MemberDao();

	private MemberDao() {
	}

	public static MemberDao getInstance() {
		return INSTANCE;
	}

	// insert
	public int insertDo(String userId, String userPw, int userAge, String userName) {
		int rs = 0;
		// 회원가입 DB
		// 쿼리문

		PreparedStatement pstm = null; // SQL일하는 객체
		Connection conn = null; // Connection연결 객체
		String query = "";
//		query = "insert into member (userId, userPw, userAge, userName) values('m1', '1111',21, 's1')";
//		insert into member values('m1', '1111',21, 's1');

		try {
			// driver, connection
			conn = DbConnect.getConnect();
			query = "insert into member (userId, userPw, userAge, userName) values(?, ?, ?, ?)";

			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, userAge);
			pstm.setString(4, userName);

			rs = pstm.executeUpdate(); // update, delete, insert문에 사용되는 메소드(return 1이면 성공, 0,나머진 실패)

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return rs;
	}

	// select
	public ArrayList<MemberDto> list() {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		// 회원조회DB
		DbConnect.getConnect();
		return lists;
	}

	// update
	public int updateDo() {
		int rs = 0;
		// 회원 수정 DB
		DbConnect.getConnect();
		return rs;
	}

	// delete
	public int deleteDo() {
		int rs = 0;
		// 회원탈퇴 DB
		DbConnect.getConnect();
		return rs;
	}
}
