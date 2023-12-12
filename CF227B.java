import java.util.HashMap;
import java.util.Scanner;

public class CF227B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            indexMap.put(array[i], i);
        }

        int m = sc.nextInt();
        int[] queries = new int[m];

        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt();
        }

        long vasyaComparisons = 0;
        long petyaComparisons = 0;

        for (int i = 0; i < m; i++) {
            int query = queries[i];
            vasyaComparisons += indexMap.get(query) + 1;
            petyaComparisons += n - indexMap.get(query);
        }

        System.out.println(vasyaComparisons + " " + petyaComparisons);
    }
}
