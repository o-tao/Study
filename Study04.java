package java0520;

/*********************************
 * >> 배열
 * 자료형[] 변수명 = new 자료형[크기];
 * 자료형 변수명[] = new 자료형[크기];
 * int[] 숫자 = new int[5];
 * String[] 이름 = new String[3];
 *********************************/

public class Study04 {

	public static void main(String[] args) {
		
		int[] 정수형배열 = new int[8];
		
		정수형배열[2] = 5;
		
//		System.out.println(정수형배열); // 참조자료 출력
		
/*
		for(int i = 0; i < 정수형배열.length; i++) { // = 입력시 배열이 담을 수 있는 공간을 넘어서 오류 발생
			System.out.println(정수형배열[i]);
		}
*/
		
// 문제1) 인덱스 마지막에 10의 값을 넣고 마지막 인덱스만 출력 하시오.

/*	
		int s = 정수형배열.length; // length = 배열로 만든것의  0 ~ n 까지의 크기
		System.out.println(s);
*/
		
		// 인덱스는 0 부터 시작
		// 크기는 1 부터 시작
		정수형배열[정수형배열.length - 1] = 10;
		System.out.println(정수형배열[정수형배열.length - 1]);
		
// 배열 확인		
		for(int i = 0; i < 정수형배열.length; i++) {
			System.out.println(정수형배열[i]);
		}
		
	}

}
