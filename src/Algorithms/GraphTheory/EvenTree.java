package Algorithms.GraphTheory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Even Tree
 *
 * You are given a tree (a simple connected graph with no cycles).
 * The tree has N nodes numbered from 1 to N and is rooted at node 1.
 *
 * Find the maximum number of edges you can remove from the tree to get a forest
 * such that each connected component of the forest contains an even number of vertices.
 *
 * Input Format
 * The first line of input contains two integers N and M.
 * N is the number of vertices, and M is the number of edges.
 * The next M lines contain two integers ui and vi which specifies an edge of the tree.
 *
 * Constraints
 * 2 <= N <= 100
 */

// 计算每个子树的总结点数，如果是偶数，则连接该子树的边可以去掉
public class EvenTree {
    private static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer>[] adj = (ArrayList<Integer>[]) new ArrayList[n];
        for(int i=0;i<n;i++)
            adj[i] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            adj[u].add(v);
            adj[v].add(u);
        }

        boolean[] isVisited = new boolean[n];
        dfs_count(adj, 0, isVisited);
        System.out.println(count);
    }

    private static int dfs_count(List<Integer>[] adj, int s, boolean[] isVisited) {
        int sub_count = 0;
        isVisited[s] = true;

        for(int neighbor : adj[s]) {
            if(!isVisited[neighbor]) {
                int c = dfs_count(adj, neighbor, isVisited);
                if (c % 2 == 0)
                    count++;
                sub_count += c;
            }
        }

        return sub_count+1;
    }
}
