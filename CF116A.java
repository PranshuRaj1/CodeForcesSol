import java.util.Scanner;

public class CF116A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int currentCapacity = 0;
        int minCapacity = 0;

        for (int i = 0; i < n; i++) {
            int ai = input.nextInt();
            int bi = input.nextInt();

            currentCapacity = currentCapacity - ai + bi;

            minCapacity = Math.max(minCapacity, currentCapacity);
        }

        System.out.println(minCapacity);
    }
}
