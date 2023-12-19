import java.util.Arrays;
import java.util.Scanner;

public class CF318A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long num = input.nextLong();

        //1 3 5 7 9 2 4 6 8 10

        long half = (n + 1)/2;

        if (num <= half){
            System.out.println(1 + 2*(num - 1));
        }
        else {
            System.out.println(2 * (num - half));
        }
        input.close();
    }
}
