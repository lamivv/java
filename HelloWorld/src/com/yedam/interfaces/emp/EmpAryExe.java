package com.yedam.interfaces.emp;
/*
 배열활용
 */
public class EmpAryExe implements EmpDAO{

	Employee[] employees = new Employee[10]; // 정보 저장
	
	
	@Override
	public boolean registerEmp(Employee emp) {
		return false;
	}

	@Override
	public boolean modifyEnp(Employee emp) {
		return false;
	}

	@Override
	public boolean removeEmp(int empNO) {
		return false;
	}

	@Override
	public Employee[] search(Employee emp) {
		return null;
	}
	
}
