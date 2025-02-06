package com.yedam.api;

import java.util.HashSet;
import java.util.Set;

public class HashExe {
	public static void main(String[] args) {
		// 컬렉션 (List / Set / Map) 
		// Set : 인덱스로 구분하는게 아니라 무작위로 값을 담음
		// Set : 중복된 값은 저장 불가
		// 중복된 값의 기준은 hashCode()와 equals가 반환해주는 값이 같을 경우이다
		// hashCode + equals => 판단
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("user01",100));
		set.add(new Member("user01",100));
		set.add(new Member("user02",110));
		
		for (Member mem : set) {
//			System.out.println(mem.memberId+ ", " +mem.memPoint);
			System.out.println(mem.toString());
		}
	}
}
