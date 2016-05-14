package Java.Strings;

import java.util.Scanner;

/**
 * Java String Reverse
 *
 * A palindrome is a word, phrase, number,
 * or other sequence of characters which reads the same backward or forward.(Wikipedia)
 *
 * Given a string , print "Yes" if it is a palindrome, print "No" otherwise.
 * The strings will consist lower case english letters only. The strings will have at most 50 characters.
 *
 * Some examples of palindromes are "madam", "anna", "reviver".
 *
 * Sample Input
 * madam
 *
 * Sample Output
 * Yes
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();

        int a = 0;
        int b = A.length()-1;
        boolean flag = true;

        while(a<b) {
            if(A.charAt(a) != A.charAt(b)) {
                System.out.println("No");
                return;
            }
            a++;
            b--;
        }
        System.out.println("Yes");
    }
}
