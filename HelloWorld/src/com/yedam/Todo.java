package com.yedam;

import java.util.Scanner;

// com.yedam.Todo
public class Todo {
	public static void main(String[] args) {
		// ctrl + space
		// 사용자의 입력을 읽어오는 방법
		// java.util.Scanner scn = new java.util.Scanner(System.in);
		// ctrl + shift + o // 임포트
		Scanner scn = new java.util.Scanner(System.in);
		// 복사기능 : ctrl + alt + 화살표

		int balance = 0; // 예금액

		// 입금액 누적/ 출금액 누적/ 종료하면 와일반복문의 끝.
		// 잔액은 최소 0원~ 최대 100,000원
		// 입금한도(100,000원) 초과입니다
		// 잔액이 부족합니다

		while (true) {
			System.out.println("1.입금 2.출금 3.잔액조회 4.종료");
			System.out.print("메뉴를 선택하세요> ");
			int num = Integer.parseInt(scn.nextLine());
			if (num == 1) { // 입금
				System.out.print("입금액 입력>");
				int incash = Integer.parseInt(scn.nextLine());
				if (balance + incash > 100000) {
					System.out.println("입금한도(100,000원) 초과입니다");
				} else {
					balance += incash;
					System.out.println("입금완료");
				}
			} else if (num == 2) { // 출금
				System.out.print("출금액 입력>");
				int outcash = Integer.parseInt(scn.nextLine());
				if (balance - outcash < 0) {
					System.out.println("잔액이 부족합니다");
				} else {
					balance -= outcash;
					System.out.print("출금완료");
				}
			} else if (num == 3) { // 잔액조회
				System.out.printf("현재 잔액은 %d입니다.\n", balance);
			} else if (num == 4) { // 종료
				System.out.printf("end of prog\n");
				break;
			}
		}

//		System.out.println("임의의 숫자를 입력하세요");

//		int num = scn.nextInt(); // 상수 숫자타입 반환
//		String num = scn.nextLine(); // 문자타입 반환
//		int num = Integer.parseInt(scn.nextLine()); // 문자타입을 int변환해서 반환

//		System.out.printf("입력한 값은 %d\n", num); // 숫자 출력
//		System.out.printf("입력한 값은 %s\n", num); // 문자 출력

	}
}
