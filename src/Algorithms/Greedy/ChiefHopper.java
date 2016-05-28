package Algorithms.Greedy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Largest Permutation
 *
 * You are given an array of N integers which is a permutation of the first N natural numbers.
 * You can swap any two elements of the array.
 * You can make at most K swaps.
 * What is the largest permutation, in numerical order, you can make?
 *
 * Input Format
 * The first line of the input contains two integers,  and , the size of the input array and the maximum swaps you can make, respectively. The second line of the input contains a permutation of the first  natural numbers.
 *
 * Output Format
 * Print the lexicographically largest permutation you can make with at most  swaps.
 *
 * Constraints
 * 1 <= N <= 10^5
 * 1 <= K <= 10^9
 *
 * Sample Input#00
 * 5 1
 * 4 2 3 5 1
 *
 * Sample Output#00
 * 5 2 3 4 1
 */
public class ChiefHopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] nums = new int[N];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<N;i++) {
            nums[i] = sc.nextInt();
            map.put(nums[i],i);
        }

        for(int i=0;i<N-1 && K>0; i++) {
            if(nums[i] == N-i)
                continue;

            nums[map.get(N-i)] = nums[i];
            map.put(nums[i], map.get(N-i));
            nums[i] = N-i;
            map.put(N-i, i);

            K--;
        }

        for(int num:nums)
            System.out.print(num+" ");
        System.out.println();
    }

    private static int findMaxIndex(int[] nums, int start) {

        int max = nums[start];
        int index = start;
        for(int i=start;i<nums.length;i++)
            if(nums[i] > max) {
                index = i;
                max = nums[i];
            }

        return index;
    }
}
