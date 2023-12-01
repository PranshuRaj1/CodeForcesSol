import java.util.Scanner;

public class CF144A {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int minA = a, maxA = a, minIndex = 0, maxIndex = 0;

        for (int i = 1; i < n; ++i) {
            a = scanner.nextInt();

            if (a > maxA) {
                maxA = a;
                maxIndex = i;
            }

            if (a <= minA) {
                minA = a;
                minIndex = i;
            }
        }

        int result = maxIndex + (n - 1 - minIndex) - (minIndex < maxIndex ? 1 : 0);
        System.out.println(result);
    }



}
