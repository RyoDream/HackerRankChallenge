package Algorithms.GraphTheory;

import java.util.*;

/**
 * Prim's (MST) : Special Subtree
 *
 * Given a graph which consists of several edges connecting the N nodes in it.
 * It is required to find a subgraph of the given graph with the following properties:
 *
 * The subgraph contains all the nodes present in the original graph.
 * The subgraph is of minimum overall weight (sum of all edges) among all such subgraphs.
 * It is also required that there is exactly one, exclusive path between any two nodes of the subgraph.
 *
 * One specific node  is fixed as the starting point of finding the subgraph.
 * Find the total weight of such a subgraph (sum of all edges in the subgraph)
 *
 * If there are edges between the same pair of nodes with different weights,
 * they are to be considered as is, like multiple edges.
 *
 * Constraints
 * 2 <= N <= 3000
 * 1 <= M <= N*(N-1)/2
 * 1 <= x,y,S <= N
 * 0 <= r <= 10^5
 */
public class MST_Prim_SpecialSubtree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] adj = new int[n][];

        for(int i=0;i<n;i++) {
            adj[i] = new int[n];
            Arrays.fill(adj[i], -1);
        }

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            int w = scanner.nextInt();
            adj[u][v] = (adj[u][v] == -1)? w: Math.min(adj[u][v], w);
            adj[v][u] = adj[u][v];
        }
        int s = scanner.nextInt() - 1;
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        prim(adj, s, dist);

        int res = 0;
        for(int d : dist)
            res += d;

        System.out.println(res);
    }

    private static void prim(int[][] adj, int s, int[] dist) {
        boolean[] isVisited = new boolean[adj.length];
        dist[s] = 0;

        for(int j=0;j<adj.length;j++) {
            int cur = minVertex(dist, isVisited);
            isVisited[cur] = true;

            for(int i=0;i<adj.length;i++) {
                if(i!=cur && !isVisited[i] && adj[cur][i] != -1) {
                    if(dist[i] > adj[cur][i])
                        dist[i] = adj[cur][i];
                }
            }
        }
    }

    private static int minVertex(int[] dist, boolean[] isVisited) {
        int v = -1;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<dist.length;i++) {
            if(!isVisited[i] && dist[i] < min) {
                min = dist[i];
                v = i;
            }
        }

        return v;
    }
}
