package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Sherlock and The Beast
 *
 * Sherlock Holmes suspects his archenemy, Professor Moriarty,
 * is once again plotting something diabolical.
 * Sherlock's companion, Dr. Watson,
 * suggests Moriarty may be responsible for MI6's recent issues with their supercomputer, The Beast.
 *
 * Shortly after resolving to investigate,
 * Sherlock receives a note from Moriarty boasting about infecting The Beast with a virus;
 * however, he also gives him a clue—a number, N.
 * Sherlock determines the key to removing the virus is to find the largest Decent Number having digits.
 *
 * A Decent Number has the following properties:
 * Its digits can only be 3's and/or 5's.
 * The number of 3's it contains is divisible by 5.
 * The number of 5's it contains is divisible by 3.
 * If there are more than one such number, we pick the largest one.
 * Moriarty's virus shows a clock counting down to The Beast's destruction, and time is running out fast.
 * Your task is to help Sherlock find the key before The Beast is destroyed!
 *
 * Constraints
 * Input Format
 * The first line is an integer, T, denoting the number of test cases.
 * The  subsequent lines each contain an integer, N, detailing the number of digits in the number.
 *
 * Output Format
 * Print the largest Decent Number having N digits; if no such number exists, tell Sherlock by printing -1.
 *
 * Sample Input
 * 4
 * 1
 * 3
 * 5
 * 11
 *
 * Sample Output
 * -1
 * 555
 * 33333
 * 55555533333
 */
public class SherlockAndTheBeast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] res = getRes(n);

            if(res[0] == -1) {
                System.out.println("-1");
                continue;
            }

            StringBuilder sb = new StringBuilder("");

            while(res[0]-- > 0)
                sb.append("555");

            while(res[1]-- > 0)
                sb.append("33333");

            System.out.println(sb.toString());
        }
    }

    private static int[] getRes(int n) {
        int[] res = new int[2];

        int x = 0; // 3
        int y = 0; // 5

        if(n < 3)
            return new int[] {-1,-1};

        while(x*3 < n)
            x++;

        if(x*3 == n) {
            return new int[] {x,y};
        }

        int reminder = 0;

        x--;
        while(x>=0 && (reminder=n-x*3) % 5 != 0) {
            x--;
        }

        if((x < 0) || (x==0 && n%5!=0))
            return new int[] {-1,-1};


        y = reminder/5;

        return new int[] {x,y};
    }
}
