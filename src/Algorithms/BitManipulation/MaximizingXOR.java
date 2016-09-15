package Algorithms.BitManipulation;

import java.util.Scanner;

/**
 * Maximizing XOR
 *
 * Given two integers, L and ,
 * find the maximal value of A xor B,
 * where A and B satisfy the following condition:
 * L <= A <= B <= R
 *
 * Input Format
 * The input contains two lines;  is present in the first line and  in the second line.
 * Constraints
 * 1 <= L <= R <= 10^3
 *
 * Output Format
 * The maximal value as mentioned in the problem statement.
 */
public class MaximizingXOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();

        int max = 0;
        for(int i=l;i<r;i++)
            for(int j=i+1;j<=r;j++)
                max = ((i^j) > max)?(i^j):max;

        System.out.println(max);
    }
}
