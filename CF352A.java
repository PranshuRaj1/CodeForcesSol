import java.util.Scanner;

public class CF352A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(getMaxDivisibleBy90(arr));
    }
    static String getMaxDivisibleBy90(int[] cards) {

        int countZero = 0;
        int countFive = 0;

        for (int card : cards) {
            if (card == 0) {
                countZero++;
            } else if (card == 5) {
                countFive++;
            }
        }


        if (countZero == 0) {
            return "-1";
        }


        countFive = countFive - countFive % 9;


        StringBuilder result = new StringBuilder();


        for (int i = 0; i < countFive; i++) {
            result.append("5");
        }


        if (countFive > 0) {
            for (int i = 0; i < countZero; i++) {
                result.append("0");
            }
        } else {

            result.append("0");
        }

        return result.toString();
    }

}
