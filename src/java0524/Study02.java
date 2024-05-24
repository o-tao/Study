package java0524;

public class Study02 {
	
	static int b = 0;

	public static void main(String[] args) { // for문을 사용하지 않은 반복출력
		a();
		

	}
	
	static void a() {
		
		if(b < 5) {			
			System.out.println("Hello!" + b);
			b++;
			a();
		}
	}

}
