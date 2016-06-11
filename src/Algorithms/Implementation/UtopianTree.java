package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Utopian Tree
 *
 * The Utopian Tree goes through 2 cycles of growth every year.
 * Each spring, it doubles in height. Each summer, its height increases by 1 meter.
 * Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring.
 * How tall will her tree be after N growth cycles?
 *
 * Input Format
 * The first line contains an integer, T, the number of test cases.
 * subsequent lines each contain an integer, N, denoting the number of cycles for that test case.
 *
 * Constraints
 * 1 <= T <= 10
 * 0 <= N <= 60
 *
 * Output Format
 * For each test case, print the height of the Utopian Tree after  cycles.
 * Each height must be printed on a new line.
 *
 * Sample Input
 * 3
 * 0
 * 1
 * 4
 *
 * Sample Output
 * 1
 * 2
 * 7
 */
public class UtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();

            int height = 1;

            for(int i=1;i<=n;i++) {
                if(i%2 == 0)
                    height+=1;
                else
                    height*=2;
            }
            System.out.println(height);
        }
    }
}
