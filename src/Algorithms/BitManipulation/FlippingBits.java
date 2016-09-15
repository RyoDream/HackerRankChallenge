package Algorithms.BitManipulation;

import java.util.Scanner;

/**
 * Flipping bits
 *
 * You will be given a list of 32 bits unsigned integers.
 * You are required to output the list of the unsigned integers
 * you get by flipping bits in its binary representation
 * (i.e. unset bits must be set, and set bits must be unset).
 *
 * Input Format
 * The first line of the input contains the list size T,
 * which is followed by T lines, each line having an integer from the list.
 *
 * Constraints
 * 1<=T<=100
 * 0<=integer<=2^32
 * Output Format
 * Output one line per element from the list with the requested result.
 */
public class FlippingBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++) {
            long unsigned = in.nextLong();
            unsigned ^= 4294967295L;
            System.out.println(unsigned);
        }
    }
}
