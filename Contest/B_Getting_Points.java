import java.util.Scanner;

public class B_Getting_Points {
    public static void main(String[] args) {
        // n days
        //needs p points
        //earn t for practical
        //earn l for lesson attended
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();

        for (int i = 0; i < tc; i++) {
            long n = input.nextInt();
            long p = input.nextLong();
            long l =  input.nextInt();
            long t = input.nextInt();

            long taskCount = 1 + (n-1)/7;
            long pointCount = t*taskCount + l * ((taskCount + 1)/2);

            if (pointCount >= p){
                long ans = (p + l + 2 *t - 1)/(l + 2* t);
                System.out.println(n - ans);
            }
            else {
                long days = (taskCount  +1 )/2;
                long rem = p - pointCount;
                long ans = (rem + l - 1)/l + days;
                System.out.println(n - ans);
            }
            
        }
        input.close();


    }
    

}
