package Algorithms.Warmup;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * A Very Big Sum
 *
 * You are given an array of integers of size N.
 * You need to print the sum of the elements in the array,
 * keeping in mind that some of those integers may be quite large.
 *
 * Input
 * The first line of the input consists of an integer N.
 * The next line contains N space-separated integers contained in the array.
 *
 * Constraints
 * 1 <= N <= 10
 * 0 <= A[i] <= 10^10
 *
 * Sample Input
 * 5
 * 1000000001 1000000002 1000000003 1000000004 1000000005
 * Output
 * Print a single value equal to the sum of the elements in the array.
 * In the above sample, you would print 5000000015.
 */
public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        long sum = 0l;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            sum += arr[arr_i];
        }

        System.out.println(sum);
    }

}
