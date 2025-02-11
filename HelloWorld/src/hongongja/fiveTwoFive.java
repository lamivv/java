package hongongja;

public class fiveTwoFive {
	public static void main(String[] args) {
		int[][] array = { 
			{ 95, 86 }, 
			{ 83, 92, 96 }, 
			{ 78, 83, 93, 87, 88 } 
		};
		
		int sum = 0;
		double avg = 0.0;
		
		//작성 위치
		int roop = 0;//반복횟수
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++){
				sum += array[i][j];
				roop +=1;
			}
		}
		avg = (double)sum / roop;
			
		System.out.println("sum: "+ sum);
		System.out.println("avg: "+ avg);
	}
}
