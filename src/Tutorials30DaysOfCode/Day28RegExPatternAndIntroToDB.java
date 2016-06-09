package Tutorials30DaysOfCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Day 28: RegEx, Patterns, and Intro to Databases
 *
 * Objective
 * Today, we're working with regular expressions.
 * Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Task
 * Consider a database table, Emails, which has the attributes First Name and Email ID.
 * Given rows of data simulating the Emails table,
 * print an alphabetically-ordered list of people whose email address ends in .
 *
 * Input Format
 * The first line contains an integer, N, total number of rows in the table.
 * Each of the N subsequent lines contains 2 space-separated strings
 * denoting a person's first name and email ID, respectively.
 *
 * Constraints
 * Each of the first names consists of lower case letters  only.
 * Each of the email IDs consists of lower case letters ,  and  only.
 * The length of the first name is no longer than 20.
 * The length of the email ID is no longer than 50.
 *
 * Output Format
 * Print an alphabetically-ordered list of first names for every user with a gmail account.
 * Each name must be printed on a new line.
 *
 * Sample Input
 * 6
 * riya riya@gmail.com
 * julia julia@julia.me
 * julia sjulia@gmail.com
 * julia julia@gmail.com
 * samantha samantha@gmail.com
 * tanya tanya@gmail.com
 *
 * Sample Output
 * julia
 * julia
 * riya
 * samantha
 * tanya
 */
public class Day28RegExPatternAndIntroToDB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String regExString = "[a-zA-Z\\s]+@gmail.com";
        ArrayList<String> arrayList = new ArrayList<>();

        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();

            Pattern p = Pattern.compile(regExString);
            Matcher m = p.matcher(emailID);

            if(m.find()) {
                arrayList.add(firstName);
            }
        }

        Collections.sort(arrayList);
        for(String s : arrayList)
            System.out.println(s);

    }
}
