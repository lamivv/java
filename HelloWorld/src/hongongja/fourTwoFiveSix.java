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
	} // end of main
}
