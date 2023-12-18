import java.util.Scanner;

public class CF34A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }


        int[] ans = heightComparison(arr);


        System.out.println(ans[0] + " " + ans[1]);

    }
    static int[] heightComparison(int[] arr ){
        int[] height = new int[2];
        int min = Math.abs(arr[arr.length - 1] - arr[0]);
        height[0] = 1;
        height[1] = arr.length;

        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i+1]) < min){
                min = Math.abs(arr[i] - arr[i+1]);
                height[0] = i+1;
                height[1] = i + 2;
            }
        }
        return height;
    }
}
