package hongongja;

import java.util.Scanner;

public class fourTwoSeven {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			int menu = Integer.parseInt(scanner.nextLine());
			switch(menu) {
			case 1: // 입금
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				System.out.println("");
				break;
			case 2: // 출금
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
				System.out.println("");
				break;
			case 3: // 잔고
				System.out.println("잔고> "+balance);
				System.out.println("");
				break;
			case 4: // 종료
				System.out.println("");
				run = false;
				break;
			default : // 그 외
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
