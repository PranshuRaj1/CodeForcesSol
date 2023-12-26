import java.util.Scanner;

public class CF208A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newString = scanner.next();
        String[] words = newString.split("WUB");

        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word + " ");
            }
        }
    }
}
