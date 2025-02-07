package com.yedam.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		// 1. index로 요소들을 관리한다는 특징 
		// 2. 중복될 수 있고 
		// 3. Null값도 가질 수 있다
		strList.add(null);
		strList.add("Hong");
		strList.add(new String("kildong"));
		strList.add(new String(new byte[] { 77, 108, 108, 111, 96 }));
		
		strList.remove(0); // index값이 0 제거
		strList.size(); // 컬렉션 크기
		
		strList.add(0,"Hello"); // index 0에 추가 
		strList.clear(); // 모두 지우기
		
		for (int i =0; i < strList.size(); i++) {
			System.out.println(strList.get(i)); // index i번째 값 반환
		}
		
		System.out.println(strList.contains("Hong")); // 매개값을 포함하고 있는지 여부 확인
	}
}
