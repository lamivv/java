package com.yedam.reference;

public class ReferenceExe1 {
	public static void main(String[] args) { // 호출하면 바로 실행 가능하게 해주는 main 메소드
		// static 정적 메소드 인스턴스를 만들지 않아도 사용할 수 있다
//		ReferenceExe1.main(args); // static메소드는 클래스이름.메소드();로 바로 호출

		// 배열 선언.
		double[] dblAry = new double[5]; // 크기 5개의 공간의 배열을 선언
		dblAry[0] = 171.3; // 이미 선언된 배열에 값을 담은 것
//		System.out.println(dblAry.length);
		for (int i = 0; i < dblAry.length; i++) {
//			System.out.println(dblAry[i]);
		}

//		dblAry = {}; // 다시 배열을 선언하면서 값을 담는 것

		dblAry = new double[] { 160.5, 174.6 }; // 새로운 배열을 선언하면서 담은 것
//		System.out.println(dblAry.length);

		// 배열[][] => 다차원배열
		int[][] intAry = new int[2][3]; // 크기 2개와 3개 공간의 배열을 선언
		intAry[0][0] = 10;
		intAry[0][1] = 20;
		intAry[0][2] = 30;
		intAry[1][0] = 20;
		intAry[1][1] = 30;
		intAry[1][2] = 40;
		for (int j = 0; j < intAry.length; j++) {
			for (int i = 0; i < intAry[0].length; i++) {
				System.out.println("intAry[" + j + "][" + i + "] => " + intAry[j][i]);
			} // end of for i
		} // end of for j
	} // end of main

	public int sum(int num1, int num2) { // int타입을 반환해야 함 //void는 반환하는 값이 없을때...
		return num1 + num2;
	} // end of sum

	public void method1() { // 다른 클래스에서 접근 가능하게 하는 것
		System.out.println("method1()이 호출되었습니다");
	} // end of method1

	private void method2() {// 다른 클래스에서 접근 불가능하게 하는 것
		System.out.println("method2()이 호출되었습니다");
	} // end of method2

} // end of class
