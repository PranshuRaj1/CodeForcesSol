import java.util.Scanner;

public class CF_contest1915_problemC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + input.nextInt();
            }
            if (isPerfectSquare(sum)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    static boolean isPerfectSquare(long num) {
        if (num < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        return (long) sqrt * sqrt == num;
    }
}
