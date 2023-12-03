import java.util.Scanner;

public class CF248A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] cupboards = new int[n][2];
        int lD = 0;
        int rD = 0;

        for (int i = 0; i < n; i++) {
            cupboards[i][0] = input.nextInt();
            cupboards[i][1] = input.nextInt();
            lD+= cupboards[i][0];
            rD += cupboards[i][1] ;

        }

        System.out.println(Math.min(lD,n-lD) + Math.min(rD, n - rD));

    }
}
