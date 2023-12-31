import java.util.Scanner;

public class CF118B {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        pattern(n);

    }
    //expected: '    0', found: '     0'
    //expected: '    0', found: '    0 '

    static void pattern(int n){
        for (int i = 1; i <= n + 1; i++) {
            for (int j = n; j >= i; j--)
                System.out.print("  ");
            int idx = 0;
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(idx);
                if (j < i * 2 - 1)
                    System.out.print(" ");
                if (j < i)
                    idx++;
                else
                    idx--;
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--)
                System.out.print("  ");
            int idx = 0;
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(idx);
                if (j < i * 2 - 1)
                    System.out.print(" ");
                if (j < i)
                    idx++;
                else
                    idx--;
            }
            System.out.println();
        }

    }
}
