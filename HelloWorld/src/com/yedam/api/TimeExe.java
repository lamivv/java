package com.yedam.api;

public class TimeExe {
	public static void main(String[] args) {

		// ?분 ?초 소요되었습니다. 짝수의 합은 ?입니다. 출력
		// 1부터 10,000,000,000까지 250의 배수 합을 구하는데 걸리는 시간

		// 시작시간
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);

		int sum = 0;
		for (long i = 1; i <= 10000000000l; i++) {
			if (i % 250 == 0) {
				sum += i;
//				System.out.println(sum);
			}
		} // end of for

		long endTime = System.currentTimeMillis();
		System.out.println(endTime);

		// 소요된 시간에 대해서 밀리세컨드를 초단위로 변환
		long sec = (endTime - startTime)/1000;
		// 분단위 초단위 표시
		System.out.println(sec/60+"분 "+sec%60+"초 소요되었습니다. 250의 배수의 합은 "+sum+"입니다." );

	} // end of main
} // end of class TimeExe
