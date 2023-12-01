import java.util.Scanner;

public class CF61A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String num1 = input.nextLine();
        String num2 = input.nextLine();
         int len = num2.length();
         char[] str1 = num1.toCharArray();
        char[] str2 = num2.toCharArray();
        char[] ans = new char[len];


        for (int i = 0; i < len; i++) {
            if (str1[i] != str2[i]){
                ans[i] = '1';
            }
            else {
                ans[i] = '0';
            }
        }
        String answer = new String(ans);
        System.out.println(answer);
    }
}
