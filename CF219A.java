import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CF219A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        String s = input.next();

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] += 1;

        }
        StringBuilder s1 = new StringBuilder();

        int c;
        for (c = 0; c < 26; ++c) {
            if (count[c] % k != 0) {
                break;
            } else {
                int repeatCount = count[c] / k;
                for (int i = 0; i < repeatCount; i++) {
                    s1.append((char) ('a' + c));
                }
            }
        }

        if (c == 26) {
            while (k-- > 0) {
                System.out.print(s1);
            }
            System.out.println();
        } else {
            System.out.println(-1);
        }

    }

    static void reorderToKString(int k, String s) {
        int n = s.length();

        // Check if it is possible to create a k-string
        if (n % k != 0) {
            System.out.println("-1");
            return;
        }

        // Count the frequency of each character in the string
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : s.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Check if there are enough occurrences of each character to form a k-string
        for (int count : charCount.values()) {
            if (count % k != 0) {
                System.out.println("-1");
                return;
            }
        }

        // Create the k-string by repeating each character k times
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            appendRepeated(result, ch, count / k);
        }


        for (int i = 0; i < k-1; i++) {
            result.append(result);
        }
        System.out.println(result);
    }
    static void appendRepeated(StringBuilder sb, char ch, int times) {
        for (int i = 0; i < times; i++) {
            sb.append(ch);
        }
    }

}
