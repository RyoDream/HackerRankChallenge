package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Dynamic Array
 *
 * Create a list, seqList, of N empty sequences,
 * where each sequence is indexed from 0 to N-1.
 *
 * The elements within each of the N sequences also use 0-indexing.
 *
 * Create an integer, lastAns, and initialize it to 0.
 *
 * The 2 types of queries that can be performed on your list of sequences (seqList) are described below:
 *  1. Query: 1 x y
 *      Find the sequence, seq, at index ((x^lastAns)%N) in seqList.
 *      Append integer y to sequence seq.
 *  2. Query:
 *      Find the sequence, seq, at index ((x^last)%N) in seqList.
 *      Find the value of element y % size in seq (where size is the size of seq) and assign it to lastAns.
 *      Print the new value of lastAns on a new line
 *
 * Task
 * Given N, Q, and Q queries, execute each query.
 *
 * Note: ^ is the bitwise XOR operation, which corresponds to the ^ operator in most languages.
 * Learn more about it on Wikipedia.
 *
 * Input Format
 * The first line contains two space-separated integers,
 * N (the number of sequences) and Q (the number of queries), respectively.
 * Each of the Q subsequent lines contains a query in the format defined above.
 *
 * Constraints
 * 1 <= N, Q <= 10^5
 * 0 <= x <= 10^9
 * 0 <= y <= 10^9
 * It is guaranteed that query type 2 will never query an empty sequence or index.
 *
 * Output Format
 * For each type 2 query, print the updated value of lastAns on a new line.
 *
 * Sample Input
 * 2 5
 * 1 0 5
 * 1 1 7
 * 1 0 3
 * 2 1 0
 * 2 1 1
 *
 * Sample Output
 * 7
 * 3
 */
public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        ArrayList<Integer>[] seqList = new ArrayList[N];
        for(int i=0;i<N;i++)
            seqList[i] = new ArrayList<Integer>();

        int lastAns = 0;

        while(Q-- > 0) {
            int operator = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(operator == 1) {
                int index = (x^lastAns) % N;
                seqList[index].add(y);
            }
            else {
                int indexSeq = (x^lastAns) % N;
                int index = y % seqList[indexSeq].size();
                lastAns = seqList[indexSeq].get(index);
                System.out.println(lastAns);
            }
        }
    }
}
