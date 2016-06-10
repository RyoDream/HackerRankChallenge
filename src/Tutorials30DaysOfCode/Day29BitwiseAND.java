package Tutorials30DaysOfCode;

import java.util.Scanner;

/**
 * Day 29: Bitwise AND
 *
 * Objective
 * Welcome to the last day!
 * Today, we're discussing bitwise operations.
 * Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Task
 * Given set S={1,2,3,..,N}. Find two integers, A and B (where A<B),
 * from set S such that the value of A&B is the maximum possible and also less than a given integer, K.
 * In this case, & represents the bitwise AND operator.
 *
 * Input Format
 * The first line contains an integer, T, the number of test cases.
 * Each of the T subsequent lines defines a test case as 2 space-separated integers, N and K, respectively.
 *
 * Constraints
 *
 * Output Format
 * For each test case, print the maximum possible value of A&B on a new line.
 *
 * Sample Input
 * 3
 * 5 2
 * 8 5
 * 2 2
 *
 * Sample Output
 * 1
 * 4
 * 0
 */
public class Day29BitwiseAND {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();

            System.out.println(bitwise(n, k));
        }
    }

    private static int bitwise(int n, int k) {
        int max = 0;

        for(int i=1;i<=n;i++) {
            for (int j=i+1; j<=n; j++) {
                int temp = i&j;
                if(temp>max && temp<k) {
                    max = temp;
                }
            }
        }

        return max;
    }
}
