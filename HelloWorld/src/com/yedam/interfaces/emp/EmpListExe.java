package com.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 컬렉션 활용
 */
public class EmpListExe implements EmpDAO {

	// 필드
	List<Employee> empList = new ArrayList<Employee>(); // 저장공간

	// 생성자
	public EmpListExe() {
		// 초기데이터
		empList.add(new Employee(1001, "홍길동", "432-1234"));
		empList.add(new Employee(1011, "박길동", "111-1234"));
		empList.add(new Employee(1021, "박사원", "432-3331"));
		empList.add(new Employee(1010, "박사장", "432-3332", "2000-01-01", 500));
	}

	// 메소드
	@Override
	public boolean registerEmp(Employee emp) {
		return empList.add(emp);
	}

	@Override
	public boolean modifyEnp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpNo() == emp.getEmpNo()) {
				// 연락처 값이 공란이 아닐 때 변경
				if (!emp.getTelNo().equals("")) {
					empList.get(i).setTelNo(emp.getTelNo());
				}
				try {
					// 값 변경 하지 않으려고 엔터("")일 경우 1900-01-01으로 변경해서 입력받음
					if (!emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
						empList.get(i).setHireDate(emp.getHireDate());
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
				if (emp.getSalary() != 0) {
					empList.get(i).setSalary(emp.getSalary());
				}
				return true; // 수정됨
			}
		}
		return false; // 수정되지않음
	}

	@Override
	public boolean removeEmp(int empNO) {
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpNo() == empNO) {
				empList.remove(i);
				return true; // 삭제됨
			}
		}
		return false; // 삭제되지않음
	}

	@Override
	public List<Employee> search(Employee emp) { // sal 보다 급여가 많은..
		List<Employee> result = new ArrayList<Employee>();
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpName().indexOf(emp.getEmpName()) != -1 ) {
				result.add(empList.get(i));
			}
		}
		return result;
	}

}
