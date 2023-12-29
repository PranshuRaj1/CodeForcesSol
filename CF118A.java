import java.util.Scanner;

public class CF118A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next().toLowerCase();
        StringBuilder newStr = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            if ("aeiouy".indexOf(str.charAt(i)) != -1){
                continue;
            }
            else {
                newStr.append(".");
                newStr.append(str.charAt(i));
            }
        }
        System.out.println(newStr);
    }
}
