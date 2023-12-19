import java.util.Arrays;
import java.util.Scanner;

public class CF205A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] travelTimes = new int[n];

        for (int i = 0; i < n; i++) {
            travelTimes[i] = scanner.nextInt();
        }

        int result = findTownToGo(n, travelTimes);
        if (result == - 1){
            System.out.println("Still Rozdil");
        }
        else {
            System.out.println(result);
        }


        scanner.close();
    }

    static int findTownToGo(int n, int[] travelTimes) {
        int minTravelTime = Integer.MAX_VALUE;
        int minTravelTimeIndex = -1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (travelTimes[i] < minTravelTime) {
                minTravelTime = travelTimes[i];
                minTravelTimeIndex = i + 1;
                count = 1;
            } else if (travelTimes[i] == minTravelTime) {
                count++;
            }
        }

        return count == 1 ? minTravelTimeIndex : -1;

    }
}