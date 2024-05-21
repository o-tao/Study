package memo;

public class Memo2 {

    public static void main(String[] args) {
        int[][] number = new int[9][9];
        int[] fillNumbers = {0, 3, 4, 6, 2, 7, 5, 1, 9};
        int fillNumberIndex = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (i == j) {
                    number[i][j] = 8;
                    fillNumberIndex++;
                } else {
                    number[i][j] = fillNumbers[fillNumberIndex];
                }
                System.out.print(number[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
