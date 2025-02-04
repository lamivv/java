package com.yedam.inheritance;

public class FriendManager {
	public static void main(String[] args) {
//		FriendExe app = new FriendExe(); // 싱글톤 설정해서 이런방식으로 못 불러옴
		FriendExe app = FriendExe.getInstance(); // 싱글톤설정으로 이렇게 해야함
		app.run();
		
		// 홍길동, 010-1111-2222
		// 김민수, 010-2222-3333, 예담, 역사학과
		// 박민규, 010-2222-4444, 구글, 개발팀
//		Friend[] friendAry = new Friend[10];
//		friendAry[0] = new Friend("홍길동", "010-1111-2222");
//		friendAry[1] = new ComFriend("박민규", "010-2222-4444", "구글", "개발팀");

//		UnivFriend[] univAry = new UnivFriend[10];
//		friendAry[2] = new UnivFriend("김민수", "010-2222-3333", "예담", "역사학과");

	}
}
