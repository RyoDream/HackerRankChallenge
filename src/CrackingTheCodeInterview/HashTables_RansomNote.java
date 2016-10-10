package CrackingTheCodeInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Hash Tables: Ransom Note
 *
 * A kidnapper wrote a ransom note but is worried it will be traced back to him.
 * He found a magazine and wants to know
 * if he can cut out whole words from it and use them to create an untraceable replica of his ransom note.
 *
 * The words in his note are case-sensitive and
 * he must use whole words available in the magazine,
 * meaning he cannot use substrings or concatenation to create the words he needs.
 *
 * Given the words in the magazine and the words in the ransom note,
 * print Yes if he can replicate his ransom note exactly using whole words from the magazine;
 * otherwise, print No.
 */
public class HashTables_RansomNote {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
            map.put(magazine[magazine_i], map.getOrDefault(magazine[magazine_i],0)+1);
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

        for(String str : ransom) {
            if(!map.containsKey(str) || map.get(str) <= 0) {
                System.out.println("No");
                return;
            }

            map.put(str, map.get(str)-1);
        }

        System.out.println("Yes");
    }
}
