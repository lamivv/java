package hongongja;

public class fourTwoFiveSix {
	public static void main(String[] args) {
		
		// 5번 문제
		String star = "*";
		for (int i = 1; i <= 4 ; i++) {
			System.out.printf("%s\n", star);
			star += "*";
		}
		
		// 6번 문제
		star = "*";
		for (int i = 1; i <= 4 ; i++) {
			System.out.printf("%4s\n", star);
			star += "*";
		}
		
		// 6번 문제 문제풀이
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j>0; j--) {
				if ( i<j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	} // end of main
}
