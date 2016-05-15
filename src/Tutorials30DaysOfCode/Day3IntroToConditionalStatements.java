package Tutorials30DaysOfCode;

import java.util.Scanner;

/**
 * Day 3: Intro to Conditional Statements
 *
 * Objective
 * In this challenge, we're getting started with conditional statements.
 * Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Task
 * Given an integer, n, perform the following conditional actions:
 *
 * If  is odd, print weird
 * If  is even and in the inclusive range of 2 to 5, print Not Weird
 * If  is even and in the inclusive range of 6 to 20, print Weird
 * If  is even and greater than 20, print Weird
 * Complete the stub code provided in your editor to print whether or not n is weird.
 *
 * Input Format
 * A single line containing a positive integer, n.
 *
 * Constraints
 * 1 <= n <= 100
 *
 *
 * Output Format
 * Print  if the number is weird; otherwise, print Not Weird.
 *
 * Sample Input 0
 * 3
 *
 * Sample Output 0
 * Weird
 *
 * Sample Input 1
 * 24
 *
 * Sample Output 1
 * Not Weird
 *
 * Explanation
 * Sample Case 0: n = 3
 * n is odd and odd numbers are weird, so we print .
 *
 * Sample Case 1: n = 24
 * n > 20 and n is even, so it isn't weird. Thus, we print .
 */
public class Day3IntroToConditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        }
        else{
            if(n>=2 && n<=5)
                ans = "Not Weird";
            if(n>=6 && n<=20)
                ans = "Weird";
            if(n>20)
                ans = "Not Weird";

            // Complete the code
        }
        System.out.println(ans);
    }
}
