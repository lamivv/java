package com.yedam.inheritance;

/*
친구목록
- 일반(이름, 연락처, 혈액형)
- 학교(학교의정보)
- 회사(회사의정보)
 */
public class Friend extends Object{ // 아무것도 안적혀있으면 Object를 상속받고있는 상태..
	// .equals()나 .toString() 같은게 Object의 메소드임
	
	// 필드
	private String friendName;
	private String phoneNumber;
	private BloodType btype;

	// 생성자
	public Friend(String friendName, String phoneNumber) {
		super();
		this.friendName = friendName;
		this.phoneNumber = phoneNumber;
	}
	
	// 이름, 연락처 보여주는 메소드 
	public String showInfo() {
		return "이름: "+friendName+", 연락처: "+phoneNumber;
	}

	// getter, setter
	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BloodType getBtype() {
		return btype;
	}

	public void setBtype(BloodType btype) {
		this.btype = btype;
	};

}
