package org.java.Commend;

import org.java.Dao.MemberDao;

public class DeleteDo implements ExcuteQueryCommend {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ��Ż�� ����");
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.deleteDo();
		System.out.println("��ȯ�� : "+rs);
	}

}
