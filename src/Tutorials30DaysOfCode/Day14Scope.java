package Tutorials30DaysOfCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Day 14: Scope
 *
 * Objective
 * Today we're discussing scope.
 * Check out the Tutorial tab for learning materials and an instructional video!
 *
 * The absolute difference between two integers, a and b, is written as |a-b|.
 * The maximum absolute difference between two integers in a set of positive integers, elements,
 * is the largest absolute difference between any two integers in elements.
 *
 * The Difference class is started for you in the editor.
 * It has a private integer array (elements) for storing N non-negative integers,
 * and a public integer (maxDifference) for storing the maximum absolute difference.
 *
 * Task
 * Complete the Difference class by writing the following:
 *      A class constructor that takes an array of integers as a parameter
 *      and saves it to the elements instance variable.
 *
 *      A computeDifference method that finds the maximum absolute difference
 *      between any 2 numbers in N and stores it in the maxDifference instance variable.
 *
 * Input Format
 * You are not responsible for reading any input from stdin.
 * The locked Solution class in your editor reads in 2 lines of input;
 * the first line contains N, and the second line describes the elements array.
 *
 * Constraints
 * 1 <= N <= 10
 * 1 <= elements[i] <= 100, where 0<=i<=N-1
 *
 * Output Format
 * You are not responsible for printing any output;
 * the Solution class will print the value of the maxDifference instance variable.
 *
 * Sample Input
 * 3
 * 1 2 5
 *
 * Sample Output
 * 4
 */
public class Day14Scope {
    private int[] elements;
    public int maximumDifference;

    public Day14Scope(int[] elements) {
        this.elements = elements;
        this.maximumDifference = 0;
    }

    public void computeDifference() {
        Arrays.sort(elements);
        this.maximumDifference = Math.abs(elements[0] - elements[elements.length-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Day14Scope D = new Day14Scope(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
    }

}
