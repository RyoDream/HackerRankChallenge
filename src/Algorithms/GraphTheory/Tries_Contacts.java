package Algorithms.GraphTheory;

import java.util.Scanner;

/**
 * Tries: Contacts
 *
 * We're going to make our own Contacts application!
 * The application must perform two types of operations:
 *
 * add name, where name is a string denoting a contact name.
 * This must store name as a new contact in the application.
 *
 * find partial, where partial is a string denoting a partial name to search the application for.
 * It must count the number of contacts starting with partial and print the count on a new line.
 *
 * Given  sequential add and find operations, perform each operation in order.
 */
public class Tries_Contacts {
    private static TrieNode[] dictionary = new TrieNode[26];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();

            if("add".equals(op)) {
                add(contact);
            }
            else {
                find(contact);
            }
        }
    }

    private static void add(String s) {
        TrieNode[] head = dictionary;
        for(int i=0;i<s.length();i++) {
            if(head[s.charAt(i)-'a'] == null) {
                head[s.charAt(i)-'a'] = new TrieNode();
            }

            head[s.charAt(i)-'a'].val++;
            head = head[s.charAt(i)-'a'].children;
        }
    }

    private static void find(String s) {
        TrieNode[] head = dictionary;
        int numOfContacts = 0;

        for(int i=0;i<s.length();i++) {
            if (head[s.charAt(i)-'a'] == null) {
                System.out.println(0);
                return;
            }

            numOfContacts = head[s.charAt(i)-'a'].val;
            head = head[s.charAt(i)-'a'].children;
        }
        System.out.println(numOfContacts);
    }

    static class TrieNode {
        int val = 0;
        TrieNode[] children = new TrieNode[26];
    }
}



