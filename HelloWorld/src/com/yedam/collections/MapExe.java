package com.yedam.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExe {
	public static void main(String[] args) {
		// put의 순서는 의미없음
		// 키의 값이 같으면 기존의 값을 새로운 값으로 덮어쓴다.

		// 키:값 => 엔트리객체
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 90);
		map.put("김민수", 80);
		map.put("박은수", 85);
		map.put("김민수", 77);

		// 키 값을 알면 밸류값을 반환
		Integer val = map.get("홍길동");

		// 키 값을 set 반환
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.printf("키 : %s, 값: %d\n", key, map.get(key));
		}

		// 키:값(엔트리) 엔트리반환
		// Set으로 entry를 담아주는 타입 .entrySet();
		Set<Entry<String, Integer>> entry = map.entrySet();
		for(Entry<String, Integer> ent : entry) {
			System.out.printf("키: %s, 값: %d\n", ent.getKey(), ent.getValue());
		}
	}
}
