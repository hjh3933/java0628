package org.java.Commend;

import java.util.ArrayList;

import org.java.Dao.MemberDao;
import org.java.Dto.MemberDto;

public class SelectDo implements ExcuteQueryCommend {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ����ȸ ����");
		MemberDao dao = MemberDao.getInstance();
		ArrayList<MemberDto> lists = dao.list();
		System.out.println("��ȯ�� : "+lists);
	}

}
