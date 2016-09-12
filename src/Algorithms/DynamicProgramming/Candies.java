package Algorithms.DynamicProgramming;

import java.util.Scanner;

/**
 * Candies
 *
 * Alice is a kindergarden teacher. She wants to give some candies to the children in her class.
 * All the children sit in a line ( their positions are fixed),
 * and each of them has a rating score according to his or her performance in the class.
 *
 * Alice wants to give at least 1 candy to each child.
 * If two children sit next to each other, then the one with the higher rating must get more candies.
 * Alice wants to save money, so she needs to minimize the total number of candies given to the children.
 *
 * Input Format
 * The first line of the input is an integer N, the number of children in Alice's class.
 * Each of the following N lines contains an integer that indicates the rating of each child.
 *
 * Constraints
 * 1<=N<=10^5
 * 1<=rating[i]<=10^5
 *
 * Output Format
 * Output a single line containing the minimum number of candies Alice must buy.
 *
 * Sample Input
 * 3
 * 1
 * 2
 * 2
 *
 * Sample Output
 * 4
 */
public class Candies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] rating = new int[n];
        int[] candies = new int[n];

        for(int i=0;i<n;i++) {
            rating[i] = scanner.nextInt();
            candies[i] = 1;
        }

        for(int i=1;i<n;i++)
            if(rating[i] > rating[i-1])
                candies[i] = candies[i-1]+1;

        for(int i=n-1;i>0;i--)
            if(rating[i] < rating[i-1] && candies[i-1] < candies[i]+1)
                candies[i-1] = candies[i]+1;

        long sum = 0;
        for(int i:candies)
            sum += i;

        System.out.print(sum);
    }
}
