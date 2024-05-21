package java0521;

public class Study03 {

	public static void main(String[] args) {
		
		/***********************************************
		 * 문제2) 배열 크기가 10이고 초기의 값은 오래와 같다.
		 * 		 연산 할 값은 9로 고정으로 사용하여 배열에 - 연산으로
		 * 		 다시 넣으시오.
		 * 출력 예시)
		 * 인덱스		초기값	뺄 값		배열에들어갈 값
		 * 0		9		9			(9 - 9)
		 * 1		8		9			(8 - 9)
		 * 2		7		9			(7 - 9)
		 * 3		6		9			(6 - 9)
		 * 4		5		9			(5 - 9)
		 * 5		4		9			(4 - 9)
		 * 6		3		9			(3 - 9)
		 * 7		2		9			(2 - 9)
		 * 8		1		9			(1 - 9)
		 * 9		0		9			(0 - 9)
		 ************************************************/	
		
		int[] numbers = new int[10];
		int num = 9;
		int a = 9;
		
		System.out.println("인덱스\t초기값\t뺄 값\t배열에들어갈 값");
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
			System.out.print(i + "\t" + num + "\t" + a + "\t");
			System.out.println("(" + num + " - " + a + ") = " + (num-a));
			num--;
			
			
		}


/*
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = a;
			a--;
			System.out.println(a);
		}
		
		for(int i = 0; i < numbers.length; i++) {
			int 값 = (numbers[i] - num);
			numbers[i] = 값;
			System.out.println(값);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			//System.out.println(numbers[i]);
		}
*/
	}

}
