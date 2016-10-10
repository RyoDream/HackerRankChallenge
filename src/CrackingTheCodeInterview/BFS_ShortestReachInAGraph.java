package CrackingTheCodeInterview;

import java.util.*;

/**
 * BFS: Shortest Reach in a Graph
 *
 * Consider an undirected graph consisting of n nodes
 * where each node is labeled from 1 to n and the edge between any two nodes is always of length 6.
 * We define node s to be the starting position for a BFS.
 */
public class BFS_ShortestReachInAGraph {
    public static class Graph {
        private final int vertex;
        private List<Integer>[] adj;

        public Graph(int size) {
            vertex = size;
            adj = (ArrayList<Integer>[]) new ArrayList[size];
            for(int i=0;i<size;i++)
                adj[i] = new ArrayList<>();
        }

        public void addEdge(int first, int second) {
            adj[first].add(second);
            adj[second].add(first);
        }

        public int[] shortestReach(int startId) { // 0 indexed
            int[] dist = new int[vertex];
            Arrays.fill(dist, -1);

            bfs(adj, startId, dist);
            return dist;
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int queries = scanner.nextInt();

        for (int t = 0; t < queries; t++) {

            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();

            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;

                // add each edge to the graph
                graph.addEdge(u, v);
            }

            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);

            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
