package com.yedam;
// 객체(object) 지향 언어
// class : 객체를 자바 언어로 정의
// HelloWorld.Java 소스코드 -> HelloWorld.class (실행)
// 클래스 이름과 파일 이름이 같아야 한다
// 소스코드는 src 폴더에 만들어진다
// 클래스(실행파일)는 bin 폴더에 만들어진다
public class HelloWorld {
	
	// method: 기능
	public static void main(String[] args) {
		System.out.println("Hello, World");
		
		int myAge = 20;
		myAge = 25;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
			System.out.println("i의 값은 " + i);
			sum += i;
			}
		}
		System.out.println("sum의 값은 "+ sum);
		System.out.println("커밋 푸쉬 테스트");
	}
}
