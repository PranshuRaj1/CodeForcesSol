import java.util.Scanner;

public class CF199A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();


        int[] result = findThreeFibonacciNumbers(n);
        if (result != null) {
            for (int i : result) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("I'm too stupid to solve this problem");
        }

        scanner.close();

    }
     static int[] fibonacciNumbersUpToN(int n) {
        int[] fibNumbers = new int[3];
        fibNumbers[1] = 1;
        int i = 2;

        while (fibNumbers[i - 1] + fibNumbers[i - 2] <= n) {
            fibNumbers = resizeArray(fibNumbers, i + 1);
            fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
            i++;
        }

        return fibNumbers;
    }
    static int[] resizeArray(int[] array, int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, Math.min(array.length, newSize));
        return newArray;
    }

    static int[] findThreeFibonacciNumbers(int n) {
        int[] fibNumbers = fibonacciNumbersUpToN(n);

        for (int a : fibNumbers) {
            for (int b : fibNumbers) {
                int c = n - a - b;
                if (contains(fibNumbers, c)) {
                    return new int[]{a, b, c};
                }
            }
        }

        return null;
    }
    static boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
