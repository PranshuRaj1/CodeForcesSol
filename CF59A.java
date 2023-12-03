import java.util.Scanner;

public class CF59A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int small = 0;
        int capital = 0;
        char[] arr  = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90){
                capital++;
            }
            else {
                small++;
            }

        }

        if (small < capital){
            //sabko capital
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 97 && str.charAt(i) <= 122){
                    arr[i] = (char) (str.charAt(i) - 32);
                }
            }

        }
        else {
            //sabko small
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90){
                    arr[i] = (char) (str.charAt(i) + 32);
                }
            }
        }
        String ans = new String(arr);
        System.out.println(ans);
    }
}
