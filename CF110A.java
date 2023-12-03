import java.util.Scanner;

public class CF110A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        char[] arr  = str.toCharArray();

        int num_lucky = 0;

        for (char c : arr) {
            if (c == '7' || c == '4') {
                num_lucky++;
            }
        }

        if (num_lucky == 4 || num_lucky == 7){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
