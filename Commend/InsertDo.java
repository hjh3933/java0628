package org.java.Commend;

import java.util.Scanner;

import org.java.Dao.MemberDao;

public class InsertDo implements ExcuteQueryCommend {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ������ ����");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("���̵� �Է�");
		String userId = scn.next();
		System.out.println("��й�ȣ �Է�");
		String userPw = scn.next();
		System.out.println("���� �Է�");
		int userAge = scn.nextInt();
		System.out.println("�̸� �Է�");
		String userName = scn.next();
		
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.insertDo(userId, userPw, userAge, userName);
		System.out.println("ȸ������ ��ȯ�� : "+rs);
		
	}

}
