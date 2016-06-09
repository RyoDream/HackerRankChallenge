package Tutorials30DaysOfCode;

import java.util.Scanner;

/**
 * Day 27: Testing
 *
 * Objective
 * This challenge is very different from the others we've completed
 * because it requires you to generate valid test cases for a problem instead of solving the problem.
 *
 * There is no input to read, you simply have to generate
 * and print test values for the problem that satisfy both the problem's Input Format
 * and the criteria laid out in the Task section.
 *
 * Check out the Tutorial tab for an instructional video on testing!
 *
 * A Discrete Mathematics professor has a class of N students.
 * Frustrated with their lack of discipline,
 * he decides to cancel class if fewer than K students are present when class starts.
 *
 * Given the arrival time of each student, determine if the class is canceled.
 * Input Format
 *
 * The first line of input contains T, the number of test cases.
 * Each test case consists of two lines.
 * The first line has two space-separated integers,
 * N (students in the class) and K (the cancelation threshold).
 * The second line contains N space-separated integers () describing the arrival times for each student.
 *
 * Note: Non-positive arrival times indicate the student arrived early or on time;
 * positive arrival times indicate the student arrived  minutes late.
 *
 * Output Format
 * For each test case, print the word YES if the class is canceled or NO if it is not.
 *
 * Constraints
 * 1 <= T <= 10
 * 1 <= N <= 1000
 * 1 <= K <= N
 * -100 <= ai <= 100, where i∈[1,N]
 *
 * Note
 * If a student arrives exactly on time,
 * the student is considered to have entered before the class started.
 *
 * Sample Input
 * 2
 * 4 3
 * -1 -3 4 2
 * 4 2
 * 0 -1 2 1
 *
 * Sample Output
 * YES
 * NO
 */
public class Day27Testing {

    Day27Testing(int n, int k, int[] a) {
        System.out.println(n + " " + k);
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int testCases = 5;

        System.out.println(testCases);
        new Day27Testing(4, 3, new int[] {-1, 0, 4, 2});
        new Day27Testing(5, 2, new int[] {0, -1, 2, 1, 4});
        new Day27Testing(7, 6, new int[] {2, 0, -1, 1 , 1 , 1, 1});
        new Day27Testing(3, 1, new int[] {-1, 0, 4});
        new Day27Testing(6, 4, new int[] {0, -1, 1, 4, 5, 6});
    }
}
