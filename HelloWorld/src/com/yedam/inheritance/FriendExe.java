package com.yedam.inheritance;

import java.util.Scanner;

/*
 친구목록, 등록, 수정, 삭제
 */
public class FriendExe {
	// 싱글톤
	// 1. 필드 선언
	private static FriendExe instance = new FriendExe();

	// 2. 생성자 은닉
	private FriendExe() {
	}

	// 3. 인스턴스를 반환하는 메소드
	public static FriendExe getInstance() {
		return instance;
	}

	Friend[] friends = new Friend[100]; // 저장공간

	// 초기데이터
	public void init() {
		friends[0] = new Friend("홍길동", "010-1111-2222");
		friends[1] = new UnivFriend("김민식", "010-3333-2222", "우리대학교", "복지학과");
		friends[2] = new ComFriend("박민규", "010-4444-2222", "인포젠", "개발팀");
	}

	Scanner scn = new Scanner(System.in);

	// 시작메소드
	public void run() {
		init();
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.친구목록 | 2.등록 | 3.수정 | 4.삭제 | 9.종료");
			System.out.println("----------------------------------------");
			System.out.print("메뉴선택> ");
			int menu = scn.nextInt();
			scn.nextLine();
			switch (menu) {
			case 1: // 목록
				friendList();
				break;
			case 2: // 등록
				addfriend();
				break;
			case 3: // 수정
				editfriend();
				break;
			case 4: // 삭제
				delfriend();
				break;
			case 9: // 종료
				System.out.println("종료합니다");
				run = false;
				break;
			default: // 예외
				System.out.println("메뉴를 다시 선택하세요");
				break;
			} // end of switch
			System.out.println("");
		} // end of while
	} // end of run

	// 추가메소드
	void friendList() { // 목록
		System.out.println("친구목록");
		boolean isExist = false;
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				isExist = true;
				System.out.println(friends[i].showInfo());
//				if (friends[i] instanceof Friend) {
//					System.out.println("이름: " + friends[i].getFriendName() + ", 연락처: " + friends[i].getPhoneNumber());
//				} else if (friends[i] instanceof UnivFriend) {
//
//				} else if (friends[i] instanceof ComFriend) {
//
//				}
			}
		}
		if (!isExist) {
			System.out.println("데이터가 없습니다");
		}
	} // end of friendList()

	// 공통 입력값인 이름과 연락처는 choice if밖에서 수집
//	String name;
//	String phone;
//
//	void basic() {
//		System.out.print("이름> ");
//		name = scn.nextLine();
//		System.out.print("연락처> ");
//		phone = scn.nextLine();
//	}

	void addfriend() { // 등록
		// 친구 : 이름, 연락처
		// 학교 : 친구 + 학교명, 전공
		// 회사 : 친구 + 회사명, 부서
//		boolean dodo = true;
//		
//		while (dodo) {
//			System.out.println("1.친구 | 2.학교친구 | 3.회사친구 | 4.종료");
//			System.out.print("선택> ");
//			int choice = scn.nextInt();
//			scn.nextLine();
//			
//			Friend friend = null;
//			if (choice == 1) {
//				basic();
//				friend = new Friend(name, phone);
//			} else if (choice == 2) {
//				basic();
//				System.out.print("학교명> ");
//				String univ = scn.nextLine();
//				System.out.print("전공명> ");
//				String major = scn.nextLine();
//				friend = new UnivFriend(name, phone, univ, major);
//			} else if (choice == 3) {
//				basic();
//				System.out.print("회사명> ");
//				String company = scn.nextLine();
//				System.out.print("부서명> ");
//				String qntj = scn.nextLine();
//				friend = new ComFriend(name, phone, company, qntj);
//			} else if (choice == 4) {
//				System.out.println("친구 등록을 종료합니다");
//				dodo = false;
//				return;
//			} else {
//				System.out.println("잘못 입력하셨습니다");
//				return;
//			}
//
//			// 빈배열에 입력받은 값 저장
//			for (int i = 0; i < friends.length; i++) {
//				if (friends[i] == null) {
//					friends[i] = friend;
//					System.out.println("등록되었습니다");
//					break;
//				}
//			}
//		}
		boolean dodo = true;

		while (dodo) {
			System.out.println("1.친구 | 2.학교친구 | 3.회사친구 | 4.종료");
			System.out.print("선택> ");
			int choice = scn.nextInt();
			scn.nextLine();

			// 종료처리
			if (choice == 4) {
				return; // 메소드 종료
			}

			// 메뉴선택예외
			if (choice > 3 || choice < 1) {
				System.out.println("메뉴를 확인하세요.");
				continue;
			}

			// 이름 입력
			String name = "";
			while (true) {
				System.out.print("이름> ");
				name = scn.nextLine();
				// 이름길이의 정상 범위
				if (name.length() >= 2 && name.length() <= 10) {
					break;
				} else {
					System.out.println("이름은 2글자 이상 10글자 이하로 입력해주세요");
				}
			}
			// 연락처 입력
			System.out.print("연락처> ");
			String phone = scn.nextLine();

			Friend friend = null;
			if (choice == 1) { // 기본친구
				friend = new Friend(name, phone);
			} else if (choice == 2) { // 학교친구
				System.out.print("학교명> ");
				String univ = scn.nextLine();
				System.out.print("전공명> ");
				String major = scn.nextLine();
				friend = new UnivFriend(name, phone, univ, major);
			} else if (choice == 3) { // 회사친구
				System.out.print("회사명> ");
				String company = scn.nextLine();
				System.out.print("부서명> ");
				String qntj = scn.nextLine();
				friend = new ComFriend(name, phone, company, qntj);
			} else if (choice == 4) {
				System.out.println("친구 등록을 종료합니다");
				dodo = false;
				return;
			} else {
				System.out.println("잘못 입력하셨습니다");
				return;
			}

			// 빈배열에 입력받은 값 저장
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] == null) {
					friends[i] = friend;
					System.out.println("등록되었습니다");
					break;
				}
			}
		}
	} // end of addfriend()

	void editfriend() { // 수정
		System.out.println("친구수정");
		boolean isExist = false;
		// 조회 : 이름, 수정 : 연락처
		// 연락처를 바꾸는 수정 메소드
		System.out.print("연락처 변결할 사람의 이름을 입력하세요> ");
		String name = scn.nextLine();
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getFriendName().equals(name)) {
				System.out.print("변경된 연락처를 입력하세요> ");
				String phone = scn.nextLine();
				friends[i].setPhoneNumber(phone);
				System.out.println("변경되었습니다");
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			System.out.println("찾는 정보가 없습니다");
		}

	} // end of editfriend()

	void delfriend() { // 삭제
		System.out.println("친구삭제");
		boolean isExist = false;
		System.out.print("이름 입력> ");
		String name = scn.nextLine();
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getFriendName().equals(name)) {
				friends[i] = null;
				System.out.println("삭제되었습니다");
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			System.out.println("찾는 정보가 없습니다");
		}
	} // end of delfriend()

} // end of class FriendExe
