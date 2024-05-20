package java0520;

public class Study02 {

	public static void main(String[] args) {
		
		// 구구단
		// 단 * 증가값 = 결과값
		
		for (int i = 1; i <= 9; i++) { // 단을 위한 반복문
			
			for (int j = 1; j <= 9; j++) { // 증가값을 위한 반복문
				
				// 출력 하는 곳
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}

	}

}
