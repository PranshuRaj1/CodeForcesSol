import java.util.Objects;
import java.util.Scanner;

public class CF282A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 0;


        for (int i = 0; i < n; i++) {
            String command = input.next();
            if (Objects.equals(command, "X++") || Objects.equals(command, "++X")){
                x++;
            }
            if (Objects.equals(command, "X--") || Objects.equals(command, "--X")){
                x--;
            }
        }
        System.out.println(x);
    }
}
