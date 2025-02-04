package com.yedam.reference;

import java.util.Scanner;

public class StudentExe {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		
		// final == const 상수선언
		final Student std1 = new Student("홍길동", 80); // 생성자를 호출하면 실체를 만들어준다(인스턴스 생성)
//		std1 = new Student ("Hong", 88); // final로 설정된 부분이라서 오류발생
		std1.setStudentName("홍길동");
		std1.setEngScore(80);
		std1.setMathScore(85);
		std1.setGender(Gender.MEN);

		Student std2 = new Student(); // 생성자를 호출하면 실체를 만들어준다(인스턴스 생성)
		std2.setStudentName("김민수");
		std2.setEngScore(85);
		std2.setMathScore(88);
		std2.setGender(Gender.MEN);

		// 홍정학, 45, 90
		Student std3 = new Student(); // 생성자를 호출하면 실체를 만들어준다(인스턴스 생성)
		std3.setStudentName("홍정학");
		std3.setEngScore(45);
		std3.setMathScore(90);
		std3.setGender(Gender.WOMEN);

		students[0] = std1;
		students[1] = std2;
		students[2] = std3;
		students[3] = new Student("김민지", 88, 92);

//		for(int i =0; i <students.length;i++) {
//			if(students[i] != null && students[i].engScore >= 80) {
////				System.out.printf("이름은 %s, 영어는%d, 수학은%d입니다\n",
////						students[i].studentName,
////						students[i].engScore,
////						students[i].mathScore);
//				students[i].printInfo();
//			}
//		} // end of for 영어점수 80점이상인 학생 목록 출력 

//		for(int i =0; i <students.length;i++) {
//			if(students[i] != null && students[i].getAverage() >= 85) {
//				students[i].printInfo();
//			}
//		} // end of for 평균점수 85점이상인 학생 목록 출력 

		// 학생의 이름을 입력받는 변수 : studName
		// 학생의 평균을 출력하는 프로그램을 작성
		Scanner scn = new Scanner(System.in);
//		System.out.println("학생 이름을 입력하세요");
//		String studName = scn.nextLine();
		
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null 
//					&& students[i].studentName.equals(studName)
					&& students[i].getGender() == Gender.MEN) {
				students[i].printInfo();
//				System.out.printf("%s학생의 평균 점수는 %.2f입니다.", studName, students[i].getAverage());
			}
		} // end of for 학생의 평균을 출력
	} // end of main
}
