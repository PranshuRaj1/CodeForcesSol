import java.util.Scanner;

public class CF_contest1872_A {
    public static void main(String[] args) {
        Scanner input  =new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            System.out.println(madad(a,b,c));
        }
    }
    static int madad(int a, int b , int c){
        int min = Math.min(a,b);
        int max = Math.max(a, b);
        int count = 0;

        while (max > min){
            min = min + c;
            max = max - c;
            count++;
        }
        return count;
    }
}
