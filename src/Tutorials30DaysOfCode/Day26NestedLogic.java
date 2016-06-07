package Tutorials30DaysOfCode;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Day 26: Nested Logic
 *
 * Objective
 * Today's challenge puts your understanding of nested conditional statements to the test.
 * You already have the knowledge to complete this challenge,
 * but check out the Tutorial tab for a video on testing!
 *
 * Task
 * Your local library needs your help!
 * Given the expected and actual return dates for a library book,
 * create a program that calculates the fine (if any). The fee structure is as follows:
 *
 * If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine=0).
 *
 * If the book is returned after the expected return day
 * but still within the same calendar month and year as the expected return date,
 * fine = 15 Hackos * (the number of days late ).
 *
 * If the book is returned after the expected return month
 * but still within the same calendar year as the expected return date,
 * the fine = 500 Hackos * (the number of months late).
 *
 * If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 Hackos.
 *
 * Input Format
 * The first line contains 3 space-separated integers denoting the respective day,
 * month, and year on which the book was actually returned.
 *
 * The second line contains 3 space-separated integers denoting the respective day,
 * month, and year on which the book was expected to be returned (due date).
 *
 * Constraints
 * Output Format
 * 1 <= D <= 31
 * 1 <= M <= 12
 * 1 <= Y <= 3000
 * It is guaranteed that the dates will be valid Gregorian calendar dates.
 *
 * Print a single integer denoting the library fine for the book received as input.
 *
 * Sample Input
 * 9 6 2015
 * 6 6 2015
 * Sample Output
 * 45
 */
public class Day26NestedLogic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int actuallyDay = scanner.nextInt();
        int actuallyMonth = scanner.nextInt();
        int actuallyYear = scanner.nextInt();
        int expectDay = scanner.nextInt();
        int expectMonth = scanner.nextInt();
        int expectYear = scanner.nextInt();

//        LocalDate actuallyDate = LocalDate.of(actuallyYear, actuallyMonth, actuallyDay);
//        LocalDate expectDate = LocalDate.of(expectYear, expectMonth, expectDay);

        int fine = 0;

        if(actuallyYear > expectYear) {
            fine = 10000;
            System.out.println(fine);
            return;
        }

        if(actuallyMonth > expectMonth) {
            fine = (actuallyMonth - expectMonth) * 500;
            System.out.println(fine);
            return;
        }

        if(actuallyDay > expectDay) {
            fine = (actuallyDay - expectDay) * 15;
            System.out.println(fine);
            return;
        }

        System.out.println(fine);
    }
}
