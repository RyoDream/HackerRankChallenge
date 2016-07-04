package Algorithms.Greedy;

import java.util.*;

/**
 * Beautiful Pairs
 *
 * You are given two arrays, A and B, both containing N integers.
 *
 * A pair of indices (i,j) is beautiful if the ith element of array A is equal to the jth element of array B.
 * In other words, pair (i,j) is beautiful if and only if Ai=Bj.
 *
 * Given A and B, there are k pairs of beautiful indices (i0,j0),..,(ik-1,jk-1).
 *
 * A pair of indices in this set is pairwise disjoint if and only if
 * for each 0<=x<=y<=k-1 it holds that ix!=iy and jx!=jy.
 *
 * Change exactly 1 element in B so that the resulting number of pairwise disjoint beautiful pairs is maximal,
 * and print this maximal number to stdout.
 *
 * Input Format
 * The first line contains a single integer, N (the number of elements in A and B).
 * The second line contains N space-separated integers describing array A.
 * The third line contains N space-separated integers describing array B.
 *
 * Constraints
 * 1 <= N <= 10^3
 * 1 <= Ai <= 10^3
 * 1 <= Bi <= 10^3
 *
 * Output Format
 * Determine and print the maximum possible number of pairwise disjoint beautiful pairs.
 *
 * Note: You must first change 1 element in B, and your choice of element must be optimal.
 *
 * Sample Input
 * 3
 * 1 2 2
 * 1 2 3
 *
 * Sample Output
 * 3
 */
public class BeautifulPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<Integer, Integer> mapA = new HashMap<>();
        Set<Integer> setB = new HashSet<>();
        int res = 0;

        for(int i=0;i<N;i++) {
            int a = scanner.nextInt();
            if(mapA.containsKey(a))
                mapA.put(a, mapA.get(a)+1);
            else
                mapA.put(a, 1);
        }

        for(int i=0;i<N;i++) {
            int b = scanner.nextInt();
            if(mapA.containsKey(b) && mapA.get(b)>0) {
                int count = mapA.get(b);
                if(count == 1)
                    mapA.remove(b);
                else
                    mapA.put(b, count-1);

                res++;
            }
            else {
                if(mapA.containsKey(b))
                    mapA.remove(b);
                setB.add(b);
            }
        }

        if(setB.size() == 0)
            System.out.println(res-1);
        else if(mapA.size() == 0)
            System.out.println(res);
        else
            System.out.print(res+1);

    }
}
