import java.util.Scanner;

public class CF320A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();

        String num = Long.toString(n);
        if (!num.matches("(1|14|144)+")){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }

    }
}
