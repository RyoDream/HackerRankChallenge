package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Birthday Cake Candles
 *
 * Colleen is turning n years old! She has n candles of various heights on her cake,
 * and candle i has height height[i].
 *
 * Because the taller candles tower over the shorter ones,
 * Colleen can only blow out the tallest candles.
 *
 * Given the height for each individual candle,
 * find and print the number of candles she can successfully blow out.
 */
public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int count = 0;
        while (n-- > 0) {
            int h = in.nextInt();
            if (h > max) {
                max = h;
                count = 1;
            } else if (h == max) {
                count++;
            }
        }
        System.out.println(count);
    }
}
