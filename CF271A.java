import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF271A {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int year = num.nextInt();
        int ans = distinct_year(year);
        System.out.println(ans);
    }

    static int distinct_year(int year){
        while (true){
            year = year + 1;
            if (num_diff(year)){
                return year;
            }
        }
    }
    static boolean num_diff(int year){
        Set<Character> digiSet = new HashSet<>();
        char[] digits = String.valueOf(year).toCharArray();
        for (char x : digits) {
            if (!digiSet.add(x)){
                return false;
            }
        }
        return true;
    }
}
