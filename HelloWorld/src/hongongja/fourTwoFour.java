package hongongja;

public class fourTwoFour {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
//			int x = 4 * i;
			for (int j = 0; j <= 10; j++) {
//				int y = 5 * j;
				if (i*4 + j*5 == 60) {
//				if (x + y == 60) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
	}
}
