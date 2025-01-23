package com.yedam.reference;

import java.util.Scanner;

/*
 * 도서명, 저자, 출판사, 판매가격
 */
public class BookExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Book[] bookRepository = new Book[100];
		// 1.전체목록 2.도서등록 3.조회(출판사) 9.종료
		
		// 기본 제공 도서 목록
		bookRepository[0] = new Book("땅콩자서전","치즈","집사",50000);
		bookRepository[1] = new Book("츄르 맛있게 먹는 10가지 방법","치즈","집사",40000);
		bookRepository[2] = new Book("옆집 고양이 망고","망고","정은애",60000);
		
		boolean run = true;
		
		while (run) {
			System.out.println("1.전체목록 2.도서등록 3.조회(출판사) 9.종료");
			System.out.println("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine()); 
			
			switch (menu) {
			case 1: // 전체목록
				System.out.println("========================");
				System.out.println("도서 목록");
				for (int i = 0; i < bookRepository.length; i++) {
					if (bookRepository[i] != null) {
						bookRepository[i].printInfo();
						
					}
				}System.out.println("========================");
				break;
			case 2: // 도서등록
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
						bookRepository[i] = new Book(bookName,bookAuthor,bookPublish,bookPrice);
						System.out.println("등록되었습니다");
						System.out.println("========================");
						break;
					}
				}
				break;
			case 3: // 조회(출판사)
				System.out.println("========================");
				System.out.println("출판사를 입력해주세요 ex)집사, 정은애");
				String search = scn.nextLine();
				for (int i = 0; i < bookRepository.length; i++) {
					if (bookRepository[i] != null) {
						if (bookRepository[i].bookPublish.equals(search)) {
							bookRepository[i].printInfo();
						}
					}
				}
				System.out.println("입력한 출판사의 도서 조회가 완료되었습니다");
				System.out.println("========================");
				break;
			case 9: // 종료
				System.out.println("========================");
				System.out.println("프로그램을 종료합니다.");
				System.out.println("========================");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요");
				;
			} // end of switch
		} // end of while

		
		
		
		
		
	} // end of main
} // end of BookExe
