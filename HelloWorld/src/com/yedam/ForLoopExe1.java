package com.yedam;

import java.util.Scanner;

public class ForLoopExe1 {
	public static void main(String[] args) {
		// 학생점수 입력 받아서 배열에 저장
		// 최고점수, 평균, 합계점수 출력

		boolean run = true;
		Scanner scn = new Scanner(System.in);
		// 정수배열 선언
		int[] scores = new int[3];

		while (run) {
			System.out.println("1.학생점수 입력 2.최고점수 3.합계점수와 평균점수 4.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) { // 만일 2번과 3번을 모두 실행하려면 2번을 선택하고 2번의 break를 삭제한다
			case 1: // 학생점수 입력
				for (int i = 0; i < scores.length; i++) {
					System.out.print("점수를 입력하세요>");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
				System.out.println("점수가 모두 입력되었습니다");
				break;
			case 2: // 최고점수 출력
				int max = 0;
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.printf("최고점은 %d입니다 \n", max);
				break;
			case 3: // 합계점수와 평균점수
				int sum = 0;
				double avg = 0; // 평균은 실수가 나올 수 있음
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				avg = sum * 1.0 / scores.length;
				System.out.printf("합계는 %d, 평균은 %f입니다.\n", sum, avg);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다");
				run = false;
				break;
			default: // case의 경우가 아닌 모든 경우
				System.out.println("메뉴를 다시 선택하세요");
			}
		}
		System.out.println("end of prog.");

	}
}
