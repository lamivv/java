package com.yedam.reference;

public class Calculator {

	// 1월 달력 출력
	public void showCalendar() {
		String[] days = { "Sum", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (String day : days) {
			System.out.printf("%4s", day);
		}
		System.out.println("\n-----------------------------");
		// 공백, 말일 계산
		int blank = 6; // 공백
		int endDay = 28;
		
		// 공백생성
		for (int i = 1; i <= endDay; i++) {
			if (i <= blank) {
				System.out.print("    ");
			}
		}
		
		for (int i = 1; i <= endDay; i++) {
			if ((i+blank) % 7 == 0) { // 7일마다 줄넘김 (토요일)
				System.out.printf(" %2d \n", i);
			}
			else { // 나머지 일자~
				System.out.printf(" %2d ", i);
			}
		}
	}

//	public String getBookInfo(String bTitle) {
//		Book[] bookRepo = 
//				{new Book("이것이 자바다","신용권","한빛미디어",10000),
//				new Book("자바스크립트기초","김자바","자바출판사",15000),
//				new Book("혼자공부하는자바","혼공자","한빛미디어",20000)};
//		for(int i =0; i<bookRepo.length;i++) {
//			if(bookRepo[i].getBookName().equals(bTitle)) {
//				return bookRepo[i].getBookAuthor();
//			}
//		} return null;
//	}

//	public int getBookInfo(String bTitle) {
//		Book[] bookRepo = 
//			{new Book("이것이 자바다","신용권","한빛미디어",10000),
//					new Book("자바스크립트기초","김자바","자바출판사",15000),
//					new Book("혼자공부하는자바","혼공자","한빛미디어",20000)};
//		for(int i =0; i<bookRepo.length;i++) {
//			if(bookRepo[i].getBookName().equals(bTitle)) {
//				return bookRepo[i].getBookPrice();
//			}
//		} return 0;
//	}

//	public boolean getBookInfo(String bTitle) {
//		Book[] bookRepo = 
//			{new Book("이것이 자바다","신용권","한빛미디어",10000),
//					new Book("자바스크립트기초","김자바","자바출판사",15000),
//					new Book("혼자공부하는자바","혼공자","한빛미디어",20000)};
//		for(int i =0; i<bookRepo.length;i++) {
//			if(bookRepo[i].getBookName().equals(bTitle)) {
//				return true;
//			}
//		} return false;
//	}

	public Book getBookInfo(String bTitle, Book[] bookAry) {
		Book[] bookRepo = { new Book("이것이 자바다", "신용권", "한빛미디어", 10000), new Book("자바스크립트기초", "김자바", "자바출판사", 15000),
				new Book("혼자공부하는자바", "혼공자", "한빛미디어", 20000) };
		for (int i = 0; i < bookAry.length; i++) {
			if (bookAry[i].getBookName().equals(bTitle)) {
				return bookAry[i];
			}
		}
		return null;
	}

	// 1~100사이 임의의 값을 반환(n개)배열
	public int[] randomAry(int n) {
		int[] result = new int[n];
		for (int i = 0; i < result.length; i++) {
			result[i] = (int) (Math.random() * 100);
		}
		return result;
	}

	// 두 숫자 중에서 큰 값을 반환
	public int getMax(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
//		if(num1>num2) {
//			return num1;
//		} 		
//		return num2;
	}

	// 183p 5번
	public void printStar(int num) {
		String sum = "";
		for (int i = 1; i <= num; i++) {
			sum += "*";
			System.out.println(sum);
		}
	}

	public void printStar2(int times) {
		for (int i = 1; i <= times; i++) {
			printStar(i, "*");
			System.out.println();
		}
	}

	// 별 출력하는 메소드
	public void printStar(int times, String types) { // 매개변수
		// 매개변수에 매개값을 받아서 적용 반영
		for (int i = 1; i <= times; i++) {
			System.out.print(types);
		}
	} // end of printStar

	// 두 수의 합을 반환하는 메소드
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	// 매개변수의 타입이 다르면 동일한 이름(중복)의 매소드를 정의가능
	// 매소드 오버로딩(overloading)이라고 한다.
	// 생성자도 가능하다. 생성자 오버로딩
	public double sum(double num1, double num2) {
		return num1 + num2;
	}

	public int sum(int[] intAry) {
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		return sum;
	}

} // end of Calculator
