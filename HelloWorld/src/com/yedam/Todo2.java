package com.yedam;

import java.util.Scanner;

public class Todo2 {
	public static void main(String[] args) {
		// 친구정보관리 앱 v.1
		// 이름, 연락처, 성별(남/여) = 땅콩,010-0000-0000,남
		// 기능1. 목록출력(이름,연락처,성별)
		// 기능2. 등록
		// 기능3. 조회(성별에 따른 출력)
		// 기능4. 삭제(이름)
		// 기능5. 수정(이름으로 조회)(연락처를 수정)
		// 기능9. 종료
		// String[] friendAry 크기 100;

		Scanner scn = new Scanner(System.in);

		String[] friendAry = new String[100];
		// 기본 제공 친구 목록
		friendAry[0] = "땅콩/010-0000-0000/남";
		friendAry[1] = "치즈/010-1111-1111/여";
		friendAry[2] = "망고/010-2222-2222/여";

		boolean run = true;

		while (run) {
			System.out.println("1.친구목록조회 2.등록 3.조회(성별) 4.삭제(이름) 5.수정(이름) 9.종료");
			System.out.println("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine()); // scn.nextInt();

			switch (menu) {
			case 1: // 목록출력
				System.out.println("========================");
				System.out.println("친구 목록을 조회합니다");
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						System.out.println(friendAry[i]);
					}
				}
				System.out.println("========================");
				break;
			case 2: // 등록
				System.out.println("========================");
				System.out.println("친구의 이름/전화번호/성별을 입력해주세요");
				System.out.println("예시 : 땅콩/010-0000-0000/여");
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] == null) {
						String newf = scn.nextLine();
						if (friendAry[i].split("/")[0].equals(newf.split("/")[0])){
							System.out.println("동일한 이름의 친구가 이미 있습니다. 추가로 등록하시겠습니까 ?");
							System.out.println("예/아니오");
							if ("예".equals(scn.nextLine())) {
								friendAry[i] = newf;
								break;
							}
						} else {
							friendAry[i] = newf;
						}
					}
				}
				System.out.println("친구가 등록되었습니다");
				System.out.println("========================");
				break;
			case 3: // 조회(성별)

				// filter?

				System.out.println("========================");
				System.out.println("친구의 성별을 입력하세요 (예: 남)");
				String sex = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						if (friendAry[i].split("/")[2].equals(sex)) {
							System.out.println(friendAry[i]);
						}
					}
				}
				System.out.println("입력한 성별로 조회가 완료되었습니다");
				System.out.println("========================");
				break;
			case 4: // 삭제(이름)
				System.out.println("========================");
				System.out.println("삭제할 친구이름을 입력하세요");
				String remove = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						if (friendAry[i].split("/")[0].equals(remove)) {
//							friendAry[i].remove(); // 이거 안됨 .. 자바스크립트 ..
							friendAry[i] = null;
						}
					}
				}
				System.out.println("삭제되었습니다");
				System.out.println("========================");
				break;
			case 5: // 수정(이름)
				System.out.println("========================");
				System.out.println("친구의 이름을 입력하세요");
				String name = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						if (friendAry[i].split("/")[0].equals(name)) {
							System.out.printf("현재 친구의 전화번호는 %s 입니다.\n", friendAry[i].split("/")[1]);
							System.out.println("변경된 친구의 전화번호를 입력하세요");
							String sum = friendAry[i].split("/")[0] + "/" + scn.nextLine() + "/"
									+ friendAry[i].split("/")[2];
							friendAry[i] = sum;
							System.out.printf("<%s> 으로 변경되었습니다\n", sum);
							System.out.println("========================");
						}
					}
				}
				break;
			case 9: // 종료
				System.out.println("========================");
				System.out.println("프로그램을 종료합니다.");
				System.out.println("========================");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요");
				;

			}

		}

	}
}
