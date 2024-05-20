package java0520;

/*********************************
 * >> 반복문 
 * while : while() {}
 * do while : do {} while();
 *********************************/

public class Study03 {

	public static void main(String[] args) {
		
		int s = 0;
		int a = 4;
		
/* false 불가능, while문 안에 if문 사용 가능		
		while(true) {
			System.out.print(s + "\t");
			System.out.print(a + "\t");
			System.out.println(s >= a);
			if (s >= a) break; // 검사 횟수
			System.out.println("반복문");
			s++;
		}
*/
		
/* 조건이 true 일때 반복
		while(s < a) {
			System.out.print(s + "\t");
			System.out.print(a + "\t");
			System.out.println(s >= a);
			System.out.println("반복문");
			s++;
		}
*/
		
// while문 실행 전 do 에서 먼저 실행
		do {
			System.out.println("반복문");
		} while(a < s);

		
		
	}

}
