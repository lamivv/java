package com.yedam.reference;
/*
 아이디, 비밀번호, 이름
 */
public class Member {
	// 필드
	private String memberId;
	private String password;
	private String memberName;
	
	//생성자
	public Member(String memberId, String password, String memberName) {
//		super(); // 부모 클래스를 가리키는 거 
		this.memberId = memberId;
		this.password = password;
		this.memberName = memberName;
	}

	// 메소드
	// get set
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
}
