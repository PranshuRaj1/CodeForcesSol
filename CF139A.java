import java.util.Scanner;

public class CF139A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
        int[] arr = new int[7];
        int days = 0;


        for (int i = 0; i < 7; i++) {
            arr[i] = input.nextInt();

        }

        while (n > 0){
            for (int i = 0; i < 7; i++) {
                n = n - arr[i];
                days++;
                if (n<=0){
                    break;
                }
            }
        }

        int result = days % 7 == 0 ? 7 : days % 7;

        System.out.println(result);



    }
}
