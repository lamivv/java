package com.yedam.reference;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; //Ctrl Shift O

public class DateExe {

	public static void main(String[] args) {
		// Date 클래스 기능
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.toGMTString());
		System.out.println(now.toLocaleString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss"); // 24시
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); // 12시
		System.out.println(sdf.format(now));
		
		// 년도-월-일 시:분:초
		// date타입으로 반환
		try { // 예외 발생하더라도 catch 구문을 실행하고 정상종료
			now = sdf.parse("2024-12-25 12:00:00"); // 포맷 설정한대로 입력
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(now);
		System.out.println("end of prog.");
	}
}
