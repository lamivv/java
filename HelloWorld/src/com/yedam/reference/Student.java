package com.yedam.reference;

public class Student {
	// 필드(속성을 저장하기 위한) : 이름, 영어점수, 수학점수
	String studentName;
	int engScore;
	int mathScore;

	// 생성자: 필드의 초기값을 지정해서 인스턴스 생성
	Student() { // 기본 생성자: 매개값이 없는 생성자
	}
	// 기본생성자는 다른 생성자가 없다면 자동으로 생성된다.
	// 어떠한 생성자가 정의되어있다면 기본생성자는 자동으로 생성되지 않아서 별도로 생성해야한다

	Student(String studentName, int engScore) { // 매개값이 있는 생성자
		this.studentName = studentName; // this : 필드에 있는 studentName
		this.engScore = engScore;
	}

	Student(String studentName, int engScore, int mathScore) {
		this.studentName = studentName;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	// 메소드 (기능)
	void printInfo() { // void : 리턴파일이 없습니다
		System.out.printf("이름은 %s, 영어점수%d, 수학점수%d\n", studentName, engScore, mathScore);
	}

	// 메소드추가 (기능) : 평균을 반환
	double getAverage() {
		return (engScore + mathScore) / 2.0;
	}

}
