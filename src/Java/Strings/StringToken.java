package Java.Strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Java String Token
 *
 * Given a string, find number of words in that string.
 * For this problem a word is defined by a string of one or more english alphabets.
 *
 * There are multiple ways to tokenize a string in java,
 * learn how to tokenize a string in java and demonstrate your skill by solving this problem!
 *
 * Input Format
 * A string not more than 400000 characters long.
 * The string can be defined by following regular expression:
 *
 * [A-Za-z !,?.\_'@]+
 * That means the string will only contain english alphabets, blank spaces and this characters: "!,?._'@".
 *
 * Output Format
 * In the first line, print number of words n in the string.
 * The words don't need to be unique.
 * In the next n lines, print all the words you found in the order they appeared in the input.
 *
 * Sample Input
 * He is a very very good boy, isn't he?
 *
 * Sample Output
 * 10
 * He
 * is
 * a
 * very
 * very
 * good
 * boy
 * isn
 * t
 * he
 */
public class StringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();

        ArrayList<String> res = new ArrayList<>();
        int index = 0;

        tokenize(s, index, res);

        System.out.println(res.size());
        Iterator iterator = res.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }


    public static void tokenize(String s, int index, ArrayList<String> res) {
        while(index < s.length() && !isChar(s.charAt(index))) {
            index++;
        }
        if(index == s.length())
            return;

        int end = index;
        while(end < s.length() && isChar(s.charAt(end))) {
            end++;
        }

        res.add(s.substring(index, end));
        tokenize(s, end, res);
    }

    private static boolean isChar(char c) {
        return (c>='a' && c<='z') || (c>='A' && c<='Z');
    }
}
