package Algorithms.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The Maximum Subarray
 *
 * Given an array  of  elements, find the maximum possible sum of a
 * 1. Contiguous subarray
 * 2. Non-contiguous (not necessarily contiguous) subarray.
 * Empty subarrays/subsequences should not be considered.
 *
 * Input Format
 * First line of the input has an integer T. T cases follow.
 * Each test case begins with an integer N. In the next line,
 * N integers follow representing the elements of array A.
 *
 * Constraints:
 * 1 <= T <= 10
 * 1 <= N <= 10^5
 * -10^4 <= ai <= 10^4
 *
 * The subarray and subsequences you consider should have at least one element.
 *
 * Output Format
 *
 * Two, space separated, integers denoting the maximum contiguous and non-contiguous subarray.
 * At least one integer should be selected and put into the subarrays
 * (this may be required in cases where all elements are negative).
 *
 * Sample Input
 * 2
 * 4
 * 1 2 3 4
 * 6
 * 2 -1 2 3 4 -5
 *
 * Sample Output
 * 10 10
 * 10 11
 *
 * Explanation
 * In the first case:
 * The max sum for both contiguous and non-contiguous elements is the sum
 * of ALL the elements (as they are all positive).
 *
 * In the second case:
 * [2 -1 2 3 4] --> This forms the contiguous sub-array with the maximum sum.
 * For the max sum of a not-necessarily-contiguous group of elements, simply add all the positive elements.
 */
public class TheMaximumSubarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while(T-- > 0) {
            int N = scanner.nextInt();
            int[] array = new int[N];
            int i = 0;

            while(i < N) {
                array[i] = scanner.nextInt();
                i++;
            }

            findMaxSum(array);
        }
    }

    public static void findMaxSum(int[] array) {
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;

        for(int x:array) {
            max_ending_here = Math.max(x, max_ending_here+x);
            max_so_far = Math.max(max_ending_here, max_so_far);
        }

        Arrays.sort(array);
        int sum = 0;
        if(array[array.length-1] <= 0)
            sum = array[array.length-1];
        else {
            int i = array.length-1;
            while(i>=0 && array[i]>0) {
                sum+=array[i];
                i--;
            }
        }

        System.out.println(max_so_far+" "+sum);
    }

}
