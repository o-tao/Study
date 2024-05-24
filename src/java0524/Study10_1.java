package java0524;

public class Study10_1 {
	
	
	
	Study10_1 (int a, int b) {
		star(a, b);
	}	
	
	private void star(int a, int b) {
		
	     for (int i = a; i < b; i++) {
	    	 
	    	 for (int j = b; j > i; j--) { 
	    		 System.out.print("*"); 
	    		 
	    	 }
	    	 System.out.println();
	      }
		
		
	}
	

}
