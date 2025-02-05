package com.yedam.interfaces.emp;
/*
 등록, 수정, 삭제, 조회
 */
public interface EmpDAO {
	
	// 등록
	public boolean registerEmp(Employee emp);
	// 수정
	public boolean modifyEnp(Employee emp);
	// 삭제
	public boolean removeEmp(int empNO);
	// 조회
	public Employee[] search(Employee emp);
	
}
