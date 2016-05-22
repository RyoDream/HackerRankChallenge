package Tutorials30DaysOfCode;

import java.util.Scanner;

/**
 * Day 9: Recursion
 *
 * Objective
 * Today, we're learning and practicing an algorithmic concept called Recursion.
 * Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Recursive Method for Calculating Factorial
 * factorial(N) = 1 (N<=1)
 * factorial(N) = N * factorial(N-1) (otherwise)
 *
 * Task
 * Write a factorial function that takes a positive integer,
 * N as a parameter and prints the result of N! (N factorial).
 *
 * Note: If you fail to use recursion or fail to name your recursive function factorial,
 * you will get a score of 0.
 *
 * Input Format
 * A single integer, N (the argument to pass to factorial).
 *
 * Constraints
 * 2 <= N <= 12
 * Your submission must contain a recursive function named factorial.
 *
 * Output Format
 * Print a single integer denoting N!.
 *
 * Sample Input
 * 3
 *
 * Sample Output
 * 6
 *
 */
public class Day9Recursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(factorial(N));
    }

    public static int factorial(int n) {
        if(n<=1)
            return 1;
        else
            return n*factorial(n-1);
    }
}
