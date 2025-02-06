package com.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 배열활용
 */
public class EmpAryExe implements EmpDAO {
	// 필드
	Employee[] employees = new Employee[10]; // 정보 저장

	// 생성자
	public EmpAryExe() {
		employees[0] = new Employee(1001, "홍길동", "432-1234");
		employees[1] = new Employee(1011, "박길동", "111-1234");
		employees[2] = new Employee(1021, "박사원", "432-3331");
		employees[3] = new Employee(1010, "박사장", "432-3332", "2000-01-01", 500);
	}

	// 메소드
	@Override
	// 등록
	public boolean registerEmp(Employee emp) {
		for (int i = 0; i < employees.length; i++) {
			// 빈공간에 추가
			if (employees[i] == null) {
				employees[i] = emp;
				return true; // 등록성공
			}
		}
		return false; // 등록실패
	}

	@Override
	// 수정
	public boolean modifyEnp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < employees.length; i++) {
			if (employees[i]!= null && employees[i].getEmpNo() == emp.getEmpNo()) {
				// 연락처 값이 공란이 아닐 때 변경
				if (!emp.getTelNo().equals("")) {
					employees[i].setTelNo(emp.getTelNo());
				}
				try {
					// 값 변경 하지 않으려고 엔터("")일 경우 1900-01-01으로 변경해서 입력받음
					if (!emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
						employees[i].setHireDate(emp.getHireDate());
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
				if (emp.getSalary() != 0) {
					employees[i].setSalary(emp.getSalary());
				}
				return true; // 수정됨
			}
		}
		return false; // 수정되지않음
	}

	@Override
	// 삭제
	public boolean removeEmp(int empNO) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && employees[i].getEmpNo() == empNO) {
				employees[i] = null;
				return true; // 삭제됨
			}
		}
		return false; // 삭제되지않음
	}

	@Override
	// 조회
	public Employee[] search(Employee emp) {
		Employee[] result = new Employee[10];
		int idx = 0;

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && employees[i].getEmpName().indexOf(emp.getEmpName()) != -1) {
				result[idx] = employees[i];
				idx++; // 0부터 1씩 증가되도록
			}
		}
		return result;
	}

}
