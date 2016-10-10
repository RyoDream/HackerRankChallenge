package CrackingTheCodeInterview;

import java.util.Scanner;

/**
 * Bit Manipulation: Lonely Integer
 *
 * Consider an array of n integers, A=[a0,a1,..,an-1],
 * where all but one of the integers occur in pairs.
 *
 * In other words, every element in A occurs exactly twice except for one unique element.
 * Given A, find and print the unique element.
 */
public class BitManipulation_LonelyInteger {
    public static int lonelyInteger(int[] a) {
        int res = 0;
        for(int i:a)
            res ^= i;

        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
