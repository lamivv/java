package com.yedam.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import com.yedam.collections.ListExe;

public class FileExe {
	public static void main(String[] args) {
		// ListExe.java 읽기
		try {
			Reader reader = new FileReader("c:/temp/ListExe.java");
			while (true) {
				int chr = reader.read(); // 1char(2byte)씩 읽어온다
				System.out.print((char) chr); // 65 -> A
				if (chr == -1) {
					break;
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	} // end of main

	void write() {
		// 문자기반 텍스트 생성
		// 문자기반 파일출력
		try {
			Writer wr = new FileWriter("c:/temp/test2.txt");
			wr.write(65); // int 매개값
			wr.write(new char[] { 'B', 'C' });
			wr.write("DEFGHI", 2, 3);
			wr.flush();
			wr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	void copy() {
		// 파일 복사
		// c:/temp/sample.jpg -> c:/temp/copy.jpg 생성
		try {
			InputStream is = new FileInputStream("c:/temp/sample.jpg");
			OutputStream os = new FileOutputStream("c:/temp/copy2.jpg");
			int data = -1;
			byte[] buf = new byte[100];

			while (true) {
				// 읽어들이기
				data = is.read(buf); // 1byte씩 읽고 반환 // 더 읽을 값이 없으면 -1을 반환
				// buf를 read의 매개값으로 넣으면 buf에 read의 읽은 값이 저장이된다. 100byte읽고 100byte쓰고... 속도 향상
				os.write(buf); // 출력하기(바이트 쓰기)
				if (data == -1) {
					break;
				}
			} // end of while
			is.close();
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void input() {
		// 바이트기반 파일생성
		// 입력 스트림(바이트기반) InputStream
		try {
			InputStream is = new FileInputStream("c:/temp/test1.dat");
			while (true) {
				int data = is.read(); // 1byte씩 읽고 반환 // 더 읽을 값이 없으면 -1을 반환
				System.out.println(data);
				if (data == -1) {
					break;
				}
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // end of input()

	void output() {
		// 바이트기반 파일읽기
		// 출력 스트림(바이트기반) OutputStream
		try {
			OutputStream os = new FileOutputStream("c:/temp/test1.dat"); // 파일생성 경로 설정
			os.write(10); // 파일에 10 값을 쓰기
			os.write(20);
			os.write(30);
			os.flush(); // 버퍼 비우기 // 버퍼가 머임?
			os.close(); // 리소스 반환
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end of output
} // end of class FileExe