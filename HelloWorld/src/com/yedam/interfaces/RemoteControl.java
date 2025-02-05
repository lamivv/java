package com.yedam.interfaces;

/*
 인터페이스
 필드(상수), 메소드(추상메소드)
 */

public interface RemoteControl {
	// 상수 : 값 변경이 불가능한 상수로 선언된다
	public int MAX_VOLUME = 10; 
	
	// 추상메소드 : 기능 구현은 없고 정의만 가능하다
	public void turnOn(); 
	public void tirnOff();
	
} // end of interface RemoteControl
