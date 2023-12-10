import java.util.Scanner;

public class CF133A {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String str = input.nextLine();
        boolean ans = true;

        for (char ch : str.toCharArray()) {
            if (ch == 'H' || ch == 'Q' || ch == '9' ){
                ans = true;
                break;
            }
            else {
                ans = false;
            }
        }
        if (ans){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
