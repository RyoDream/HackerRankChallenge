package DataStructures.Stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Simple Text Editor
 *
 * In this challenge, you must implement a simple text editor.
 * Initially, your editor contains an empty string, S.
 * You must perform Q operations of the following  types:
 *      1. append(W) - Append string W to the end of S.
 *      2. delete(k) - Delete the last k characters of S.
 *      3. print(k) - Print the k character of S.
 *      4. undo() - Undo the last (not previously undone) operation of type 1 or 2,
 *                  reverting S to the state it was in prior to that operation.
 *
 * Input Format
 * The first line contains an integer, Q, denoting the number of operations.
 *
 * Each line i of the Q subsequent lines (where 0<=i<=Q) defines an operation to be performed.
 * Each operation starts with a single integer, t (where t∈{1,2,3,4}),
 * denoting a type of operation as defined in the Problem Statement above.
 * If the operation requires an argument, t is followed by its space-separated argument.
 * For example, if t=1 and W="abcd", line i will be 1 abcd.
 *
 * Constraints
 * 1 <= Q <= 10^5
 * 1 <= k <= |S|
 * The sum of the lengths of all  in the input .
 * All input characters are lowercase English letters.
 * It is guaranteed that the sequence of operations given as input is possible to perform.
 *
 * Output Format
 * Each operation of type 3 must print the kth character on a new line.
 *
 * Sample Input
 * 8
 * 1 abc
 * 3 3
 * 2 3
 * 1 xy
 * 3 2
 * 4
 * 4
 * 3 1
 *
 * Sample Output
 * c
 * y
 * a
 */
public class SimpleTextEditor {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        StringBuilder sb = new StringBuilder("");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();

        while (n-- > 0) {
            String[] arg = sc.nextLine().split(" ");
            int oper = Integer.parseInt(arg[0]);

            if (oper == 1) {
                sb.append(arg[1]);
                stack.push(sb.toString());
            }
            else if (oper == 2) {
                sb.delete(sb.length() - Integer.parseInt(arg[1]), sb.length());
                stack.push(sb.toString());
            }
            else if (oper == 3) {
                System.out.println(sb.charAt(Integer.parseInt(arg[1]) - 1));
            }
            else if (oper == 4) {
                stack.pop();
                sb = (stack.isEmpty())?new StringBuilder(""):new StringBuilder(stack.peek());
            }
        }
        sc.close();
    }
}
