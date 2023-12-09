import java.util.Scanner;

public class CF151A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int l = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int p = input.nextInt();
        int nl = input.nextInt();
        int np = input.nextInt();

        int toastPerDrink = (k * l)/nl;
        int toastPerLime = c * d;
        int toastPerSalt = p / np;

        int minToast = Math.min(Math.min(toastPerDrink,toastPerLime),toastPerSalt);

        int total = minToast / n;
        System.out.println(total);
    }
}
