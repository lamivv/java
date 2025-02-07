package com.yedam.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe {
	public static void main(String[] args) {
		// set
		// 중복된 값은 담지 않음. Null도 한번만 담을 수 있음

		Set<String> set = new HashSet<String>();

		set.add("홍길동");
		set.add("반갑습니다");
		set.add("1000");
		set.add(String.valueOf(true));
		set.add("홍길동");

		// 반복자 : set.iterator();
		// 객체를 담고있는 요소를 가리키는 지시자를 받아와서 반복자를 얻고 반복자로 검색 기능 대체(for)
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) { // 컬렉션에 요소가 있는지 확인-> 있으면 True
			String result = iter.next(); // 컬렉션의 요소를 반환
			System.out.println(result);
		} // end of while
		
		for(String str : set) { // 향상된 for구문
			System.out.println(str);
		}
	} // end of main
} // end of class SetExe
