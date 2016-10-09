package Algorithms.GraphTheory;

import java.util.*;

/**
 * Breadth First Search: Shortest Reach
 *
 * Consider an undirected graph consisting of n nodes
 * where each node is labeled from 1 to n and the edge between any two nodes is always of length 6.
 * We define node s to be the starting position for a BFS.
 *
 * Given q queries in the form of a graph and some starting node, s,
 * perform each query by calculating the shortest distance
 * from starting node s to all the other nodes in the graph.
 *
 * Then print a single line of n-1 space-separated integers
 * listing node s's shortest distance to each of the n-1 other nodes
 * (ordered sequentially by node number); if s is disconnected from a node, print -1 as the distance to that node.
 *
 * Input Format
 * The first line contains an integer, q, denoting the number of queries.
 * The subsequent lines describe each query in the following format:
 * 1. The first line contains two space-separated integers
 *    describing the respective values of n (the number of nodes) and m (the number of edges) in the graph.
 *
 * 2. Each line i of the m subsequent lines contains two space-separated integers, u and v,
 *    describing an edge connecting node u to node v.
 *
 * 3. The last line contains a single integer, s, denoting the index of the starting node.
 *
 * Constraints
 * 1 <= q <= 10
 * 2 <= n <= 1000
 * 1 <= m <= n*(n-1)/2
 * 1<=u,v,s<=n
 *
 * */
public class BFS_ShortestReach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        while(q-- > 0) {
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
            int s = scanner.nextInt() - 1;
            int[] dist = new int[n];
            Arrays.fill(dist, -1);

            bfs(adj, s, dist);

            for(int i=0;i<n;i++) {
                if(i != s) {
                    System.out.print(dist[i]+" ");
                }
            }
            System.out.println();
        }
    }

    private static void bfs(List<Integer>[] adj, int s, int[] dist) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(s);
        dist[s] = 0;

        while(!queue.isEmpty()) {
            int cur = queue.poll();
            for (int neighbor : adj[cur]) {
                if (dist[neighbor] == -1) {
                    queue.offer(neighbor);
                    dist[neighbor] = dist[cur]+6;
                }
            }
        }
    }
}
