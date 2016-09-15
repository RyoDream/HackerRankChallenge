package Algorithms.BitManipulation;

import java.util.Scanner;

/**
 * Lonely Integer
 *
 * Consider an array of n integers, A=[a0,a1,..an-1],
 * where all but one of the integers occur in pairs.
 *
 * In other words, every element in A occurs exactly twice except for one unique element.
 * Given A, find and print the unique element.
 *
 * Input Format
 * The first line contains a single integer, n, denoting the number of integers in the array.
 * The second line contains n space-separated integers describing the respective values in A.
 *
 * Constraints
 * 1 <= n < 100
 * It is guaranteed that n is an odd number.
 * 0<=ai<=100, where 0<=i<=n.
 *
 * Output Format
 * Print the unique number that occurs only once in A on a new line.
 */
public class LonelyInteger {
    private static int lonelyInteger(int[] a) {
        int sum = 0;
        for(int i:a)
            sum ^= i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
