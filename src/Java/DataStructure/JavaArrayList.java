package Java.DataStructure;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Java Arraylist
 *
 * Sometimes it's better to use dynamic size arrays.
 * Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.
 * You are given n lines. In each line there are zero or more integers.
 * You need to answer a few queries where you need to tell the number located in yth position of xth line.
 *
 * Take your input from System.in.
 *
 * Input Format
 * The first line has an integer n.
 * In each of the next n lines there will be an integer d denoting number of integers on that line
 * and then there will be d space-separated integers.
 * In the next line there will be an integer q denoting number of queries.
 * Each query will consist of two integers x and y.
 *
 * Constraints
 * 1 <= n <= 20000
 * 0 <= d <= 50000
 * 1 <= q <= 1000
 * 1 <= x <= n
 *
 * Each number will fit in signed integer.
 * Total number of integers in  lines will not cross 100000.
 *
 * Output Format
 * In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"
 *
 * Sample Input
 * 5
 * 5 41 77 74 22 44
 * 1 12
 * 4 37 34 36 52
 * 0
 * 3 20 22 33
 * 5
 * 1 3
 * 3 4
 * 3 1
 * 4 3
 * 5 5
 *
 * Sample Output
 * 74
 * 52
 * 37
 * ERROR!
 * ERROR!
 */
public class JavaArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        while(n-- > 0) {
            ArrayList<Integer> temp = new ArrayList<>();

            int d = sc.nextInt();
            while(d-- > 0) {
                temp.add(sc.nextInt());
            }

            lists.add(temp);
        }

        int q = sc.nextInt();
        while(q-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x > lists.size()) {
                System.out.println("ERROR!");
                continue;
            }

            ArrayList<Integer> temp = lists.get(x-1);
            if(y > temp.size()) {
                System.out.println("ERROR!");
                continue;
            }

            System.out.println(temp.get(y-1));
        }

        sc.close();
    }
}
