import java.util.Scanner;

public class CF266A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        String stones = in.nextLine();


        char[] arr = stones.toCharArray();
        int count = 0;

        for (int i = 1; i < num; i++) {
            if (arr[i] == arr[i - 1]){
                count++;
            }
        }
        in.close();
        System.out.println(count);

    }
}
