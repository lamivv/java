package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.List;

import com.yedam.inheritance.ComFriend;
import com.yedam.inheritance.Friend;
import com.yedam.reference.Student;

/*
 String[] strAry;
 Collection 1) List 2) Set 3) Map
 */
public class Exe {
	public static void main(String[] args) {
		System.out.println("홍길동".indexOf("길동"));
		
		
		// 학생 정보를 저장하는 컬렉션(ArrayList) 선언
		// 3명 추가
		// 반복문 활용해서 출력
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("김땅콩", 50, 70));
		student.add(new Student("김치즈", 100, 5));
		student.add(new Student("정망고", 30, 60));
		
		// 삭제
		for (int i = 0; i < student.size(); i++) {
			if(student.get(i).getStudentName().equals("정망고")) {
				// student[i]
				student.remove(i);
				break;
			}
		}
		
		for (int i = 0; i < student.size(); i++) {
			System.out.println("이름: "+student.get(i).getStudentName());
		}

	} // end of main

	void method() {
		String[] strAry = new String[10]; // 배열
		List<String> strList = new ArrayList<String>(); // 문자열을 담을 수 있는 List Collection
		List<Friend> friends = new ArrayList<Friend>();

		friends.add(new Friend("홍길동", "010-111"));
		friends.add(new ComFriend("김길동", "010-2222", "국민은행", "신용보증팀"));

		friends.remove(new Friend("홍길동", "010-111"));
		System.out.println("friendst 크기: " + friends.size());

		System.out.println(friends.get(1).showInfo());

		// 추가
		strList.add("안녕하세요");
		strList.add("Hello");
		strList.add("반갑습니다");
		System.out.println("strList 크기: " + strList.size());

		// 삭제
		strList.remove(0);
		strList.remove("Hello");
		System.out.println("strList 크기: " + strList.size());

		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
}
