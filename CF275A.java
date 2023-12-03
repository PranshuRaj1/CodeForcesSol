import java.util.Scanner;

public class CF275A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] press = new int[3][3];
        int[][] grid = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                press[i][j] = in.nextInt();
                grid[i][j] = 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((press[i][j] != 0 || press[i][j] % 2 != 0)){
                    grid[i][j] = 1 - grid[i][j];
                    if ((j + 1) < 3) {

                        grid[i][j + 1] = 1 - grid[i][j + 1];
                    }
                    if ((i + 1) < 3) {
                        grid[i + 1][j] = 1 - grid[i + 1][j];
                    }
                    if ((i - 1) >= 0) {
                        grid[i - 1][j] = 1 - grid[i - 1][j];
                    }
                    if ((j - 1) >= 0) {
                        grid[i][j - 1] = 1 - grid[i][j - 1];
                    }

                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(grid[i][j]);
            System.out.println();
        }
        in.close();

    }
}
