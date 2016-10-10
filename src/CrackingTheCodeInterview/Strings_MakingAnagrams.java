package CrackingTheCodeInterview;

import java.util.Scanner;

/**
 * Strings: Making Anagrams
 *
 * Given two strings, a and b,
 * that may or may not be of the same length,
 * determine the minimum number of character deletions required to make a and b anagrams.
 *
 * Any characters can be deleted from either of the strings.
 */
public class Strings_MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        int[] alphabet = new int[26];
        for(char c : first.toCharArray()) {
            alphabet[c-'a']++;
        }

        for(char c : second.toCharArray()) {
            alphabet[c-'a']--;
        }

        int result = 0;
        for(int i : alphabet) {
            if(i != 0)
                result += i>0?i:-i;
        }

        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.next();
        String second = in.next();
        System.out.println(numberNeeded(first, second));
    }
}
