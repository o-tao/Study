package java0521;

public class Study05 {
	
	public static void main(String[] args) {
		
		/***********************************************
		 * 문제4) [4행 4열] 정수형 2차원 배열을 생성 후
		 *  인덱스 순서대로 1 ~ 16의 값을 넣고 출력 하시오.
		 * 출력 예시)
		 *  1,  2,  3,  4,
		 *  5,  6,  7,  8,
		 *  9, 10, 11, 12,
		 * 13, 14, 15, 16,
		 ************************************************/
		// 배열 생성
		int[][] numbers = new int[4][4];
		
		// 배열에 값 넣기
		int add = 1;
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers.length; j++) {
				numbers[i][j] = add;
				add++;
				
			}

		}		
		
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers.length; j++) {
				int result = numbers[i][j];
				System.out.print(result + ",\t");
			}
			System.out.println();
		}
		

	}

}
