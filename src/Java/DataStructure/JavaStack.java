package Java.DataStructure;

import java.util.Scanner;
import java.util.Stack;

/**
 * Java Stack
 *
 * A string containing only parentheses is balanced if the following is true:
 * 1. if it is an empty string
 * 2. if A and B are correct, AB is correct,
 * 3. if A is correct, (A) and {A} and [A] are also correct.
 *
 * Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
 * Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
 *
 * Given a string, determine if it is balanced or not.
 *
 * Input Format
 * There will be multiple lines in the input file, each having a single non-empty string.
 * You should read input till end-of-file.
 * The part of the code that handles input operation is already provided in the editor.
 *
 * Output Format
 *
 * For each case, print 'true' if the string is balanced, 'false' otherwise.
 *
 * Sample Input
 * {}()
 * ({()})
 * {}(
 * []
 *
 * Sample Output
 * true
 * true
 * false
 * true
 */
public class JavaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String input = sc.next();
            if(parenthesesBalanced(input))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }

    public static boolean parenthesesBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }

            if(c == ')' || c == ']' || c == '}') {
                if(stack.isEmpty())
                    return false;
                else {
                    char t = stack.pop();
                    if((t == '(' && c == ')') ||
                            (t == '[' && c == ']') ||
                            (t == '{' && c == '}'))
                        continue;
                    else
                        return false;
                }

            }

        }

        return stack.isEmpty();
    }
}
