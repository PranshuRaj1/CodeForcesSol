package CodeForcesSol;
import java.util.Scanner;

public class CF155A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int amazing = 0;
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        }
        int best = arr[0];
        int worst = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > best){
                best = arr[i];
                amazing++;
            } else if (arr[i] < worst) {
                worst = arr[i];
                amazing++;
            }
        }
        System.out.println(amazing);


    }
}