package java0520;

public class Study02 {

	public static void main(String[] args) {

/*

		// 구구단
		// 단 * 증가값 = 결과값
		
		
		
    	    for (int i = 1; i <= 9; i++) { // 단을 위한 반복문
			
			
			for (int j = 1; j <= 9; j++) { // 증가값을 위한 반복문
				
				// 출력 하는 곳
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
*/
		
		
/*
 		
		// 문제1) 구구단 짝수 출력 / 홀수 츌력은 if (i%2 == 0) 으로 입력
		

		   for (int i = 1; i <= 9; i++) { // 단을 위한 반복문
		  
		   if (i%2 == 1) continue;
		  
		   for (int j = 1; j <= 9; j++) { // 증가값을 위한 반복문
		  
		   // 출력 하는 곳 System.out.println(i + " * " + j + " = " + (i * j)); }
		  
		   }
*/

/*
		// 문제2) 한줄에 단수를 3개 출력
		
	    for (int i = 1; i <= 9; i += 3) { // 3단계식 위한 반복문
			
			
	    	for (int j = 1; j <= 9; j++) { // 증가값을 위한 반복문
			
			// 출력 하는 곳
			System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			int a = i + 1;
			int b = a + 1;
			System.out.print(a + " * " + j + " = " + (a * j) + "\t");
			System.out.println(b + " * " + b + " = " + (b * j));

	    	}
		System.out.println();
	    
	    }
*/

	    // 문제3) 증가될 단수를 제어 하세요

	    int step = 3;
	    
	    for (int i = 1; i <= 9; i += step) { // 3단계식 위한 반복문
			
			
	    	for (int j = 1; j <= 9; j++) { // 증가값을 위한 반복문
			
	    		// step -> 1, 4, 7
	    		// 1 <= 3;  4 <= 3;  7 <= 3;
	    		// k -> 1, 2, 3 -> 4, 5, 6 -> 7, 8, 9
	    		for (int k = i; k < (i + step); k++) { // k -> step + 1 -> step + 2 +
	    			System.out.print(k + " * " + j + " = " + (k * j) + "\t");
	    		}
	    		System.out.println();

	    	}
		System.out.println();
	    
	    }
	    
	}
}