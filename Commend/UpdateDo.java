package org.java.Commend;

import org.java.Dao.MemberDao;

public class UpdateDo implements ExcuteQueryCommend {

	@Override
	public void excuteQuery() {
		System.out.println("회원수정 실행");
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.updateDo();
		System.out.println("반환값 : "+rs);
	}

}
