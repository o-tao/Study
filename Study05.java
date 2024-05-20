package java0520;

public class Study05 {

	public static void main(String[] args) {
	
/*		
		int[][] 배열 = new int[4][4];
		
		배열[0][1] = 10;
		배열[2][2] = 20;
		배열[3][3] = 30;
*/		
		
/*
		// 0, 1, 2, 3	마지막 4
		for(int i = 0; i < 배열.length; i++) {
//			System.out.println(배열[i][i]); // for문 안에 for문을 사용하여 2차원 배열 출력 (구구단 출력과 동일)
			
			// 1 -> [0][0] = 0
			// 2 -> [1][1] = 0
			// 3 -> [2][2] = 20
			// 4 -> [3][3] = 30
			
			
			for(int j = 0; j < 배열.length; j++) {
				System.out.print(배열[i][j] + "\t");
			}
			System.out.println();
		}
*/
		
/*  문제1) 2차원 배열 피라미드 출력
			String[][] 문제 = new String[][] {
				{"O", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
				{"O", "O", " ", " ", " ", " ", " ", " ", " ", " ",},
				{"O", "O", "O", " ", " ", " ", " ", " ", " ", " ",},
				{"O", "O", "O", "O", " ", " ", " ", " ", " ", " ",},
				{"O", "O", "O", "O", "O", " ", " ", " ", " ", " ",},
				{"O", "O", "O", "O", "O", "O", " ", " ", " ", " ",},
				{"O", "O", "O", "O", "O", "O", "O", " ", " ", " ",},
				{"O", "O", "O", "O", "O", "O", "O", "O", " ", " ",},
				{"O", "O", "O", "O", "O", "O", "O", "O", "O", " ",},
				{"O", "O", "O", "O", "O", "O", "O", "O", "O", "O",},
			};
			
			for(int i = 0; i < 문제.length; i++) {
				for(int j = 0; j < 문제.length; j++) {
					System.out.print(문제[i][j]);
				}
				System.out.println();
			}
*/
		
// 문제1) for문을 사용한 2차원배열 피라미드 출력
		
		String[][] 배열 = new String[10][10];
		
		for(int i = 0; i < 배열.length; i++) {
			for(int j = 0; j < 배열[i].length; j++) {
				// 0  <  1
				if(j < (i+1)) {
					배열[i][j] = "O";					
				} else {
					배열[i][j] = "X";	
				}
				System.out.print(배열[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
