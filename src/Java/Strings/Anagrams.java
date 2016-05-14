package Java.Strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Java Anagrams
 *
 * Two strings A and B are called anagrams if they consist same characters,
 * but may be in different orders.
 * So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA".
 *
 * Given two strings, print "Anagrams" if they are anagrams, print "Not Anagrams" if they are not.
 * The strings may consist at most 50 english characters, the comparison should NOT be case sensitive.
 *
 * This exercise will verify that you are able to sort the characters of a string, or compare frequencies of characters.
 *
 * Sample Input 1
 * anagram
 * margana
 *
 * Sample Output 1:
 * Anagrams
 *
 * Sample Input 2
 * anagramm
 * marganaa
 *
 * Sample Output 2:
 * Not Anagrams
 */
public class Anagrams {
    static boolean isAnagram(String A, String B) {
        //Complete the function
        if(A.length() != B.length())
            return false;

        char[] arrayA = A.toLowerCase().toCharArray();
        Arrays.sort(arrayA);
        char[] arrayB = B.toLowerCase().toCharArray();
        Arrays.sort(arrayB);

        for(int i=0;i<A.length();i++) {
            if(arrayA[i] != arrayB[i])
                return false;
        }

        return true;
    }

    static boolean isAnagram2(String A, String B) {
        if(A.length() != B.length())
            return false;

        A = A.toLowerCase();
        B = B.toLowerCase();

        int[] check = new int[26];

        for(int i=0;i<A.length();i++) {
            check[A.charAt(i)-'a']++;
            check[B.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++) {
            if(check[i] != 0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    }
}
