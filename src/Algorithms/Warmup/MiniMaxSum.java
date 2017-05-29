package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Mini-Max Sum
 *
 * Given five positive integers,
 * find the minimum and maximum values that can be calculated
 * by summing exactly four of the five integers.
 *
 * Then print the respective minimum and maximum values
 * as a single line of two space-separated long integers.
 */
public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0;
        long min = Integer.MAX_VALUE;
        long max = 0;
        for(int i=0; i < 5; i++){
            int num = in.nextInt();
            sum += num;
            if (min > num) {
                min = num;
            }

            if (max < num) {
                max = num;
            }
        }

        System.out.println((sum - max) + " " + (sum - min));
    }
}
