package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Sherlock and Squares
 *
 * Watson gives two integers (A and B) to Sherlock and asks
 * if he can count the number of square integers between A and B (both inclusive).
 *
 * Note: A square integer is an integer which is the square of any integer.
 * For example, 1, 4, 9, and 16 are some of the square integers as they are squares of 1, 2, 3, and 4, respectively.
 *
 * Input Format
 * The first line contains T, the number of test cases.
 * T test cases follow, each in a new line.
 * Each test case contains two space-separated integers denoting A and B.
 *
 * Output Format
 * For each test case, print the required answer in a new line.
 *
 * Constraints
 * 1 <= T <= 100
 * 1 <= A <= B <= 10^9
 *
 * Sample Input
 * 2
 * 3 9
 * 17 24
 *
 * Sample output
 * 2
 * 0
 */
public class SherlockAndSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while(T-- > 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int count = 0;
            int square = (int)Math.sqrt(A);

            while(square*square < A)
                square++;

            while(square*square <= B) {
                square++;
                count++;
            }

            System.out.println(count);
        }
    }
}
