package com.yedam;

public class Variable2 {
	public static void main(String[] args) {
		
		for(int j=1; j<=9;j++) {
			
			int num = j;
		
			for (int i = 1; i <= 6; i++) {
                // System.out.print(num + " * " + i + " = " + num*i+ "  ");
				// 자바스크립트에서 `${num}*${i}=${num*i}` 사용했던 것
				// %뒤에 오는건 num과 같은 자료형
				// 순번을 안쓰면 뒤에 오는 순서대로 대입이 된다
				 System.out.printf(" %d * %d = %2d ", i, num, i*j);
				// %2d는 2개의 digit값으로 결과를 출력... 값이 두칸의 자리를 차지함
				// System.out.printf("%d * %d = %d\n", num, i, num*i);
				// 순번을 작성하면 순번대로 대입이 된다
				// System.out.printf("%1$d * %3$d = %2$d\n", num, i, num*i ); 
			}
			System.out.println();
		}
		System.out.println("end of prog");
		// println은 줄바꿈 print는 연달아 씀
	}
}
