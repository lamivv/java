package com.yedam.inheritance;

public class CastingExe {
	public static void main(String[] args) {
		// byte < short < int < long 
		int n1 = 100;
		long n2 = 0;
		n2 = n1; // 자동형변환 promotion
		n1 = (int) n2; // casting
		
		// 상속관계
		// Object <- Friend <- ComFriend, UnivFriend
		
		
		// 자식은 부모에게 알아서 자동형변환 프로모션됨
		Friend f1 = new ComFriend("땅콩","010-1111","츄르사","먹음부"); // 자동형변환
		// 부모는 자식에게 자동형변환 되지않아서 강제타입변환 캐스팅을 해야함
//		ComFriend f2 = (ComFriend) new Friend("",""); // casting
		f1 = new Friend("치즈	","010-2222");
		System.out.println(f1.toString());
		
		if (f1 instanceof ComFriend) {
			ComFriend f2 = (ComFriend) f1;
			System.out.println(f2.showInfo());
		} else {
			System.out.println("형변환 못함");
		}
	}
}
