import java.util.Scanner;

public class A_Binary_Imbalance {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfTestCase = input.nextInt();
        while (numberOfTestCase-- > 0) {
            int n = input.nextInt();
            String S = input.next();
            // find 0
            int pos = S.indexOf('0');
            if (pos == -1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        input.close();
    }
}
