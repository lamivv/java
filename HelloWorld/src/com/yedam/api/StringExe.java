package com.yedam.api;

public class StringExe {
	public static void main(String[] args) {
		for (String parm : args) {
			System.out.println(parm);

		}
		// 문제호출
//		연습();
//		no1();
//		no2();
//		no3();
	}

	static void 연습() {
		String str = "hello";
		String str1 = "world";
		StringUtil.연결하기(str, str1);
	}

	static void no1() {
		String ssn1 = "9803061234123"; // 13글자, 7번째 값
		String ssn2 = "991112 2341234";
		String ssn3 = "021112-3341234"; // 8번째 값이...
		StringUtil.checkGender(ssn1);
		StringUtil.checkGender(ssn2);
		StringUtil.checkGender(ssn3);
	}

	static void no2() {
		// 파일경로와 파일명
		String file1 = "C:/temp/flower.jpg";
		String file2 = "D:/web/prohect/guide.mp3";
		StringUtil.checkExtesion(file1);
		StringUtil.checkExtesion(file2);
	}

	static void no3() {
		// 문자의 갯수를 반환
		String str1 = "   suggest   ";
		String str2 = "   currently   ";
		String str3 = "   particular   ";
		StringUtil.getLength(str1);
		StringUtil.getLength(str2);
		StringUtil.getLength(str3);
	}

//		String ssn = "010624-1230123";
//		char sex = ssn.charAt(8);
//		switch (sex) {
//		case '1':
//		case '3':
//		case '5':
//		case '7':
//			System.out.println("남자입니다");
//			break;
//		case '2':
//		case '4':
//		case '6':
//		case '8':
//			System.out.println("여자입니다");
//			break;
//		default:
//			System.out.println("알 수 없음");
//
//		}
//
//		// String str = new String(매개값); byte[]
//		String str = new String(new byte[] { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 });
//		System.out.println(str.charAt(1));
//
//		byte[] result = str.getBytes(); // .getBytes() 문자열을 byte[]타입으로 반환해주는 것
//
//		for (byte b : result) {
//			System.out.println(b);
//		}
}
