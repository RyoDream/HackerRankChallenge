package DataStructures.Arrays;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Sparse Arrays
 *
 * There are  strings. Each string's length is no more than  characters. There are also queries. For each query, you are given a string, and you need to find out how many times this string occurred previously.
 * Input Format
 * The first line contains , the number of strings.
 * The next  lines each contain a string.
 * The nd line contains , the number of queries.
 * The following  lines each contain a query string.
 *
 * Constraints
 * 1 <= N <= 1000
 * 1 <= Q <= 1000
 * 1 <= length of any string <= 20
 *
 * Sample Input
 * 4
 * aba
 * baba
 * aba
 * xzxb
 *
 * 3
 * aba
 * xzxb
 * ab
 *
 * Sample Output
 * 2
 * 1
 * 0
 */
public class SparseArrays {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        while(N-- > 0) {
            String s = sc.next();
            if(!map.containsKey(s))
                map.put(s, 1);
            else {
                int count = map.get(s);
                map.put(s, count+1);
            }
        }

        int Q = sc.nextInt();
        sc.nextLine();

        while(Q-- > 0) {
            String q = sc.next();
            if(map.containsKey(q))
                System.out.println(map.get(q));
            else
                System.out.println(0);
        }
    }
}
