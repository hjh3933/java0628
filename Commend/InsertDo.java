package org.java.Commend;

import java.util.Scanner;

import org.java.Dao.MemberDao;

public class InsertDo implements ExcuteQueryCommend {

	@Override
	public void excuteQuery() {
		System.out.println("회원가입 실행");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("아이디 입력");
		String userId = scn.next();
		System.out.println("비밀번호 입력");
		String userPw = scn.next();
		System.out.println("나이 입력");
		int userAge = scn.nextInt();
		System.out.println("이름 입력");
		String userName = scn.next();
		
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.insertDo(userId, userPw, userAge, userName);
		System.out.println("회원가입 반환값 : "+rs);
		
	}

}
