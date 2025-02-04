package com.yedam.inheritance;

import java.util.Scanner;

/*
 실행클래스(main)
 mysql (소규모 프로젝트)
 oracle
 */
public class DaoExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		
//		MysqlDao dao = new MysqlDao();
		OracleDao dao = new OracleDao();
		
		
		while(run) {
			System.out.println("1.등록 | 2.삭제 | 3.조회 | 9.종료");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			
			switch(menu) {
			case 1: //등록
//				dao.insert();
//				dao.add();
				dao.register();
			case 2: //삭제
//				dao.delete();
				dao.remove();
			case 3: //조회
				dao.search();
//				dao.select();
			case 9: //종료
				run = false;
			}
			
		}
	}
}
