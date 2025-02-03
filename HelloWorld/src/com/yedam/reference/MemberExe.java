package com.yedam.reference;

public class MemberExe {
	
	// 싱글턴방식으로 만드는 방식
	// 1. 필드를 static 선언
	private static MemberExe instance = new MemberExe();
	// 2. 생성자 은닉
	private MemberExe() {}{
	}
	// 3. 인스턴스를 제공해주느 메소드 getInstance();
	public static MemberExe getInstance() {
		return new MemberExe();
	}
	

	
	static Member[] members = {
			new Member("user01","1111","김땅콩"),
			new Member("user02","2222","김치즈"),
			new Member("user03","3333","정망고")};
	
	
//	public boolean login(String id, String password) {
//		for(int i = 0; i < members.length; i++) {
//			if(members[i]!=null 
//					&& members[i].getMemberId().equals(id) 
//					&& members[i].getPassword().equals(password)) {
//				return true; // id, password 일치
//			} 
//		}
//		return false; // 일치하는 값이 없음
//	} // end of login()
	
	public static String login(String id, String password) {
		for(int i = 0; i < members.length; i++) {
			if(members[i]!=null 
					&& members[i].getMemberId().equals(id) 
					&& members[i].getPassword().equals(password)) {
				return  members[i].getMemberName(); // id, password 일치
			} 
		}
		return null; // 일치하는 값이 없음
	} // end of login()
}
