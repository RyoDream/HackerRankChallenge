package DataStructures.Stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Maximum Element
 *
 * You have an empty sequence, and you will be given  queries.
 * Each query is one of these three types:
 *
 * 1 x  -Push the element x into the stack.
 * 2    -Delete the element present at the top of the stack.
 * 3    -Print the maximum element in the stack.
 *
 * Input Format
 * The first line of input contains an integer, n.
 * The next  lines each contain an above mentioned query.
 * (It is guaranteed that each query is valid.)
 *
 * Constraints
 * 1 <= N <= 10^5
 * 1 <= x <= 10^9
 * 1 <= type <= 3
 *
 * Output Format
 * For each type  query, print the maximum element in the stack on a new line.
 *
 * Sample Input
 * 10
 * 1 97
 * 2
 * 1 20
 * 2
 * 1 26
 * 1 20
 * 2
 * 3
 * 1 91
 * 3
 *
 * Sample Output
 * 26
 * 91
 */
public class MaximumElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> max = new Stack<>();

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        while(N-- > 0) {
            int operation = scan.nextInt();

            switch(operation) {
                case 1:
                    int x = scan.nextInt();
                    stack.push(x);

                    if(max.isEmpty() || (x >= max.peek()))
                        max.push(x);
                    break;
                case 2:
                    int top = stack.pop();
                    if(top == max.peek())
                        max.pop();
                    break;
                case 3:
                    System.out.println(max.peek());
                    break;
                default:
                    break;
            }
        }

        scan.close();
    }
}
