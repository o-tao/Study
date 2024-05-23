package java0523;

import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스와 반복문를 이용하여 계산기 만들기
 *********************************/

public class Study05 {

	public static void main(String[] args) {

		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		
		/** 객체 사용 **/
		
		
		while(true) {
			System.out.print("첫번째 정수를 입력하세요: ");
			int num1 = sc.nextInt();
			
			System.out.print("연산자를 입력하세요: ");
			String a = sc.next();
			
			System.out.print("두번째 정수를 입력하세요: ");
			int num2 = sc.nextInt();
			
			if (a.equals("+")) {
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			} else if (a.equals("-")) {
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			} else if (a.equals("*")) {
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			} else if (a.equals("/")) {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			} else {
				System.out.println("연산값 오류");
			}
			
			System.out.println("계속하시겠습니까? (Y/N)");
			a = sc.next();
			if (a.equals("N")) break;
			
		}
		
		/** 객체 제거 **/
		sc.close();
		
	}

}
