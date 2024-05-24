package java0524;

public class Study04 { // 전역변수 선언
	
	static int a = 0;
	static int c = 0;

	public static void main(String[] args) { // 지역변수 선언
		System.out.println(a); // 전역변수 선언한 것 사용 가능
		int c = b(); // 메소드 출력
		
		System.out.println(c); // 메소드에 선언한 지역변수 사용 불가능, 전역변수로 넣고 사용 가능
	}
	
	static int b() { // 지역변수 선언
		int c = 5;
//		this.c = c;  this는 접근제어자가 static 일 때 사용 불가능
		System.out.println(a);
		return c;

	}

}
