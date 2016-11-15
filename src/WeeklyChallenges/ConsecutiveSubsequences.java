package WeeklyChallenges;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Consecutive Subsequences
 *
 * Jigar got a sequence of n positive integers as his birthday present!
 * He likes consecutive subsequences whose sum is divisible by k.
 * He asks you to write a program to count them for him.
 *
 * Sample Input
 * 2
 * 5 3
 * 1 2 3 4 1
 * 6 2
 * 1 2 1 2 1 2
 * Sample Output
 * 4
 * 9
 * Explanation
 * there exists, 4 subsequences whose sum is divisible by 3, they are
 * 3
 * 1 2
 * 1 2 3
 * 2 3 4
 */
public class ConsecutiveSubsequences {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while(T-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] nums = new int[n];
            for(int i=0;i<n;i++) {
                nums[i] = scanner.nextInt();
            }

            System.out.println(countNumber(nums, k));
        }
    }

    private static String countNumber(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return "0";
        }

        int[] sum = new int[nums.length+1];
        int[] mapping = new int[k];
        sum[0] = 0;
        mapping[0] = 1;
        for(int i=1;i<=nums.length;i++) {
            sum[i] = (sum[i-1]+nums[i-1]) % k;
            mapping[sum[i]]++;
        }

        BigDecimal res = new BigDecimal(0);
        BigDecimal factor = new BigDecimal(2);
        for(int i=0;i<k;i++) {
            BigDecimal tmp = new BigDecimal(mapping[i]).multiply(new BigDecimal((mapping[i]-1)));
            res = res.add(tmp.divide(factor));
        }

        return res.toString();
    }
}
