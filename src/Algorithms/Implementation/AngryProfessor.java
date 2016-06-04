package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Angry Professor
 *
 * A Discrete Mathematics professor has a class of N students.
 * Frustrated with their lack of discipline,
 * he decides to cancel class if fewer than K students are present when class starts.
 *
 * Given the arrival time of each student, determine if the class is canceled.
 * Input Format
 *
 * The first line of input contains T, the number of test cases.
 * Each test case consists of two lines.
 * The first line has two space-separated integers, N (students in the class) and K (the cancelation threshold).
 * The second line contains N space-separated integers () describing the arrival times for each student.
 *
 * Note: Non-positive arrival times indicate the student arrived early or on time;
 * positive arrival times indicate the student arrived  minutes late.
 *
 * Output Format
 * For each test case, print the word YES if the class is canceled or NO if it is not.
 *
 * Constraints
 * 1 <= T <= 10
 * 1 <= N <= 1000
 * 1 <= K <= N
 * -100 <= ai <= 100, where i∈[1,N]
 *
 * Note
 * If a student arrives exactly on time,
 * the student is considered to have entered before the class started.
 *
 * Sample Input
 * 2
 * 4 3
 * -1 -3 4 2
 * 4 2
 * 0 -1 2 1
 *
 * Sample Output
 * YES
 * NO
 */
public class AngryProfessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];

            int sum = 0;

            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                if(a[a_i] <= 0)
                    sum++;
            }

            if(sum >= k)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
