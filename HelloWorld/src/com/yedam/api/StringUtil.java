package com.yedam.api;

public class StringUtil {

	static void 연결하기(String str, String str2) {
		// 문자를 연결하는 메소드 "" + "" + ""
		System.out.println(str.concat(", ").concat(str2));
	}

	static void checkGender(String ssn) {
		// 성별을 출력. "남자입니다" 또는 "여자입니다"
		char sex = 0;
		
		sex = ssn.charAt(ssn.length()-7);
		switch (sex) {
		case '1':
		case '3':
		case '5':
		case '7':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
		case '6':
		case '8':
			System.out.println("여자입니다");
			break;
		default:
			System.out.println("알 수 없음");
		}
	}

	static void checkExtesion(String file) {
		String 확장자 = file.substring(file.indexOf(".")+1);
		System.out.println("파일의 확장자는 "+확장자+" 입니다.");				
		// 파일의 확장자는 jpg (또는 mp3, hwp) 입니다.
	}

	static void getLength(String str) {
		// 문장의 길이는 7글자입니다.
		// 공백제거한 후의 글자 길이
		System.out.println("문장의 길이는 "+str.trim().length()+"글자 입니다");
	}

} // end of class StringUtil
