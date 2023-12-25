import java.util.Objects;
import java.util.Scanner;


public class CF43A {
    public static void main(String[] args) {
        System.out.println(winner());

    }
    static String winner(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n == 1){
            return input.next();
        }
        int goalA = 0;
        int goalB = 0;
        String[] goals = new String[2];
        goals[0] = input.next();
        goalA++;

        for (int i = 0; i < n - 1; i++) {
            String name = input.next();
            if (!Objects.equals(name, goals[0])){
                goals[1] = name;
                goalB++;
            }
            else {
                goalA++;
            }

        }
        if (goalA > goalB){
            return goals[0];
        }
        else {
            return goals[1];
        }
    }
}
