import java.util.Scanner;

public class CF200B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int[] drinks = new int[n];


        for (int i = 0; i < n; i++) {
            drinks[i] = input.nextInt();
        }

        float composition = (float) 1 /n;

        float volumeFraction = 0;

        for (int i = 0; i < n; i++) {
            volumeFraction = volumeFraction + drinks[i]*composition;

        }
        System.out.println(volumeFraction);

    }
}
