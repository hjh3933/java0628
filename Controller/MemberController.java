package org.java.Controller;

import java.util.Scanner;

import org.java.Commend.DeleteDo;
import org.java.Commend.ExcuteQueryCommend;
import org.java.Commend.InsertDo;
import org.java.Commend.SelectDo;
import org.java.Commend.UpdateDo;

public class MemberController {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ExcuteQueryCommend commend;

		while (true) {
			System.out.println("쿼리문을 입력하세요 insert.do, select.do, update.do, delete.do");
			String queryDo = scn.next();
			String query = queryDo.substring(0, queryDo.length() - 3);
			if (query.equals("insert")) {
				System.out.println("query: " + query);
				commend = new InsertDo();
				commend.excuteQuery();
			} else if (query.equals("select")) {
				System.out.println("query: " + query);
				commend = new SelectDo();
				commend.excuteQuery();
			} else if (query.equals("update")) {
				System.out.println("query: " + query);
				commend = new UpdateDo();
				commend.excuteQuery();
			} else if (query.equals("delete")) {
				System.out.println("query: " + query);
				commend = new DeleteDo();
				commend.excuteQuery();
			} else if (queryDo.equals("exit")) {
				System.out.println("입력값: " + queryDo);
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("쿼리문 입력오류");
			}
		}
		scn.close();
	}
}
