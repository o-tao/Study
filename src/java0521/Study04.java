package java0521;

public class Study04 {
	
	public static void main(String[] args) {

		/***********************************************
		 * 문제3) [3행, 3열] 문자열 2차원 배열를 생성 후 
		 *   인덱스 [0행 0열] 부터 [2행 2열] 까지 차례대로 출력하시오.
		 * 출력 예시)
		 * (0, 0)(0, 1)(0, 2)
		 * (1, 0)(1, 1)(1, 2)
		 * (2, 0)(2, 1)(2, 2)
		 ************************************************/
		
		int[][] numbers = new int[3][3];
		
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers.length; j++) {
				System.out.print("(" + i + ", " + j + ")");
			}
			System.out.println();
		}
		

	}

}
