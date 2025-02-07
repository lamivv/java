package hongongja;

import java.util.Scanner;

public class threeTwoNine {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("첫 번째 수: ");
		String num1 = scn.next();
		System.out.print("두 번째 수: ");
		String num2 = scn.next();
		System.out.println("----------------");
		
		if (Double.parseDouble(num2) == 0 || Double.parseDouble(num2) == 0.0) {
			System.out.print("결과: 무한대");
		} else {
			System.out.print("결과:" + Double.parseDouble(num1) / Double.parseDouble(num2));
		}
	} // end of main
} // end of class
