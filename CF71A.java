import java.util.Scanner;

public class CF71A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println(isLong(input.nextLine()));
        }




    }
    static String isLong(String str){
        if (str.length() <11){
            return str;
        }
        StringBuilder ans = new StringBuilder();
        ans.append(str.charAt(0));
        ans.append(str.length() - 2);
        ans.append(str.charAt(str.length() - 1));

        return ans.toString();
    }
}
