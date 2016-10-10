package CrackingTheCodeInterview;

import java.util.Scanner;

/**
 * DFS: Connected Cell in a Grid
 * Given an m*n matrix, find and print the number of cells in the largest region in the matrix.
 * Note that there may be more than one region in the matrix.
 */
public class DFS_ConnectedCellInAGrid {
    public static int getBiggestRegion(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[][] isVisited = new boolean[m][n];
        int max = Integer.MIN_VALUE;

        for(int i=0;i<m;i++) {
            int res = 0;
            for(int j=0;j<n;j++) {
                if(!isVisited[i][j]) {
                    res = dfs(matrix, isVisited, i, j);
                    max = Math.max(max, res);
                }
            }

        }

        return max;
    }

    private static int dfs(int[][] matrix, boolean[][] isVisited, int i, int j) {
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length || isVisited[i][j] || matrix[i][j] == 0)
            return 0;

        isVisited[i][j] = true;
        int res = 1;

        res += dfs(matrix, isVisited, i-1, j-1);
        res += dfs(matrix, isVisited, i-1, j);
        res += dfs(matrix, isVisited, i-1, j+1);
        res += dfs(matrix, isVisited, i, j-1);
        res += dfs(matrix, isVisited, i, j+1);
        res += dfs(matrix, isVisited, i+1, j-1);
        res += dfs(matrix, isVisited, i+1, j);
        res += dfs(matrix, isVisited, i+1, j+1);

        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
}
