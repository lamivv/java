package hongongja;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0); // 매개값이 왜 0?

			String strNUm1 = args[0];
			String strNUm2 = args[1];

			int num1 = Integer.parseInt(strNUm1);
			int num2 = Integer.parseInt(strNUm2);

			int result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
		}
	}
}
