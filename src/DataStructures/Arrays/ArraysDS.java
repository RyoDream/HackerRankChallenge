package DataStructures.Arrays;

/**
 * Arrays - DS
 *
 * An array is a type of data structure that stores elements of the same type in a contiguous block of memory.
 * In an array, , of size , each memory location has some unique index,  (where ),
 * that can be referenced as  (you may also see it written as ).
 *
 * Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.
 * Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.
 *
 * Input Format
 * The first line contains an integer,  (the number of integers in ).
 * The second line contains  space-separated integers describing .
 *
 * Constraints
 * 1 <= N <= 10^3
 * 1 <= Ai <= 10^4, where Ai is the i th integer in A
 *
 * Output Format
 * Print all  integers in  in reverse order as a single line of space-separated integers.
 *
 * Sample Input
 * 4
 * 1 4 3 2
 *
 * Sample Output
 * 2 3 4 1
 */

import java.util.*;

public class ArraysDS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        for(int i=n-1;i>=0;i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
