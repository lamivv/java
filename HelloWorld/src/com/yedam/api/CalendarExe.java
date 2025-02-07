package com.yedam.api;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); // 인스턴스 생성... Calendar클래스는 new ... 사용하지않음
		today.set(Calendar.YEAR, 2024); // 필드 : 값;
		today.set(2024, 1 , 10); // 2024년 2월 10일
		
		int year = today.get(Calendar.YEAR); // 1(YEAR), 2(MONTH), 3... 매개값에 상수넣어도됨
		int month = today.get(Calendar.MONTH); // 월 정보
		int date = today.get(Calendar.DATE); // 날짜 정보
		int day = today.get(Calendar.DAY_OF_WEEK); // 요일정보
		int dayOfMonth = today.getActualMaximum(Calendar.DATE); // DATE값의 맥스 정보 = 말일

		System.out.printf("%d년 %d월 %d일 $d요일\n", year, month + 1, date, day);
		System.out.println("말일은 " + dayOfMonth);

	}
}
