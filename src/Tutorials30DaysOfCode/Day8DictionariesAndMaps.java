package Tutorials30DaysOfCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Day 8: Dictionaries and Maps
 *
 * Objective
 * Today, we're learning about Key-Value pair mappings using a Map or Dictionary data structure.
 * Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Task
 *
 * Given N names and phone numbers,
 * assemble a phone book that maps friends' names to their respective phone numbers.
 * You will then be given an unknown number of names to query your phone book for;
 * for each name queried, print the associated entry from your phone book
 * (in the form name=phoneNumber) or Not found if there is no entry for name.
 *
 *
 * Note: Your phone book should be a Dictionary/Map/HashMap data structure.
 *
 * Input Format
 *
 * The first line contains an integer, N, denoting the number of entries in the phone book.
 * Each of the N subsequent lines describes an entry in the form of 2 space-separated values on a single line.
 * The first value is a friend's name, and the second value is an 8-digit .
 *
 * After the N lines of phone book entries,
 * there are an unknown number of lines of queries.
 * Each line (query) contains a name to look up,
 * and you must continue reading lines until there is no more input.
 *
 * Note: Names consist of lowercase English letters and are first names only.
 *
 *
 * Constraints
 * 1 <= N <= 10^5
 * 1 <= queries <= 10^5
 *
 * Output Format
 * On a new line for each query, print Not found if the name has no corresponding entry in the phone book;
 * otherwise, print the full name and phoneNumber in the format .
 *
 * Sample Input
 * 3
 * sam 99912222
 * tom 11122222
 * harry 12299933
 * sam
 * edward
 * harry
 *
 * Sample Output
 * sam=99912222
 * Not found
 * harry=12299933
 */
public class Day8DictionariesAndMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(map.containsKey(s))
                System.out.println(s+"="+map.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
