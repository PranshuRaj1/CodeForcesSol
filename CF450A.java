import java.util.Scanner;

public class CF450A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int last = 0;
        double max = 0;

        for (int i = 1; i <= n; i++) {
            double t = scanner.nextDouble();

            if (Math.ceil(t / m) >= max) {
                last = i;
                max = Math.ceil(t / m);
            }
        }

        System.out.println(last);
        scanner.close();

    }

}
