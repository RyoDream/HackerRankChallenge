package Algorithms.DynamicProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Recursion: Davis' Staircase
 *
 * Davis has s staircases in his house and he likes to climb each staircase 1, 2, or 3 steps at a time.
 * Being a very precocious child, he wonders how many ways there are to reach the top of the staircase.
 *
 * Given the respective heights for each of the s staircases in his house,
 * find and print the number of ways he can climb each staircase on a new line.
 */
public class Recursion_DavisStaircase {

    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();

            System.out.println(climb(n));
        }
    }

    private static int climb(int n) {
        if(n < 0)
            return 0;

        if(n == 0)
            return 1;

        if(map.containsKey(n))
            return map.get(n);
        else {
            int count = climb(n-1) + climb(n-2) + climb(n-3);
            map.put(n, count);
            return count;
        }
    }
}
