package Algorithms.DynamicProgramming;

import java.util.Scanner;

/**
 * The Coin Change Problem
 *
 * How many different ways can you make change for an amount, given a list of coins?
 * In this problem, your code will need to efficiently compute the answer.
 *
 * Task
 * Write a program that, given
 * The amount N to make change for and the number of types M of infinitely available coins
 * A list of M coins - {C1,C2,..,CM}
 * Prints out how many different ways you can make change from the coins to STDOUT.
 */

public class TheCoinChangeProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] array = new int[m];

        for(int i=0;i<m;i++)
            array[i] = scanner.nextInt();

        System.out.println(count(array, m, n));
    }

    public static long count(int[] array, int m, int n) {
        long[] res = new long[n+1];
        res[0] = 1;

        for(int i=0;i<m;i++) {
            for(int j=array[i];j<=n;j++)
                res[j] += res[j-array[i]];
        }
        return res[n];
    }
}
