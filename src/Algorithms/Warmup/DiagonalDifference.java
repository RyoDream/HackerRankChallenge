package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Diagonal Difference
 *
 * Given a square matrix of size N*N,
 * calculate the absolute difference between the sums of its diagonals.
 *
 * Input Format
 * The first line contains a single integer, N.
 * The next N lines denote the matrix's rows,
 * with each line containing N space-separated integers describing the columns.
 *
 * Output Format
 * Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
 *
 * Sample Input
 * 3
 * 11 2 4
 * 4 5 6
 * 10 8 -12
 *
 * Sample Output
 * 15
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];

        int sum = 0;

        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();

                if(a_i == a_j)
                    sum += a[a_i][a_j];

                if(a_i+a_j == n-1)
                    sum -= a[a_i][a_j];
            }
        }

        System.out.println(Math.abs(sum));
    }
}
