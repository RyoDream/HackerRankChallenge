package Algorithms.Greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Priyanka and Toys
 *
 * Little Priyanka visited a kids' shop.
 * There are N toys and their weight is represented by an array W = [w1,w2,..,wN].
 * Each toy costs 1 unit, and if she buys a toy with weight w',
 * then she can get all other toys whose weight lies between [w', w'+4]  (both inclusive) free of cost.
 *
 * Input Format
 * The first line contains an integer N i.e. number of toys.
 * Next line will contain N integers, w1,w2,..,wN, representing the weight array.
 *
 * Output Format
 * Minimum units with which Priyanka could buy all of toys.
 *
 * Constraints
 * 1 <= N <= 10^5
 * 0 <= wi <= 10^4, where i belongs to [1,N]
 * Sample Input
 * 5
 * 1 2 3 17 10
 * Sample Output
 * 3
 */
public class PriyankaAndToys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] w = new int[N];

        for(int i=0;i<N;i++) {
            w[i] = sc.nextInt();
        }

        Arrays.sort(w);
        int lastIndex = 0;
        int res = 1;

        for(int i=0;i<N;i++) {
            if(w[i] - w[lastIndex] > 4) {
                res++;
                lastIndex = i;
            }
        }
        System.out.println(res);
    }
}
