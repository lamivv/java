package com.yedam.api;

public class Member {
	String memberId;
	int memPoint;

	// 생성자
	Member() {}
	
	Member(String id, int point) {
		memberId = id;
		memPoint = point;
	}

	@Override
	public int hashCode() { // 객체의 유니크한 값을 반환 ?
//		return super.hashCode(); // Object의 hashCode는 참조주소 값
		return memPoint;
	}

	@Override
	public boolean equals(Object obj) {
		// memberId가 같을경우 논리적으로 같은 객체라고 재정의
		if (obj instanceof Member) {
			Member m2 = (Member) obj;
			if (this.memberId == m2.memberId && this.memPoint == m2.memPoint) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memPoint=" + memPoint + "]";
	}
	
	
}
