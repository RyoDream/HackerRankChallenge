package CrackingTheCodeInterview;

import java.util.Scanner;
import java.util.Stack;

/**
 * Stacks: Balanced Brackets
 *
 * Given n strings of brackets, determine whether each sequence of brackets is balanced.
 * If a string is balanced, print YES on a new line; otherwise, print NO on a new line.
 */
public class Stacks_BalancedBrackets {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for(char c : expression.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            if(c == ')' || c == ']' || c == '}') {
                if(stack.isEmpty())
                    return false;

                char temp = stack.pop();
                if(temp == '(' && c == ')' ||
                        temp == '[' && c == ']' ||
                        temp == '{' && c == '}')
                    continue;
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
