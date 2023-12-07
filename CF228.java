import java.util.Arrays;
import java.util.Scanner;

public class CF228 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;

        for (int i = 1; i < 4; i++) {
            if (arr[i-1] == arr[i]){//01 12 23
                count++;
            }
        }
        System.out.println(count);
    }

}
