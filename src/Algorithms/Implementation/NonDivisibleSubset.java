package Algorithms.Implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Non-Divisible Subset
 *
 * Given a set, S, of n distinct integers,
 * print the size of a maximal subset, S', of S where the sum of any 2 numbers in S' is not evenly divisible by k.
 */
public class NonDivisibleSubset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int j=0; j<n; j++) {
            int i = scanner.nextInt() % k;
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int res = 0;
        for (int i=1; i<k/2+k%2; i++) {
            res += Math.max(map.getOrDefault(i, 0), map.getOrDefault(k-i, 0));
        }
        res += map.containsKey(0)?1:0;
        res += (k%2==0 && map.containsKey(k/2))?1:0;
        System.out.println(res);
    }
}
