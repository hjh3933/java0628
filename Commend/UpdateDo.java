package org.java.Commend;

import org.java.Dao.MemberDao;

public class UpdateDo implements ExcuteQueryCommend {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ������ ����");
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.updateDo();
		System.out.println("��ȯ�� : "+rs);
	}

}
