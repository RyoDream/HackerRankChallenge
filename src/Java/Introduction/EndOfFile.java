package Java.Introduction;

import java.util.Scanner;

/**
 * Java End-of-file
 *
 * "In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system
 * where no more data can be read from a data source." — (Wikipedia: End-of-file)
 *
 * The challenge here is to read  lines of input until you reach EOF,
 * then number and print all  lines of content.
 *
 * Hint: Java's Scanner.hasNext() method is helpful for this problem.
 *
 * Input Format
 * Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
 *
 * Output Format
 * For each line, print the line number, followed by a single space, and then the line content received as input:
 *
 * k This is the line read as input for line number 'k'.
 *
 * Sample Input
 * Hello world
 * I am a file
 * Read me until end-of-file.
 *
 * Sample Output
 * 1 Hello world
 * 2 I am a file
 * 3 Read me until end-of-file.
 */
public class EndOfFile {
    public static void main(String[] args) {
        int line = 1;

        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            System.out.println(line+" "+scan.nextLine());
            line++;
        }
    }
}
