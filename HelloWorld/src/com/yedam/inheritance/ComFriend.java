package com.yedam.inheritance;
/*
 Friend 상속하는 ComFriend
 회사명, 부서정보
 */
public class ComFriend extends Friend {
	// 필드
	private String comnpanyName;
	private String department;

	// 생성자
	public ComFriend(String friendName, String phoneNumber, String comnpanyName, String department) {
		super(friendName,phoneNumber); // super 부모
		this.comnpanyName = comnpanyName;
		this.department = department;
	}
	
	// showInfo() 재정의(오버라이딩) -> 학교정보 추가
	@Override // 컴파일 시점이나 실행 시점의 메소드나 필드에 추가된 정보를 제공?
	// 부모가 가지고있는
	public String showInfo() {
		return super.showInfo() + ", 회사: " + comnpanyName;
	}

	// getter, setter
	public String getComnpanyName() {
		return comnpanyName;
	}

	public void setComnpanyName(String comnpanyName) {
		this.comnpanyName = comnpanyName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
