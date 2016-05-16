package DataStructures.Stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Balanced Parentheses
 *
 * Given a sequence consisting of parentheses, determine whether the expression is balanced.
 * A sequence of parentheses is balanced if every open parentheses can be paired uniquely
 * with a closed parentheses that occurs after the former.
 *
 * Also, the interval between them must be balanced.
 * You will be given three types of parentheses: (, {, and [.
 *
 * {[()]} - This is a balanced parentheses.
 * {[(])} - This is not a balanced parentheses.
 *
 * Input Format
 * The first line of input contains the number of test cases, T.
 * Each test case consists of a single line, S, the sequence of parentheses.
 *
 * Constraints
 * 1 <= T <= 1000
 * 1 <= len <= 1000 , where len is the length of the sequence.
 * Each character of the sequence will be one of {, }, (, ), [, ].
 *
 * Output Format
 *
 * For each test case, print on a new line "YES" if the parentheses are balanced.
 * Otherwise, print "NO". Do not print the quotes.
 *
 * Sample Input
 * 3
 * {[()]}
 * {[(])}
 * {{[[(())]]}}
 *
 * Sample Output
 * YES
 * NO
 * YES
 */
public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        while(T-- > 0) {
            String s = scan.next();
            if(isBalance(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        scan.close();
    }

    private static boolean isBalance(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c == '{' || c == '[' || c == '(')
                stack.push(c);

            if(c == '}' || c == ']' || c == ')') {
                if(stack.isEmpty() || !isMatch(stack.pop(),c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

    private static boolean isMatch(char one, char two) {
        if(one == '{' && two == '}')
            return true;
        if(one == '[' && two == ']')
            return true;
        if(one == '(' && two == ')')
            return true;

        return false;
    }
}
