package com.yedam;

public class Variable1 {
	public static void main(String[] args){
		// int(4byte)
		int num1 = 1101111;
		// byte
		byte num2 = 27; // byte(1byte)
		// 1byte -128 ~ 127
		short num3 = 128; // 2byte
		long num4 = 11111111111111111L;
		System.out.println(Long.MAX_VALUE);
		
		byte num5 = 20;
		// 인트끼리 더한값을 바이트로 강제 형변환(casting)
		byte result= (byte)(num2 + num5); 
		int intResult = num1 +num5; //int 타입과 byte타입의 더하기...
		// 자동 형변환(promotion)
		System.out.println(intResult); // 큰타입으로 자동으로 형변환 되는 모습을 볼 수 있다 num1+(int)num5
		
		
		// 데이터타입 변수이름 = 값
		int[] intAry = {10, 25, 82, 11}; // 고정된 값으로 배열을 생성
		String[] strAry = {"Hong","Park","Choid"} ; // 문자열을 담을 수 있는 자료형
		// 자바스크립트와는 다르게 자바는 배열의 크기가 정해져서 변경이 불가능하다
		// 처음부터 크기를 넉넉하게 잡아준다
		int[] anotherAry = new int[10]; // 크기 10을 생성 [0]~[9]까지의 생성
		// 배열에 임의 값 입력
		for(int i=0; i<anotherAry.length;i++) {
			anotherAry[i] = (int) (Math.random()*100); // 실수값을 정수로 형변환(casting)
		}
		// 배열 값을 출력
		for(int num : anotherAry) {
			System.out.println(num);
		}
 		//System.out.println(anotherAry);
		
		// strAry[3] = "Kim"; // 배열이 [2]까지 고정되어서 추가로 넣을 수가 없음
		strAry[2] = "Kim";
		int sum = 0;
		for (int i=0;i< intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println(sum);
	}
}