import java.util.Scanner;

public class CF339B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] arr = new int[m];


        for (int i = 0; i < m; i++) {
            arr[i] = input.nextInt();
        }
        long totalTime = 0;
        long currentHouse = 1;
        for (int i = 0; i < m; i++) {
            if (arr[i] > currentHouse){
                totalTime = totalTime + (arr[i] - currentHouse);
                currentHouse = arr[i];
            } else if (arr[i] < currentHouse) {
                totalTime = totalTime + n - currentHouse + arr[i];
                currentHouse = arr[i];
            }
        }
        System.out.println(totalTime);
    }
}
