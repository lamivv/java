package com.yedam.reference;

public class Book {

	String bookName;
	String bookAuthor;
	String bookPublish;
	int bookPrice;

	Book() { }
	
	Book(String bookName, String bookAuthor, String bookPublish, int bookPrice){
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublish = bookPublish;
		this.bookPrice = bookPrice;
	}

	void printInfo() { 
		System.out.printf("도서명: %s, 저자: %s, 출판사: %s, 판매가격: %d\n", 
				bookName, bookAuthor, bookPublish,bookPrice);
	}
	
} // end of Book
