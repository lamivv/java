package com.yedam.stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 학생정보 관리프로그램 v.1
 * 학생이름, 키, 몸무게, 점수
 */
public class StudentApp {
	Scanner scn = new Scanner(System.in);
	boolean run = true;

	// 임시저장소
	List<Student> students = new ArrayList<>();
	
	public StudentApp() {
		init(); // 초기값 읽어오기
	}

	public void start() {
		while (run) {
			System.out.println("1.목록 2.추가 3.삭제 9.종료");
			System.out.print("선택> ");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				studentList();
				break;
			case 2:
				addStudent();
				break;
			case 3:
				removeStudent();
				break;
			case 9:
				System.out.println("프로그램 종료");
				save();
				run = false;
				break;
			default:
				System.out.println("메뉴를 확인하세요");
				break;
			}
		}
		System.out.println("end of prog");
	} // end of start

	public void studentList() {
		// 이름 점수
		// ----------
		// 홍길동 90
		System.out.println(" 이름    점수");
		System.out.println(" ----------");
		for (Student std : students) {
			System.out.println(" " + std.getName() + "   " + std.getScore() + " ");
		}

	} // end of studentList()

	public void addStudent() {
		System.out.println("학생 정보를 입력해주세요");
		System.out.print("학생이름> ");
		String name = scn.nextLine();
		System.out.print("학생키> ");
		double height = Double.parseDouble(scn.nextLine());
		System.out.print("학생몸무게> ");
		double weight = Double.parseDouble(scn.nextLine());
		System.out.print("학생점수> ");
		int score = Integer.parseInt(scn.nextLine());

		students.add(new Student(name, height, weight, score)); // 추가
		System.out.println("등록되었습니다");

	} // end of addStudent()

	public void removeStudent() {
		System.out.print("학생이름> ");
		String name = scn.nextLine();

		// 삭제
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i) != null && students.get(i).getName().equals(name)) {
				students.remove(i);
				System.out.println("삭제되었습니다");
				return;
			}
		}
	} // end of removeStudent()

	public void save() {
		// c:/temp/studentList.txt
		try {
			Writer writer = new FileWriter("c:/temp/studentList.txt");
			// 갯수만큼 반복하면서 저장
			for (Student std : students) {
//				writer.write("홍길동 167.8 66.4 80");
				writer.write(std.getName() + " " + std.getHeight() + " " //
						+ std.getWeight() + " " + std.getScore() + "\n");
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("저장되었습니다");
	} // end of save()

	public void init() {
		// 파일을 읽어서 컬렉션에 저장
		// c:/temp/studentList.txt
		try {
			Reader reader = new FileReader("c:/temp/studentList.txt");
			BufferedReader br = new BufferedReader(reader);

			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				String[] ary = str.split(" ");
				Student student = new Student(ary[0], Double.parseDouble(ary[1]), Double.parseDouble(ary[2]),
						Integer.parseInt(ary[3]));
				
				students.add(student);
			}
			br.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

} // end of class StudentApp
