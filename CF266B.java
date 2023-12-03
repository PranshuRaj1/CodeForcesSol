
import java.util.Scanner;

public class CF266B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();

        char[] arr = str.toCharArray();

        for (int j = 0; j < t; j++) {
            for (int i = 0; i < n -1; i++) {
                if (arr[i] == 'B' && arr[i+1] == 'G' ){
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    i++;

                }

            }
        }
        System.out.println(new String(arr));

        scan.close();

    }
}
