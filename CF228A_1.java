import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF228A_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();
        int s4 = input.nextInt();

        Set<Integer> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        int uniqueShoe = 4 - set.size();
        System.out.println(uniqueShoe);
    }
}
