package Algorithms.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Max Min
 *
 * Given a list of N integers,
 * your task is to select K integers from the list such that its unfairness is minimized.
 *
 * if (x1,x2,..,xk) are K numbers selected from the list ,
 * the unfairness is defined as
 * max(x1,x2,..,xk) - min(x1,x2,..,xk)
 *
 * where max denotes the largest integer among the elements of K,
 * and min denotes the smallest integer among the elements of K.
 *
 * Input Format
 * The first line contains an integer N.
 * The second line contains an integer K.
 * lines follow. Each line contains an integer that belongs to the list N.
 *
 * Note: Integers in the list  may not be unique.
 *
 * Output Format
 * An integer that denotes the minimum possible value of unfairness.
 *
 * Constraints
 * 2 <= N <= 10^5
 * 2 <= K <= N
 * 0 <= integer in N <= 10^9
 *
 * Sample Input #00
 * 7
 * 3
 * 10
 * 100
 * 300
 * 200
 * 1000
 * 20
 * 30
 * Sample Output #00
 * 20
 *
 * Sample Input #01
 * 10
 * 4
 * 1
 * 2
 * 3
 * 4
 * 10
 * 20
 * 30
 * 40
 * 100
 * 200
 * Sample Output #01
 * 3
 *
 * Sample Input #02
 * 6
 * 3
 * 10
 * 20
 * 30
 * 100
 * 101
 * 102
 * Sample Output #02
 * 2
 */
public class MaxMin {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int K = Integer.parseInt(in.readLine());
        int[] list = new int[N];

        for(int i = 0; i < N; i ++)
            list[i] = Integer.parseInt(in.readLine());

        int unfairness = Integer.MAX_VALUE;

        Arrays.sort(list);

        for(int i=0;i<=N-K;i++) {
            if(list[i+K-1] - list[i] < unfairness)
                unfairness = list[i+K-1] - list[i];
        }

        System.out.println(unfairness);
    }
}
