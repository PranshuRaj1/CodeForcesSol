import java.util.Scanner;

public class CF165A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] points = new  int[n][2];
        

        for (int i = 0; i < n; i++) {
            points[i][0] = input.nextInt();
            points[i][1] = input.nextInt();
        }

        System.out.println(countPoints(points));
    }
    
    static int countPoints(int[][] points){
        int superCentral = 0;
        
        for (int[] p : points) {
            boolean hasUpper = false, hasLower = false, hasLeft = false, hasRight = false;

            for (int[] q : points) {
                if (q[0] == p[0] && q[1] > p[1]) {
                    hasUpper = true;
                } else if (q[0] == p[0] && q[1] < p[1]) {
                    hasLower = true;
                } else if (q[0] < p[0] && q[1] == p[1]) {
                    hasLeft = true;
                } else if (q[0] > p[0] && q[1] == p[1]) {
                    hasRight = true;
                }
            }
            if (hasLeft && hasLower && hasRight && hasUpper) {
                superCentral++;
            }
        }
        return superCentral;
    }
}
