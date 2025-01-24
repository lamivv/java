package com.yedam.reference;

public class Book {

	private String bookName;
	private String bookAuthor;
	private String bookPublish;
	private int bookPrice;

	Book() {
	}

	Book(String bookName, String bookAuthor, String bookPublish, int bookPrice) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublish = bookPublish;
		this.bookPrice = bookPrice;
	}

	void printInfo() {
//		System.out.printf("도서명: %s, 저자: %s, 출판사: %s, 판매가격: %d\n", bookName, bookAuthor, bookPublish, bookPrice);
		System.out.printf("도서명: %s, 저자: %s, 판매가격: %d\n", bookName, bookAuthor, bookPrice);
	}
	
	String ShowBookInfo() {
		return bookName+ " / " + bookAuthor + " / " + bookPrice;
	}
	void showDetailInfo() { 
		// 도서명: @@     출판사: @@   
		// 저 자: @@      가 격: @@ 원
		String strFomat = " 도서명: %10s\t출판사: %6s\n 저 자: %10s\t가 격: %5d 원\n";
		System.out.printf(strFomat,bookName, bookAuthor, bookPublish, bookPrice);
		
	}
	
	
	// setter
	void setBookPrice(int bookprice) {
		if (bookPrice < 0) {
			this.bookPrice = 0;
			return;
		}
		this.bookPrice = bookprice;
	}
	
	// 간단하게 만들기. 화면에 우클릭 - Source - Generate Getters and Setter 에서 Setters..
	void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public void setBookPublish(String bookPublish) {
		this.bookPublish = bookPublish;
	}
	
	// getter
	public String getBookName() {
		return bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public String getBookPublish() {
		return bookPublish;
	}

	public int getBookPrice() {
		return bookPrice;
	}
	
} // end of Book
