package Tutorials30DaysOfCode;

import java.util.Scanner;

/**
 * Day 11: 2D-Arrays
 *
 * Objective
 * Today, we're building on our knowledge of Arrays by adding another dimension.
 * Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Context
 * Given a  2D Array, A:
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 *
 * We define an hourglass in A to be a subset of values
 * with indices falling in this pattern in A's graphical representation:
 *
 * a b c
 *   d
 * e f g
 *
 * There are 6*6 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.
 *
 * Task
 * Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
 *
 * Input Format
 *
 * There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array A;
 * every value in A will be in the inclusive range of -9 to 9.
 *
 * Constraints
 * -9 <= A[i][j] <= 9
 * 0 <= i,j <= 5
 *
 * Output Format
 * Print the largest (maximum) hourglass sum found in A.
 *
 * Sample Input
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 *
 * Sample Output
 * 19
 */
public class Day112DArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];

        for(int i=0;i<6;i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                int sum = calHourglass(arr, i, j);
                if(sum > max)
                    max = sum;
            }
        }

        System.out.println(max);
    }

    public static int calHourglass(int[][] arr, int x, int y) {
        int sum = 0;
        sum += arr[x][y];
        sum += arr[x][y+1];
        sum += arr[x][y+2];
        sum += arr[x+1][y+1];
        sum += arr[x+2][y];
        sum += arr[x+2][y+1];
        sum += arr[x+2][y+2];

        return sum;
    }
}
