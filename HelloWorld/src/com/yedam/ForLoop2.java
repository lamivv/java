package com.yedam;

import java.util.Scanner;

public class ForLoop2 {
	public static void main(String[] args) {
//		객체를 배열로
//		String[] infoAry = "뽀뽀,80".split(","); // ,를 기준으로 분리해서 배열로 반환 
//		split("")처럼 안에 아무것도 없으면 한글자 한글자 분리함
//		System.out.println(infoAry[0]);
//		System.out.println(infoAry[1]); // 숫자로 보이지만 문자열임.
//		System.out.println(Integer.parseInt(infoAry[1])); // 문자열을 정수타입으로 변환

//		String[] strAry = new String[10];
//		strAry[0] = "라라";
//		String name = "루루";
//		for(int i=0; i<strAry.length;i++) {
//			if(strAry[i]==null) {
//				strAry[i] = name;
//				break;
//			} 
//		} 
//		
//		// 출력하려면 null이 아닌값만 출력하면 된다....
//		for(int i=0; i<strAry.length;i++) {
//			if(strAry[i]!=null) {
//				System.out.println(strAry[i]);
//			} 
//		} 

		Scanner scn = new Scanner(System.in);
//		System.out.println("이름,점수 값을 입력");
//		String userval = scn.nextLine();
//		String[] val= userval.split(",");
//		System.out.printf("이름은 %s이고 점수는 %s입니다",val[0],val[1]);

		String[] studentAry = new String[10];
		studentAry[0] = "땅콩,100";
		studentAry[1] = "치즈,70";
		studentAry[2] = "망고,80";

		boolean run = true;

//		정수타입 intAry[]의 초기값은 0
//		문자열타입 strAry[]의 초기값은 null(문자열이 아님) 존재하지 않는다는 의미
//		for(int i = 0; i<studentAry.length; i++) {
//			System.out.println(studentAry[i]); // "null" != null 
//		}		

		while (run) {
			System.out.println("1.학생이름,점수 2.최고점수 3.학생입력(단건) 4.조회(이름) 9.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 학생이름,점수 입력
				System.out.println("학생이름과 점수를 입력해주세요");
				System.out.println("ex) 땅콩,55");
				for (int i = 0; i < studentAry.length; i++) {
					studentAry[i] = scn.nextLine();
				}
				System.out.println("등록이 완료되었습니다");
//				System.out.printf("%s\n",studentAry[0]);
//				System.out.printf("%s\n",studentAry[1]);
//				System.out.printf("%s\n",studentAry[2]);
				break;
			case 2: // 최고점수 출력
				// 문자열을 정수형으로 변환해서 비교해야함
				int max = 0;
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) { // 값이 있을 경우에만 연산
						String[] ary = studentAry[i].split(",");
						if (max < Integer.parseInt(ary[1])) {
							max = Integer.parseInt(ary[1]);
						}
					}
//					int temp = Integer.parseInt(studentAry[i].split(",")[1])
//					if(max <temp) {
//						max = temp;
//					}
				}
				System.out.printf("최고점은 %d입니다 \n", max);
				break;
			case 3: // 학생이름,점수 입력 (단건)
				System.out.println("학생이름과 점수를 입력해주세요");
				System.out.println("ex) 땅콩,55");
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] == null) {
						studentAry[i] = scn.nextLine();
						break;
					}
				}
				System.out.printf("등록이 완료되었습니다");
				break;
//				System.out.println("학생목록과 점수을 출력합니다");
//				for(int i = 0; i <studentAry.length;i++) {
//					if(studentAry[i]!=null) {
//						System.out.println(studentAry[i]);
//					}
//				}
//				break;
			case 4: // 조회기능 학생이름을 입력하면 점수를 반환
//				문자열과 문자열을 비교할 때에는 ("치즈땅콩".equals(입력받아 비교하려는 값 )); equals메소드를 사용해야한다.
				System.out.println("학생이름을 입력해주세요");
				String name = scn.nextLine();
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) {
						if (studentAry[i].split(",")[0].equals(name)) {
//							System.out.printf("확인되었습니다");
							System.out.printf("%s의 점수는 %s입니다 \n", studentAry[i].split(",")[0], studentAry[i].split(",")[1]);
							break;
						} 
					}
				}
//				System.out.println("없는 이름입니다.");
				break;
			case 9: // 종료
				System.out.println("프로그램을 종료합니다");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요");
			}
		} // end of while
		System.out.println("end of prog");
	} // end of main
} // end of class
