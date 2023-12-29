import java.util.Scanner;

public class CF96A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        boolean ans = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("0000000", i) || str.startsWith("1111111", i)){
                ans = true;
                break;
            }
            else {
                ans = false;
            }
        }
        System.out.println(ans ? "YES": "NO");
    }
}
