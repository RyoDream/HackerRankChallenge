package Algorithms.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Two arrays
 *
 * You are given two integer arrays, A and B, each containing N integers.
 * The size of the array is less than or equal to 1000.
 * You are free to permute the order of the elements in the arrays.
 *
 * Now here's the real question:
 * Is there an permutation A', B' possible of A and B,
 * such that, A'i+B'i ≥ K for all i,
 * where A'i denotes the ith element in the array A' and B'i denotes ith element in the array B'.
 *
 * Input Format
 * The first line contains an integer, T, the number of test-cases.
 * T test cases follow. Each test case has the following format:
 *
 * The first line contains two integers, N and K.
 * The second line contains N space separated integers, denoting array A.
 * The third line describes array B in a same format.
 *
 * Output Format
 *
 * For each test case, if such an arrangement exists, output "YES", otherwise "NO" (without quotes).
 * Constraints
 * 1 <= T <= 10
 * 1 <= N <= 1000
 * 1 <= K <= 109
 * 0 <= Ai, Bi ≤ 109
 *
 * Sample Input
 * 2
 * 3 10
 * 2 1 3
 * 7 8 9
 * 4 5
 * 1 2 2 1
 * 3 3 3 4
 *
 * Sample Output
 * YES
 * NO
 */
public class TwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] a = new int[N];
            int[] b = new int[N];

            for(int i=0;i<2*N;i++) {
                if(i < N)
                    a[i] = sc.nextInt();
                else
                    b[i-N] = sc.nextInt();
            }

            if(checkAns(a, b, K))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }

    private static boolean checkAns(int[] a, int[] b, int K) {
        int N = a.length;
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<N;i++) {
            if(a[i] + b[N-i-1] < K)
                return false;
        }
        return true;
    }
}
