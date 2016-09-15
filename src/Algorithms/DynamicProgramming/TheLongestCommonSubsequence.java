package Algorithms.DynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A subsequence is a sequence that can be derived from another sequence
 * by deleting some elements without changing the order of the remaining elements.
 *
 * Longest common subsequence (LCS) of 2 sequences is a subsequence,
 * with maximal length, which is common to both the sequences.
 *
 * Given two sequence of integers, A and B, find any one longest common subsequence.
 *
 * In case multiple solutions exist, print any of them.
 * It is guaranteed that at least one non-empty common subsequence will exist.
 *
 */
public class TheLongestCommonSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];

        for(int i=0;i<n;i++)
            a[i] = scanner.nextInt();
        for(int i=0;i<m;i++)
            b[i] = scanner.nextInt();

        int[][] lcs = lcs(a,b);
        printLCS(lcs,a,b);

    }

    public static int[][] lcs(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[][] lcs = new int[n+1][m+1];

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {
                if (a[i-1] == b[j-1])
                    lcs[i][j] = 1 + lcs[i - 1][j - 1];
                else
                    lcs[i][j] = Math.max(lcs[i][j-1], lcs[i-1][j]);
            }
        }
        return lcs;
    }

    public static void printLCS(int[][] lcs, int[]a, int[] b) {
        int n = lcs.length-1;
        int m = lcs[0].length-1;
        int i=n,j=m;
        ArrayList<Integer> res = new ArrayList<>();

        while(i>0 && j>0) {
            if(a[i-1] == b[j-1]) {
                res.add(res.size(), a[i-1]);
                i = i-1;
                j = j-1;
            }
            else {
                if(lcs[i-1][j] == lcs[i][j])
                    i = i-1;
                else
                    j = j-1;

            }
        }

        for(Integer t : res) {
            System.out.print(t+" ");
        }
        System.out.println();

    }

}
