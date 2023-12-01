import java.util.Scanner;

public class CF263A {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        int i = 0, j = 0;

        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < 5; l++) {
                matrix[k][l] = num.nextInt();
                if (matrix[k][l] == 1){
                    i = k;
                    j = l;
                }

            }
        }
        int moves = Math.abs(i - 2) + Math.abs(j - 2);
        System.out.println(moves);
    }

}
