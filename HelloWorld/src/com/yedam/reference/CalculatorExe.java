package com.yedam.reference;

import java.awt.print.Printable;

public class CalculatorExe {
	public static void main(String[] args) {
		Calculator cal = new Calculator(); // 인스턴스선언 생성자 호출: 이게 있어야 Calculator의 메소드 사용가능
		
		Book[] bookStore = 
				{ new Book("이것이 자바다", "신용권", "한빛미디어", 10000), 
				new Book("자바스크립트기초", "김자바", "자바출판사", 15000),
				new Book("혼자공부하는자바", "혼공자", "한빛미디어", 20000), 
				new Book("혼자공부CSS", "CSS", "한빛미디어", 20000),
				new Book("혼자공부HTML", "HTML", "한빛미디어", 20000) };
		
		cal.showCalendar();
		
//		String author = cal.getBookInfo("이것이 자바다");
//		if (author != null) {
//			System.out.println(author);
//		} else {
//			System.out.println("조회결과 없습니다");
//		}
		
//		int price = cal.getBookInfo("자바스크립트기초");
//		if (price != 0) {
//			System.out.println(price);
//		} else {
//			System.out.println("조회결과 없습니다");
//		}

//		boolean price = cal.getBookInfo("자바스크립트기초");
//		if (price) {
//			System.out.println("조회결과 있습니다.");
//		} else {
//			System.out.println("조회결과 없습니다");
//		}
		
//		Book author = cal.getBookInfo("혼자공부CSS", bookStore);
//		if (author != null) {
//			author.showDetailInfo();
//		} else {
//			System.out.println("조회결과 없습니다");
//		}
		
//		int[] randomA = cal.randomAry(5);
//		for(int num : randomA) {
//			System.out.println(num);
//		}
//		System.out.println(cal.sum(randomA));
		
//		int[] ary1 = { 14, 23, 11, 14, 24 };
//		int[] ary2 = { 33, 23, 6, 12, 9 };
//		
//		System.out.println(
//				cal.getMax(cal.sum(ary1),cal.sum(ary2))); 
	
//		cal.printStar(3, "*"); // 매개값

//		int result = cal.sum(5, 6);
//		result = cal.sum(new int[]{10,20,30,40});
		// double>float>long>int>short>byte
//		System.out.println("결과 : "+result);

//		cal.printStar3(4);

//		double result0 = cal.sum(5.5, 20);
//		System.out.println("결과 : "+result0);
	} // end of main

} // end of CalculatorExe