package com.yedam.interfaces;
/*
 RemoteControl 인터페이스의 구현클래스 
 */
public class Radio implements RemoteControl {
	
	@Override
	public void turnOn() {
		System.out.println("라디오의 전원을 켭니다.");
	}

	@Override
	public void tirnOff() {
		System.out.println("라디오의 전원을 끕니다.");
	}
}
