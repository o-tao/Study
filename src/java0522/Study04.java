package java0522;

public class Study04 {

	public static void main(String[] args) {

		/***********************************************
		 * 문제4) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
	     *     ★
	     *    ★★
	     *   ★★★
	     *  ★★★★
	     * ★★★★★
		 ************************************************/

		// 해결 코드 작성 시작

	    String 별 = "*";
	
//	    /*** 코드 시작 ***/
//	    
//	    // 배열에 별 넣기
//	    String[][] 배열 = new String[5][5];
//
//	    for (int i = 0; i < 배열.length; i++) {
//	    	
//	    	for (int j = 0; j < 배열[i].length; j++) {
//	    		
//	    		String 빈공간 = " ";
//	    		if (i == 0 && j <= 3) {
//	    			배열[i][j] = 빈공간;
//	    			
//	    		} else if (i == 1 && j <= 2) {
//	    			배열[i][j] = 빈공간;
//	    			
//	    		} else if (i == 2 && j <= 1) {
//	    			배열[i][j] = 빈공간;
//	    			
//	    		} else if (i == 3 && j <= 0) {
//	    			배열[i][j] = 빈공간;
//	    			
//	    		} else {
//	    			배열[i][j] = 별;
//	    			
//	    		}
//	    		
//	    		
//	    	}
//	    	
//	    }
//	    
//	    // 배열에 값 출력
//	    for (int i = 0; i < 배열.length; i++) {
//	    	
//	    	for (int j = 0; j < 배열[i].length; j++) {
//	    		System.out.printf(배열[i][j]);
//	    		}
//	    	System.out.println();
//	    	}
		
	    for (int i = 0; i < 5; i++) {
	    	for (int j = 1; j < 5-i; j++) {
	    		System.out.print(" ");
	    	}
	    	for (int k = 0; k <= i; k++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	
	
	
	    /*** 코드 종료 ***/

  }

}