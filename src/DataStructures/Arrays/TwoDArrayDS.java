package DataStructures.Arrays;

import java.util.*;

/**
 * 2D Array - DS
 *
 * You are given a 2D array with dimensions 6*6.
 * An hourglass in an array is defined as a portion shaped like this:
 * a b c
 *   d
 * e f g
 *
 * For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 *
 * Actually, there are many hourglasses in the array above.
 * The three topmost hourglasses are the following:
 * 1 1 1     1 1 0     1 0 0
 *   1         0         0
 * 1 1 1     1 1 0     1 0 0
 *
 * The sum of an hourglass is the sum of all the numbers within it.
 * The sum for the hourglasses above are 7, 4, and 2, respectively.
 *
 * In this problem, you have to print the largest sum among all the hourglasses in the array.
 * Note: If you have already solved the problem "Java 2D array"
 * in the data structures chapter of the Java domain, you may skip this challenge.
 *
 * Input Format
 * There will be exactly 6 lines of input,
 * each containing 6 integers separated by spaces.
 * Each integer will be between -9 and 9, inclusively.
 *
 * Output Format
 * Print the answer to this problem on a single line.
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

public class TwoDArrayDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
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