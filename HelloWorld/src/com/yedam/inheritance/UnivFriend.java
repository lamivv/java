package com.yedam.inheritance;
/*
 학교정보
 */
public class UnivFriend extends Friend {
	// 필드
	private String univName;
	private String univMajor;
	
	// 생성자
	public UnivFriend(String friendName, String phoneNumber, String univName, String univMajor) {
		super(friendName,phoneNumber);
		this.univName = univName;
		this.univMajor = univMajor;
	}
	
	// showInfo() 재정의(오버라이딩) -> 학교정보 추가
	@Override // 컴파일 시점이나 실행 시점의 메소드나 필드에 추가된 정보를 제공?
	// 부모가 가지고있는
	public String showInfo() {
		return super.showInfo() + ", 학교: " + univName;
	}
		
	// getter, setter
	
	public String getUnivName() {
		return univName;
	}
	public void setUnivName(String univName) {
		this.univName = univName;
	}
	public String getUnivMajor() {
		return univMajor;
	}
	public void setUnivMajor(String univMajor) {
		this.univMajor = univMajor;
	}
		
}
