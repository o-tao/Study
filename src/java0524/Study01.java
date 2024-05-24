package java0524;

public class Study01 {

	public static void main(String[] args) { // 메소드 기본
		int 값1 = 더하기(1, 2); // 1 + 2 = 3
		System.out.println(값1);
		
		int 값2 = 빼기(2, 1); // 2 - 1 = 1
		System.out.println(값2);
		
		int 값3 = 곱하기(2, 4); // 2 * 4 = 8
		System.out.println(값3);
		
		int 값4 = 나누기(4, 2); // 4 / 2 = 2
		System.out.println(값4);
	}
	
	static int 더하기(int a, int b) {
		return (a + b);
	}
	
	static int 빼기(int c, int d) {
		return (c - d);
	}
	
	static int 곱하기(int e, int f) {
		return (e * f);
	}
	
	static int 나누기(int g, int h) {
		return (g / h);
	}

}
