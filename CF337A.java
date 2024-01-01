import java.util.Arrays;
import java.util.Scanner;

public class CF337A {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] sizes = new int[m];

        for (int i = 0; i < m; i++) {
            sizes[i] = input.nextInt();
        }
        Arrays.sort(sizes);
        int diff = sizes[n-1] - sizes[0];

        for (int i = 1; i <= m- n; i++) {
            int check = sizes[i + n - 1] - sizes[i];
            if (check < diff){
                diff = check;
            }
        }
        System.out.println(diff);


        input.close();
    }
}
