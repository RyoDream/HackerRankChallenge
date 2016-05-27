package Algorithms.Greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Mark and Toys
 *
 * Mark and Jane are very happy after having their first kid.
 * Their son is very fond of toys, so Mark wants to buy some.
 * There are N different toys lying in front of him, tagged with their prices, but he has only $K.
 * He wants to maximize the number of toys he buys with this money.
 *
 * Now, you are Mark's best friend and have to help him buy as many toys as possible.
 *
 * Input Format
 * The first line contains two integers,  and , followed by a line containing  space separated integers indicating the products' prices.
 *
 * Output Format
 * An integer that denotes maximum number of toys Mark can buy for his son.
 *
 * Constraints
 * 1 <= N <= 10^5
 * 1 <= K <= 10^9
 * 1 <= price of any toy <= 10^9
 * A toy can't be bought multiple times.
 *
 * Sample Input
 * 7 50
 * 1 12 5 111 200 1000 10
 *
 * Sample Output
 * 4
 */
public class MarkAndToys {
    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt(),k=stdin.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();

        int answer = 0;

        Arrays.sort(prices);

        int i=0;
        while (k >= prices[i]) {
            k -= prices[i++];
            answer++;
        }

        // Compute the final answer from n,k,prices
        System.out.println(answer);
    }
}
