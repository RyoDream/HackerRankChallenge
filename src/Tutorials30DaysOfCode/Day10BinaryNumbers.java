package Tutorials30DaysOfCode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Day 10: Binary Numbers
 *
 * Objective
 * Today, we're working with binary numbers.
 * Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Task
 * Given a base-10 integer, n, convert it to binary (base-2).
 * Then find and print the base-2 integer denoting the maximum number of consecutive 1's in n's binary representation.
 *
 * Input Format
 * A single integer, n.
 *
 * Constraints
 * 1 <= 10 <= 10^6
 *
 * Output Format
 * Print a single base-2 integer denoting the maximum number of consecutive 1's in the binary representation of n.
 *
 * Sample Input 1
 * 5
 * Sample Output 1
 * 1
 * Sample Input 2
 * 13
 * Sample Output 2
 * 2
 */
public class Day10BinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String binary = Integer.toBinaryString(n);
        // String binary = toBinary(n);

        int max = 0;


        String[] arrays = binary.split("0");
        for(String s:arrays) {
            if(s.length() > max)
                max = s.length();
        }

        System.out.println(max);
    }

    public static String toBinary(int n){
        StringBuilder temp = new StringBuilder();
        while(n/2 >=1 || n%2 == 1){//除2取余， (|| n%2 == 1) 在次为了补上最后一个0或者1
            temp.append(n%2);
            n = n/2;
        }
        return temp.reverse().toString();
    }
}

