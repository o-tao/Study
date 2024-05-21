package java0521;

public class Study06 {
	
	public static void main(String[] args) {

		/***********************************************
		 * 문제5) [4행 4열] 정수형 2차원 배열을 생성 후
		 *  인덱스 순서대로 16 ~ 1의 값을 넣고 출력 하시오.
		 * 출력 예시)
		 * 16, 15, 14, 13
		 * 12, 11, 10,  9
		 *  8,  7,  6,  5
		 *  4,  3,  2,  1
		 ************************************************/
		
		// 해결 코드 작성 시작
		int[][] numbers = new int[4][4];
		
		// 배열에 값 넣기
		int 감소값 = 16;
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers.length; j++) {
				numbers[i][j] = 감소값;
				감소값--;
				
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
