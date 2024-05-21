package java0521;

public class Study01 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i+=3) {
			int j = 1;
			while(j < 10) {
				System.out.print(i + " * " + j + " = " + i * j + "\t");
				int a = i + 1;
				int b = a + 1;
				System.out.print(a + " * " + j + " = " + a * j + "\t");
				System.out.println(b + " * " + j + " = " + b * j + "\t");
				j++;
			}
			System.out.println();
			
		}
		

	}

}
