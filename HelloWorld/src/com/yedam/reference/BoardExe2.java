package com.yedam.reference;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 1. 글 목록
 2. 글 등록
 3. 글 삭제
 9. 종료
 */
public class BoardExe2 {
	static Board[] boardRepo = new Board[100]; // 게시글 등록하는 배열
	static Scanner scn = new Scanner(System.in);
	static String loginId; // 로그인 아이디를 저장

	public static void initData() throws ParseException {
		// 배열의 샘플데이터
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		boardRepo[0] = new Board("게시글제목1", "내용입니다1", "user01", sdf.parse("2025-01-27"));
		boardRepo[1] = new Board("게시글제목2", "내용입니다2", "user02", sdf.parse("2025-01-29"));
		boardRepo[2] = null;
		boardRepo[3] = new Board("게시글제목4", "내용입니다3", "user03", sdf.parse("2025-01-31"));
		boardRepo[4] = new Board("게시글제목5", "내용입니다3", "user03", sdf.parse("2025-01-31"));

		boardRepo[5] = new Board("게시글제목6", "내용입니다3", "user03", sdf.parse("2025-01-31"));
		boardRepo[6] = new Board("게시글제목7", "내용입니다3", "user03", sdf.parse("2025-01-31"));
		boardRepo[7] = new Board("게시글제목8", "내용입니다3", "user03", sdf.parse("2025-01-31"));
		boardRepo[8] = new Board("게시글제목9", "내용입니다3", "user03", sdf.parse("2025-01-31"));
		boardRepo[9] = new Board("게시글제목10", "내용입니다3", "user03", sdf.parse("2025-01-31"));

		boardRepo[10] = new Board("게시글제목11", "내용입니다3", "user03", sdf.parse("2025-01-31"));
		boardRepo[11] = new Board("게시글제목12", "내용입니다3", "user03", sdf.parse("2025-01-31"));
		boardRepo[12] = new Board("게시글제목13", "내용입니다3", "user03", sdf.parse("2025-01-31"));
		boardRepo[13] = new Board("게시글제목14", "내용입니다3", "user03", sdf.parse("2025-01-31"));
	}

	public static void boardList() {
		// 글 목록
		// 1페이지 : 0~4, 2페이지 5~9
		int page = 1;
		int count = 0;
		int nullCount = 0;
		int countpage = 0;
		int lastPage = (int) Math.ceil(getMaxCount() / 5.0);

		while (true) {
			if (count == 5) {
				countpage = nullCount;
				count = 0;
				nullCount = 0;
			}

			for (int i = (page - 1) * 5 + countpage; i < page*  5 + countpage; i++) {
				if (boardRepo[i] != null) {
					System.out.println(boardRepo[i].showBoard());
					count += 1;
				} else {
					countpage += 1;
				}
			}
			System.out.println("이전페이지:p, 다음페이지:n, 종료:q");
			String paging = scn.nextLine();
			if (paging.equals("n")) {
				// 마지막페이지보다는 작은 값
				if (page < lastPage) {
					page++;
				} else {
					System.out.println("--- 마지막 페이지입니다. ---");
				}
			} else if (paging.equals("p")) {
				// 1페이지보다 작아질 수 없음 최소 1페이지
				if (page == 1) {
					System.out.println("--- 1페이지입니다. 이전페이지로 이동할 수 없습니다. ---");
				} else {
					page--;
				}
			} else if (paging.equals("q")) {
//				break;
				return;
			} else {
				System.out.println("--- 잘못된 메뉴 선택입니다 ---");
			}
		} // end of while boardList
	} // end of boardList()

	public static int getMaxCount() {
		// 배열을 매개값으로 전달하면 건수가 몇건인지 반환
		int count = 0; // 전체 건수
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] != null) {
				count++;
			}
		}
		return count;
	}

	public static void addBoard() {
		// 글 등록
		System.out.print("제목> ");
		String title = scn.nextLine();
		System.out.print("내용> ");
		String content = scn.nextLine();
//		System.out.print("작성자> ");
//		String writer = scn.nextLine();
//		System.out.print("작성일자> ");
//		String writeDate = scn.nextLine();
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] == null) {
				boardRepo[i] = new Board(title, content, loginId, new Date());
				System.out.println("등록완료");
				break; // 한 건만 등록
			}
		}
	} // end of addBoard()

	public static void removeBoard() {
		// 글 삭제 - 제목으로 검색
		System.out.print("삭제하려는 게시글의 제목> ");
		String title = scn.nextLine();
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] != null && boardRepo[i].getTitle().equals(title)) {
				boardRepo[i] = null;
				System.out.println("삭제완료");
				break; // 한 건만 삭제
			}
		}
	} // end of removeBoard()

	public static void main(String[] args) {
		// id, password 일치하면 글목록 등 기능 사용가능
//		MemberExe exe = new MemberExe();

		while (true) {
			System.out.print("아이디 : ");
			String id = scn.nextLine();
			System.out.print("비밀번호 : ");
			String pw = scn.nextLine();
			String name = MemberExe.login(id, pw);
			if (name != null) {
				loginId = id; // 여러 메소드 공용 사용
				System.out.printf("%s님, 환영합니다\n", name);
				break;
			} else {
				System.out.println("아이디와 비밀번호를 확인하세요");
			}
		}

		boolean run = true;
		try {
			initData();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 샘플데이터 생성

		while (run) {
			System.out.println("1.글목록 2.글등록 3.삭제 9.종료");
			System.out.print("선택>");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1: // 글 목록
				boardList();
				break;
			case 2: // 글 등록
				addBoard();
				break;
			case 3: // 글 삭제
				removeBoard();
				break;
			case 9: // 종료
				System.out.println("프로그램을 종료합니다");
				run = false;
				break;
			default: // 1, 2, 3, 9 외의 경우
				System.out.println("메뉴를 확인하세요.");
				break;
			}
		} // end of while run
		System.out.println("end of prog.");
	} // end of main
} // end of class BoardExe
