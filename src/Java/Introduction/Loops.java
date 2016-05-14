package Java.Introduction;

import java.util.Scanner;

/**
 * Java Loops
 * In this problem you will test your knowledge of Java loops.
 * Given three integers a, b, and n, output the following series:
 * a+2^0*b, a+2^0*b+2^1*b, .. , a+2^0*b+2^1*b+..+2^(n-1)*b
 *
 * Input Format
 * The first line will contain the number of testcases t.
 * Each of the next  lines will have three integers, , , and .
 *
 * Constraints:
 * 0 <= t <= 500
 * 0 <= a,b <= 50
 * 1 <= n <= 15
 *
 * Output Format
 * Print the answer to each test case in separate lines.
 *
 * Sample Input
 * 2
 * 0 2 10
 * 5 3 5
 *
 * Sample Output
 * 2 6 14 30 62 126 254 510 1022 2046
 * 8 14 26 50 98
 *
 * Explanation
 * In the first case:
 * 1st term=0+1*2=2
 * 2nd term=0+1*2+2*2=6
 * 3rd term=0+1*2+2*2+4*2=14
 * and so on.
 */
public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int run = scan.nextInt();

        while(run-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            int sum = a + b;
            System.out.print(sum);
            for(int i=1;i<n;i++) {
                sum += b*Math.pow(2,i);
                System.out.print(" "+sum);
            }
            System.out.println();
        }

        scan.close();
    }
}
