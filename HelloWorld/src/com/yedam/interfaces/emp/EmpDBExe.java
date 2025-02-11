package com.yedam.interfaces.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/*
 EmpDAO(인터페이스) 구현하는 클래스
 */
import java.util.List;

public class EmpDBExe implements EmpDAO {

	Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 오라클DB의 접속정보 // xe는 접속할 데이터베이스 이름
		String user = "hr";
		String password = "hr";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public boolean registerEmp(Employee emp) {
		return false; // 등록
	}

	@Override
	public boolean modifyEnp(Employee emp) { // 수정
		String query = "insert into tbl_employees ";
		query += "values (" + emp.getEmpNo() + "," + emp.getEmpName() + ", " + emp.getTelNo() + ", " + emp.getHireDate()
				+ ", " + emp.getSalary() + ")";
		try {
			Statement stmt = getConnect().createStatement();
			int r = stmt.executeUpdate(query);
			if (r >0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean removeEmp(int empNO) { // 삭제
		return false;
	}

	@Override
	public List<Employee> search(Employee emp) { // 조회
		List<Employee> empList = new ArrayList<>();
		try {
			Statement stmt = getConnect().createStatement();
			ResultSet rs = stmt.executeQuery("select * from tbl_employees");
			// 조회결과
			while (rs.next()) {
				Employee empl = new Employee();
				empl.setEmpNo(rs.getInt("emp_no"));
				empl.setEmpName(rs.getString("emp_name"));
				empl.setTelNo(rs.getString("tel_no"));
				empl.setHireDate(rs.getDate("hire_date"));
				empl.setSalary(rs.getInt("salary"));

				empList.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}

}
