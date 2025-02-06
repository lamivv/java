package com.yedam.interfaces.emp;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 실행클래스 : MainExe
 사원관리 App v.1
 인터페이스 활용 (배열, 컬렉션)
 Employee, EmpAryExe, EmpListExe, EmpDAO(인터페이스)
 */
public class MainExe {
	
	// 스캐너
	static Scanner scn = new Scanner(System.in);
	// 배열, 컬렉션
	static EmpDAO dao = new EmpAryExe();
	
	public static void main(String[] args) {
		
		// run
		boolean run = true;

		

		while (run) {
			System.out.println("1.추가 | 2.수정 | 3.삭제 | 4.조회 | 9.종료");
			System.out.print("선택> ");
			int menu;
			try {
				menu = scn.nextInt();
				scn.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("메뉴를 확인하세요");
				scn.nextLine();
				continue;
			}

			switch (menu) {
			case 1: // 추가 (사원번호,이름,전화번호)
				int empNo;
				while (true) {
					try {
						System.out.print("사원번호> ");
						empNo = Integer.parseInt(scn.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.err.println("사원번호는 숫자만 입력가능합니다");
					}
				} // end of while
				System.out.print("이름> ");
				String eName = scn.nextLine();
				System.out.print("전화번호> ");
				String tel = scn.nextLine();

				if (dao.registerEmp(new Employee(empNo, eName, tel))) {
					System.out.println("등록되었습니다");
				}
				break; // end of case 1
			case 2: // 사원번호를 입력받아 수정 (전화번호, 입사일자, 급여)
				while (true) {
					try {
						System.out.print("사원번호> ");
						empNo = Integer.parseInt(scn.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.err.println("사원번호는 숫자만 입력가능합니다");
					}
				} // end of while
				System.out.print("전화번호> ");
				tel = scn.nextLine();
				System.out.print("입사일자> ");
				String hdateString = scn.nextLine();
				if (hdateString.equals("")) { // 아무런 입력이 없으면 1900-01-01으로 인식
					hdateString = "1900-01-01";
				}
				String hdate = hdateString;
				System.out.print("급여> ");
				String salString = scn.nextLine();
				if (salString.equals("")) { // 아무런 입력이 없으면 0으로 인식
					salString = "0";
				}
				int sal = Integer.parseInt(salString);

				if (dao.modifyEnp(new Employee(empNo, "", tel, hdate, sal))) {
					System.out.println("수정되었습니다");
				} else {
					System.out.println("입력하신 사원번호가 존재하지않습니다");
				}
				break; // end of case 2
			case 3: // 삭제
				try {
					remove();
				} catch (NumberFormatException e) {
					System.out.println("입력하신 사원번호가 존재하지않습니다");
				}
				break; // end of case 3
			case 4: // 조회 (급여가 매개값 이상인 사람 출력)
//				System.out.println("입력한 급여 이상의 사원을 조회합니다");
//				System.out.print("급여> ");
//				sal = Integer.parseInt(scn.nextLine());

				System.out.println("입력한 이름의 사원을 조회합니다");
				System.out.print("이름> ");
				eName = scn.nextLine();
				Employee emp = new Employee();

				emp.setEmpName(eName);
//				emp.setSalary(sal);

				// 조회 결과
				Employee[] result = dao.search(emp);
				// 출력
				System.out.println("사번  이름   연락처      급여");
				System.out.println("-------------------------");
				for (Employee empl : result) {
					// : 배열만큼 반복해서 empl이라는 변수에 담는것
					if (empl != null) {
						System.out.println(empl.empInfo());
					}
				}
				System.out.println("-------------------------");
				break;
			case 9:
				System.out.println("종료합니다");

				run = false;
				break;
			default:
				System.out.println("올바른 메뉴를 선택해주세요");
				break;
			}
		}
		System.out.println("end of prog");
	} // end of main
	
	// 예외 떠넘기기 예제
	static void remove() throws NumberFormatException {
		System.out.print("사원번호> ");
		int empNo = Integer.parseInt(scn.nextLine());

		if (dao.removeEmp(empNo)) {
			System.out.println("삭제되었습니다");
		} else {
			System.out.println("입력하신 사원번호가 존재하지않습니다");
		}
	} // end of remove()
} // end of class MainExe
