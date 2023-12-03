import java.util.Scanner;

public class CF148A {
    public static void main(String[] args) {
        //Every k-th dragon got punched in the face with a frying pan.
        //Every l-th dragon got his tail shut into the balcony door.
        //Every m-th dragon got his paws trampled with sharp heels.
        //Finally, she threatened every n-th dragon to call her mom
        Scanner input = new Scanner(System.in);

        int k = input.nextInt();
        int l = input.nextInt();
        int m = input.nextInt();
        int n = input.nextInt();
        int d = input.nextInt();

        int count = 0;

        for (int i = 1; i <= d; i++) {
            if (i%k == 0 || i%l == 0 || i%m == 0 || i%n == 0){
                count++;
            }

        }
        System.out.println(count);
    }
}
