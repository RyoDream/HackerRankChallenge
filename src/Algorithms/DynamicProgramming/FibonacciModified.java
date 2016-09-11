package Algorithms.DynamicProgramming;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Fibonacci Modified
 *
 * We define a modified Fibonacci sequence using the following definition:
 *
 * Given terms ti and tj where 1<=i, term ti+2 is computed using the following relation:
 * ti+2 = ti + (ti+1)^2
 *
 * Given three integers, t1, t2, and n, compute and print term tn of a modified Fibonacci sequence.
 * Note: The value of tn may exceed the range of a 64-bit integer.
 * Many submission languages have libraries that can handle such large results but, for those that don't (e.g., C++),
 * you will need to be more creative in your solution
 * to compensate for the limitations of your chosen submission language.
 *
 * Input Format
 * A single line of three space-separated integers describing the respective values of t1, t2, and n.
 *
 * Constraints
 * 0<=t1,t2<=2
 * 3<=n<=20
 * may exceed the range of a 64-bit integer.
 *
 * Output Format
 * Print a single integer denoting the value of term tn
 * in the modified Fibonacci sequence where the first two terms are  and .
 *
 * Sample Input
 * 0 1 5
 *
 * Sample Output
 * 5
 */
public class FibonacciModified {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BigInteger t1 = new BigInteger(scn.nextInt()+"");
        BigInteger t2 = new BigInteger(scn.nextInt()+"");
        int n = scn.nextInt();

        BigInteger temp = new BigInteger("0");
        for(int i=3;i<=n;i++){
            temp = t2;
            t2 = t2.multiply(t2);
            t2 = t2.add(t1);
            t1 = temp;
        }
        System.out.println(t2);
    }
}
