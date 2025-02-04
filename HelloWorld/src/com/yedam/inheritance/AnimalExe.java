package com.yedam.inheritance;

public class AnimalExe {
	public static void main(String[] args) {
//		Animal animal = new Animal(); 
		// 추상클래스는 실체 클래스를 만들 수 없다
		// 상속받는 자식클래스에게 규칙을 적용하려고 만드는 것
		Animal animal = null;
		
		// 다형성 
		animal = new Dog(); // 자식클래스를 통해서 존재한다.
		animal.sound();
		
		animal = new Cat(); 
		animal.sound();
	}
}
