package com.yedam.reference;
 // gender => MEN, WOMEN 두개의 값만 올 수 있도록 지정하는것 .. 열거형 Enum
public class Student {
	// 필드(속성을 저장하기 위한) : 이름, 영어점수, 수학점수
	private String studentName;
	private int engScore;
	private int mathScore;
	private Gender gender; // 남, 여, 남자, M

	// public, default(기본접근제한자), private => 접근제한자(access modifier)
	// 기본접근제한자는 같은 패키지 내에서 사용할 수 있음
	// public은 다른 패키지에서도 접근할 수 있게 해서 사용가능함
	// 생성자: 필드의 초기값을 지정해서 인스턴스 생성
	Student() { // 기본 생성자: 매개값이 없는 생성자
	}
	// 기본생성자는 다른 생성자가 없다면 자동으로 생성된다.
	// 어떠한 생성자가 정의되어있다면 기본생성자는 자동으로 생성되지 않아서 별도로 생성해야한다

	Student(String studentName, int engScore) { // 매개값이 있는 생성자
		this.studentName = studentName; // this : 필드에 있는 studentName
		this.engScore = engScore;
	}

	public Student(String studentName, int engScore, int mathScore) {
		this.studentName = studentName;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	// 메소드 (기능)
	void printInfo() { // void : 리턴파일이 없습니다
		System.out.printf("이름 %3s | 영어점수 %3d | 수학점수 %3d\n", studentName, engScore, mathScore);
	}

	// 메소드추가 (기능) : 평균을 반환
	double getAverage() {
		return (engScore + mathScore) / 2.0;
	}

	// getter, setter 
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		if(engScore < 0) {
			this.engScore = 0;
		} else {
			this.engScore = engScore;
		}
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
}
