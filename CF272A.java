import java.util.Scanner;

public class CF272A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] friendsFingers = new int[n];

        for (int i = 0; i < n; i++) {
            friendsFingers[i] = input.nextInt();
        }

        int waysToAvoidCleaning = 0;

        for (int i = 1; i <= 5; i++) {
            int totalFingers = i;
            for (int j = 0; j < n; j++) {
                totalFingers += friendsFingers[j];
            }
            if (totalFingers % (n + 1) != 1) {
                waysToAvoidCleaning++;
            }
        }

        System.out.println(waysToAvoidCleaning);
        input.close();

    }
}
