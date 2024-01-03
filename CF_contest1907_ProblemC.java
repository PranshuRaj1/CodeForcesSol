import java.util.Scanner;
import java.util.Stack;

public class CF_contest1907_ProblemC {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int t = input.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = input.nextInt();
//            String str = input.next();
//            System.out.println(madad(str,n));
//        }
//        input.close();
        System.out.println(madad("aabc",4));
    }
    static StringBuilder madad(String s, int n){
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != s.charAt(i-1)){
                result.append(s.charAt(i-1));
            }
        }
        return result;
    }
}
