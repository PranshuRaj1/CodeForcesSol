import java.util.Scanner;

public class CF224A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double one = input.nextInt();
        double two = input.nextInt();
        double three = input.nextInt();

        double len1 = Math.sqrt((one * two) /three);
        double len2 = Math.sqrt(one*three/two);
        double len3 = Math.sqrt(two*three/one);

        int ans  = (int)((int)4*(len1 + len2 + len3));

        System.out.println(ans);

    }

}
