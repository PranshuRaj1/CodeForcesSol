import java.util.Scanner;

public class CF41A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ber = input.nextLine();
        String bis = input.nextLine();

        StringBuilder Berlandish = new StringBuilder(ber);
        StringBuilder Birlandish = new StringBuilder(bis);

        if (Berlandish.toString().contentEquals(Birlandish.reverse().toString())){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
