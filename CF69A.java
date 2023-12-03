import java.util.Scanner;

public class CF69A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum_x = 0;
        int sum_y = 0;
        int sum_z = 0;

        for (int i = 0; i < n; i++) {
            int xCoordinate = scanner.nextInt();
            int yCoordinate = scanner.nextInt();
            int zCoordinate = scanner.nextInt();
            sum_x += xCoordinate;
            sum_y += yCoordinate;
            sum_z += zCoordinate;
        }
        if (sum_x== 0 && sum_y == 0 && sum_z == 0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

}
