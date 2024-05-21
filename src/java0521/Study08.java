package java0521;

public class Study08 {
	
	public static void main(String[] args) {

		/***********************************************
		 * 문제7) [5행 5열] 2차원 배열을 이용하여
		 *  파스칼삼각형을 출력하는 프로그램 만들기
		 *  첫번째 행, 첫번째 열은 1로 시작으로 
		 *  두번째 행 부터 "바로 위 값"과 "바로위 왼쪽의 값"을 더한 값으로 출력 하세요.
		 * 출력 예시)        ┌───────────────────────처리 방법 예시───────────────────────┐
		 * 1				첫번째 열은 1로 시작
		 * 1, 1				1번 열은 (0,0)값, 2번 열은 (0,0)값
		 * 1, 2, 1			1번 열은 (1,0)값, 2번 열은 (1,1) + (1,0) 합값, 3번 열은 (1,1)값
		 * 1, 3, 3, 1
		 * 1, 4, 6, 4, 1
		 ************************************************/
		
		int[][] numbers = new int[5][5];
		
		int 초기값 = 1;
		numbers[0][0] = 1;
				
		for(int i = 1; i < numbers.length; i++) {
			numbers[i][0] = 초기값;
			
			for (int j = 1; j <numbers[i].length; j++) {
				
				int result = (numbers[i - 1][j] + numbers[i - 1][j - 1]);
				numbers[i][j] = result;
				
				}
			}
		
		for (int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers[i].length; j++) {
				if(numbers[i][j] == 0) continue;
				System.out.print(numbers[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		

	}

}
