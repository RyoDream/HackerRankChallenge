package Algorithms.Greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Grid Challenge
 *
 * Given a squared sized grid G of size N in which each cell has a lowercase letter.
 * Denote the character in the ith row and in the jth column as G[i][j].
 *
 * You can perform one operation as many times as you like:
 * Swap two column adjacent characters in the same row G[i][j] and  G[i][j+1]for all valid i,j.
 *
 * Is it possible to rearrange the grid such that the following condition is true?
 * G[i]1j] <= G[i][2] <= .. <= G[i][N] for 1<=i<=N and
 * G[1][j] <= G[2][j] <= .. <= G[N][j] for 1<=j<=N
 *
 * In other words, is it possible to rearrange the grid
 * such that every row and every column is lexicographically sorted?
 *
 * Note: c1 <= c2, if letter c1 is equal to c2 or is before c2 in the alphabet.
 *
 * Input Format
 * The first line begins with T, the number of testcases.
 * In each testcase you will be given N.
 * The following N lines contain N lowercase english alphabet each, describing the grid.
 *
 * Output Format
 *
 * Print T lines. On the ith line print YES
 * if it is possible to rearrange the grid in the ith testcase
 * or NO otherwise.
 *
 *
 * Constraints
 * 1 <= T <= 100
 * 1 <= N <= 100
 * G[i][j] will be a lower case letter
 *
 * Sample Input
 * 1
 * 5
 * ebacd
 * fghij
 * olmkn
 * trpqs
 * xywuv
 *
 * Sample Output
 * YES
 */
public class GridChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0) {
            if(checkGrid(sc))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }

    private static boolean checkGrid(Scanner sc) {
        int N = sc.nextInt();
        char[][] grid = new char[N][];

        for(int i=0;i<N;i++) {
            grid[i] = sc.next().toCharArray();
            Arrays.sort(grid[i]);
        }

        for(int i=1;i<N;i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] < grid[i - 1][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
