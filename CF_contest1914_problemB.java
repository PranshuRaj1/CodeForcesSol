import java.util.ArrayList;
import java.util.Scanner;

public class CF_contest1914_problemB {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] n = new int[t];
        int[] k = new int[t];

        for (int i = 0; i < t; i++) {
            n[i] = input.nextInt();
            k[i] = input.nextInt();

        }

        for (int i = 0; i < t; i++) {
            if (k[i] == n[i] - 1){
                for (int j = 1; j <= n[i]; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
                continue;
            }
            if (k[i] == 0){
                for (int j = n[i]; j > 0; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
                continue;
            }
            else {
                madad(n[i],k[i]);
            }
            System.out.println();
        }

    }
    static void madad(int n, int k){
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < k; i++) {
            list.add(n - i);
        }
        for (int i = 0; i < n - k; i++) {
            list.add(i + 1);
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

}
