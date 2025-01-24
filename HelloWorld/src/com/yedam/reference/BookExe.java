package com.yedam.reference;

import java.util.Scanner;

/*
 * 도서명, 저자, 출판사, 판매가격
 */
public class BookExe {

	static Book[] bookRepository = new Book[100]; // 필드에서 선언
	// bookRepository 저장공간의 초기값 생성

	public static void init() {
		// 기본 제공 도서 목록
		bookRepository[0] = new Book("땅콩자서전", "땅콩", "집사", 50000);
		bookRepository[1] = new Book("츄르 맛있게 먹는 10가지 방법", "치즈", "집사", 40000);
		bookRepository[2] = new Book("옆집 고양이 망고", "망고", "정은애", 60000);
	} // end of init()

	// 목록출력
	public static void printList() {
		System.out.println("========================");
		System.out.println("도서명 / 저자 / 가격");
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null) {
				System.out.println(bookRepository[i].ShowBookInfo());
			}
		}
		System.out.println("========================");
	}// end of printList()

	static Scanner scn = new Scanner(System.in);

	// 도서등록
	public static void addBook() {
		System.out.println("========================");
		System.out.println("등록할 책의 정보를 입력해주세요");
		System.out.println("도서명 입력> ");
		String bookName = scn.nextLine();
		System.out.println("저자 입력> ");
		String bookAuthor = scn.nextLine();
		System.out.println("출판사 입력> ");
		String bookPublish = scn.nextLine();
		System.out.println("금액 입력 (단위 : 원)> ");
		int bookPrice = Integer.parseInt(scn.nextLine());
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] == null) {
				bookRepository[i] = new Book(bookName, bookAuthor, bookPublish, bookPrice);
				System.out.println("등록되었습니다");
				System.out.println("========================");
				break;
			}
		}
	} // end of addBook()

	// 목록(출판사)
	public static void searchList() {
		System.out.println("========================");
		System.out.println("출판사를 입력해주세요 ex)집사, 정은애");
		String search = scn.nextLine();
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i].getBookPublish().equals(search)) {
				bookRepository[i].printInfo();
				System.out.println("입력한 출판사의 도서 조회가 완료되었습니다");
			}
		}
		System.out.println("========================");
	} // end of searchList

	// 가격수정
	public static void modifyBook() {
		System.out.println("========================");
		System.out.println("도서가격을 수정할 도서명을 입력해주세요");
		String exchange = scn.nextLine();
		boolean isExist = false;
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i].getBookName().equals(exchange)) {
				System.out.println("금액 입력 (단위 : 원)> ");
				int price = Integer.parseInt(scn.nextLine());
				bookRepository[i].setBookPrice(price);
				System.out.println("도서가격이 수정되었습니다");
				isExist = true;
				break;
			} 
		} // end of for
		if (!isExist) {
			System.out.println("찾는 도서가 없습니다");
		}
		System.out.println("========================");
	} // end of modifyBook()

	// 상세조회
	public static void showDetail() {
		boolean isExist = false;
		System.out.println("========================");
		System.out.println("조회하려는 도서명을 입력해주세요");
		String search = scn.nextLine();
//		for (int i = 0; i < bookRepository.length; i++) {
//			if (bookRepository[i] != null && bookRepository[i].getBookName().equals(search)) {
//				bookRepository[i].showDetailInfo();
		Calculator cal = new Calculator();
		cal.getBookInfo(search, bookRepository).showDetailInfo();
		System.out.println("입력한 출판사의 도서 조회가 완료되었습니다");
		System.out.println("========================");
//		isExist = true;
//		break;
//			}
//		}
//		if (!isExist) {
//			System.out.println("찾는 도서가 없습니다");
//		}
//		System.out.println("========================");
	} // end of showDetail()

	public static void main(String[] args) {

//		Book[] bookRepository = new Book[100];
		// 1.전체목록 2.도서등록 3.조회(출판사) 9.종료
		// 기본 제공 도서 목록
//		bookRepository[0] = new Book("땅콩자서전", "치즈", "집사", 50000);
//		bookRepository[1] = new Book("츄르 맛있게 먹는 10가지 방법", "치즈", "집사", 40000);
//		bookRepository[2] = new Book("옆집 고양이 망고", "망고", "정은애", 60000);
		// 필드로 옮기고 호출
		init(); // 기초 데이터 생성

		boolean run = true;

		while (run) {
			System.out.println("1.전체목록 2.도서등록 3.조회(출판사) 4.금액수정(도서명) 5.상세조회(도서명) 9.종료");
			System.out.println("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 전체목록
				printList();
				break;
				
			case 2: // 도서등록
				addBook();
				break;
				
			case 3: // 조회(출판사)
				searchList();
				break;
				
			case 4: // 금액수정(도서명)
				modifyBook();
				break;
				
			case 5: // 상세조회(도서명)
				showDetail();
				break;
				
			case 9: // 종료
				System.out.println("========================");
				System.out.println("프로그램을 종료합니다.");
				System.out.println("========================");
				run = false;
				break;
				
			default:
				System.out.println("메뉴를 다시 선택하세요");
			} // end of switch
		} // end of while

	} // end of main
} // end of BookExe
