import java.util.Scanner;

public class CF80A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int next_prime = nextPrime(n);
        if (m == next_prime){
            System.out.println("YES");
        }
        else {
            System.out.println("No");
        }

        input.close();
    }
    //check if the number m is prime or not
    static boolean checkPrime(int m){
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (m % i == 0){
                return false;
            }
        }
        return true;
    }

    //check if number is next prime or not --> Try to find any prime number between n and m
    static int nextPrime(int n){
        n += 1;

        while (!checkPrime(n)){
            n ++;
        }
        return n;


    }
}