package Java.DataStructure;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Java Hashset
 *
 * You are given n pairs of strings.
 * Two pairs (a,b) and (c,d) are identical if a=c and b=d.
 * That also implies (a,b) is not same as (b,a).
 * After taking each pair as input, you need to print number of unique pairs you currently have.
 *
 * Note: Brute force solution will not earn full points.
 * Hints: Solve Java Comparator problem first!
 *
 * Input Format
 * In the first line, there will be an integer T denoting number of pairs.
 * Each of the next T lines will contain two strings seperated by a single space.
 *
 * Constraints:
 * 1 <= T <= 100000
 * Length of each string is at most 5 and will consist lower case letters only.
 *
 * The testcases were generated randomly.
 *
 * Output Format
 * Print  lines. In the  line, print number of unique pairs you have after taking  pair as input.
 *
 * Sample Input
 * 5
 * john tom
 * john mary
 * john tom
 * mary anna
 * mary anna
 *
 * Sample Output
 * 1
 * 2
 * 2
 * 3
 * 3
 */
public class JavaHashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T-- > 0) {
            String newLine = sc.nextLine();
            set.add(newLine);
            System.out.println(set.size());
        }

        sc.close();
    }
}
