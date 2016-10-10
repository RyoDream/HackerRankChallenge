package Algorithms.DynamicProgramming;

import java.util.Scanner;

/**
 * DP: Coin Change
 *
 * Given a number of dollars, n, and a list of dollar values for m distinct coins,
 * C = {c0,c1,..,cm-1}, find and print the number of different ways you can make change for m dollars
 * if each coin is available in an infinite quantity.
 */
public class DP_CoinChange {
    public static long makeChange(int[] coins, int money) {
        long[] res = new long[money+1];
        res[0] = 1;

        for(int i=0;i<coins.length;i++) {
            for(int j=coins[i];j<=money;j++)
                res[j] += res[j-coins[i]];
        }
        return res[money];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        System.out.println(makeChange(coins, n));
    }
}
