import java.util.Scanner;

public class CF231A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;



        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum = sum + input.nextInt();
            }
            if (sum >= 2){
                count++;
            }
        }
        System.out.println(count);
    }
}
