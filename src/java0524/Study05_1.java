package java0524;

public class Study05_1 {
	
	private int a; // private -> 클래스내에서만 사용할 수 있게 제한함
 
	Study05_1(){
		System.out.println(11111);
	}

	
	Study05_1(int a) {
		System.out.println(a);
		this.a = a; // 전역변수를 사용하기 위해 this 입력 (this.a = 전역변수, a = 지역변수)
		
	}
	
	void b() {
		System.out.println(a);
	}
	
}
