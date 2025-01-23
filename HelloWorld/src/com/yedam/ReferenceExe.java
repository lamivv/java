package com.yedam;

import com.yedam.reference.ReferenceExe1;

public class ReferenceExe {
	public static void main(String[] args) {

		ReferenceExe1 ref1;

		ref1 = new ReferenceExe1(); // 인스턴스를 생성해야 사용가능 . new : 인스턴스를 만든다 (실체를 만든다)

		ref1.method1(); // public
//		ref1.method2(); // private // 에러 발생

	} // end of main
} // end of ReferenceExe
