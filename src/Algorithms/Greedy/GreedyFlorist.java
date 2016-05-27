package Algorithms.Greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Greedy Florist
 *
 * You and  friends want to buy N flowers.
 * Each flower fi has some cost ci.
 * The florist is greedy and wants to maximize his number of new customers,
 * so he increases the sale price of flowers for repeat customers;
 * more precisely, if a customer has already purchased x flowers, price P for fi is P(fi) = (x+1)*ci.
 *
 * Find and print the minimum cost for your group to purchase N flowers.
 *
 * Note: You can purchase the flowers in any order.
 *
 * Input Format
 * The first line contains two integers,
 * N (number of flowers to purchase) and K (the size of your group of friends, including you).
 *
 * The second line contains N space-separated positive integers describing the cost (c0,c1,..,cN-1) for each flower  .
 *
 * Constraints
 * 1 <= N,K <= 100
 * 1 <= ci <= 10^6
 * answer < 2^31
 * 0 <= i <= N-1
 *
 *
 * Output Format
 * Print the minimum cost for buying  flowers.
 *
 * Sample Input 0
 * 3 3
 * 2 5 6
 *
 * Sample Output 0
 * 13
 *
 * Sample Input 1
 * 3 2
 * 2 5 6
 *
 * Sample Output 1
 * 15
 */
public class GreedyFlorist {
    public static void main( String args[] ){
        Scanner in = new Scanner(System.in);

        int N, K;
        N = in.nextInt();
        K = in.nextInt();

        int C[] = new int[N];
        for(int i=0; i<N; i++){
            C[i] = in.nextInt();
        }

        Arrays.sort(C);
        int result = 0;

        for(int i=0;i<N;i++) {
            result += (i/K + 1)*C[N-i-1];
        }

        System.out.println( result );

    }
}
