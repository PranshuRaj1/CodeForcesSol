import java.util.Scanner;

public class CF58A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String hello = "hello";
        int count = 0;
        int j = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == hello.charAt(j)){
                j++;
                count++;
                if (count == 5){
                    break;
                }
            }
        }
        if (count == 5){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
