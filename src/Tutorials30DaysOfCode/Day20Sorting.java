package Tutorials30DaysOfCode;

import java.util.Scanner;

/**
 * Day 20: Sorting
 *
 * Objective
 * Today, we're discussing a simple sorting algorithm called Bubble Sort.
 * Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Task
 * Given an array, a, of size n containing distinct elements a[0],a[1],..,a[n-1]
 * sort array a in ascending order using the Bubble Sort algorithm above.
 * Once sorted, print the following 3 lines:
 * 1. Array is sorted in numSwaps swaps.
 * where numSwaps is the number of swaps that took place.
 *
 * 2. First Element: firstElement
 * where firstElement is the first element in the sorted array.
 *
 * 3. Last Element: lastElement
 * where lastElement is the last element in the sorted array.
 *
 * Hint: To complete this challenge,
 * you will need to add a variable that keeps a running tally of all swaps that occur during execution.
 *
 * Input Format
 * The first line contains an integer, n, denoting the number of elements in array a.
 * The second line contains n space-separated integers describing a, where the ith integer is a[i].
 *
 * Constraints
 * 2 <= n <= 600
 * 1 <= a[i] <= 2*10^6
 *
 * Output Format
 * There should be 3 lines of output:
 * 1. Array is sorted in numSwaps swaps.
 * where numSwaps is the number of swaps that took place.
 *
 * 2. First Element: firstElement
 * where firstElement is the first element in the sorted array.
 *
 * 3. Last Element: lastElement
 * where lastElement is the last element in the sorted array.
 *
 */
public class Day20Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int numberOfSwaps = 0;

        for (int i = 0; i < n; i++) {


            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    numberOfSwaps++;
                }
            }

            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }

}
