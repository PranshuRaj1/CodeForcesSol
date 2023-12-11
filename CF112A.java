import java.util.Scanner;

public class CF112A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine().toLowerCase();
        String str2 = input.nextLine().toLowerCase();
        String ans = "";

        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)){
                ans = "0";
            } else if (str1.charAt(i) < str2.charAt(i)) {
                ans = "-1";
                break;
            }
            else {
                ans = "1";
                break;
            }
        }
        System.out.println(ans);
    }
}
