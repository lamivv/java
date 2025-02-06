package exception;

import com.yedam.reference.Student;

public class NullPotinterExe {
	public static void main(String[] args) {
		Student student = null;
		String[] strAry = { "Hello", "World" };
		// 예외처리
		try {
			int menu = Integer.parseInt("a");
			strAry[2] = "Nice"; // 배열 범위의 밖
			System.out.println(student.getStudentName());
//		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			
		} catch (NullPointerException e) {
			System.out.println("null값을 참조 또는 배열 범위 초과");
			e.printStackTrace(); // 어떤 예외가 발생했는지와 발생 위치를 알려줌
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열 범위를 초과했습니다");
		}catch (NumberFormatException e) {
			System.out.println("NumberFormat 예외 발생");
		}catch (RuntimeException e) { // 상위 exception은 하위의 어떠한 exception이 발생하면 처리해줌
			System.out.println("상위exception은 하위 exception 처리");
//		} catch (Exception e) { // 가장 상위 exception
//			e.printStackTrace();
		}
		System.out.println("end of prog"); // 끝부분
	}
}
