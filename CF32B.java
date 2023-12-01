
import java.util.Scanner;

public class CF32B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String borzeCode = scanner.nextLine();

        StringBuilder ternaryNumber = new StringBuilder();

        for (int i = 0; i < borzeCode.length(); i++) {
            char currentChar = borzeCode.charAt(i);

            if (currentChar == '.') {
                ternaryNumber.append('0');
            } else if (i < borzeCode.length() - 1 && currentChar == '-' && borzeCode.charAt(i + 1) == '.') {
                ternaryNumber.append('1');
                i++; // Skip the next character as it's part of the '-.' sequence
            } else if (i < borzeCode.length() - 1 && currentChar == '-' && borzeCode.charAt(i + 1) == '-') {
                ternaryNumber.append('2');
                i++; // Skip the next character as it's part of the '--' sequence
            }
        }

        System.out.println(ternaryNumber);

        scanner.close();
    }
}

