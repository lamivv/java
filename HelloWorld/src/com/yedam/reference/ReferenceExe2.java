package com.yedam.reference;

public class ReferenceExe2 {
	public static void main(String[] args) {
//		String[][] score = {{"홍길동","80"},{"김민수","85"}, ... } // 1. 변수선언과 동시에 값을 입력
		String[][] score = new String[5][2]; // 2. 변수선언만 하고
		score[0][0] = "홍길동"; // 2. 값을 입력
		score[1][0] = "김민수";
		score[2][0] = "박헌수";
		score[3][0] = "심상현";
		score[4][0] = "최기동";
		score[0][1] = "80";
		score[1][1] = "85";
		score[2][1] = "88";
		score[3][1] = "90";
		score[4][1] = "75";
//		score[1] = new String[] {"김민수","85"}; // 2. 값을 입력

		for(int i = 0; i < score.length;i++) {
			System.out.println("점수=> "+ score[i][1]);
		} // end of for 점수의 나열
		
		int sum = 0;
		for(int i = 0; i < score.length;i++) {
			sum += Integer.parseInt(score[i][1]);
		} // end of for 점수의 합계
		System.out.println("점수들의 합계 : "+ sum);
		
		int max = 0;
		String who = "";
		for(int i = 0; i < score.length;i++) {
			if(Integer.parseInt(score[i][1]) >max) {
				max = Integer.parseInt(score[i][1]);
				who = score[i][0];
			}
		} // end of for 점수가 가장 큰 사람의 이름을 출력
		System.out.println("점수가 가장 큰 사람은 : "+ who +"입니다");
		
		
	} // end of main
} // end of class
