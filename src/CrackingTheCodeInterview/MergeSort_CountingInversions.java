package CrackingTheCodeInterview;

import java.util.Scanner;

/**
 * Merge Sort: Counting Inversions
 *
 * Given d datasets,
 * print the number of inversions that must be swapped to sort each dataset on a new line.
 */
public class MergeSort_CountingInversions {
    public static long countInversions(int[] arr){
        return divideArray(arr, 0, arr.length-1);
    }

    private static long divideArray(int[] arr, int left, int right) {
        if(left >= right)
            return 0;

        int mid = (left + right)>>>1;
        long count = 0;
        count += divideArray(arr, left, mid);
        count += divideArray(arr, mid+1, right);
        count += merge(arr, left, right);

        return count;

    }

    private static long merge(int[] arr, int left, int right) {
        int mid = (left+right)>>>1;
        int[] newArr = new int[right-left+1];
        int cur = 0;
        int i = left;
        int j = mid+1;
        long count = 0;

        while(i<=mid && j<=right) {
            if(arr[i] > arr[j]) {
                newArr[cur++] = arr[j++];
                count += mid-i+1;
            }
            else
                newArr[cur++] = arr[i++];
        }

        while (i<=mid) {
            newArr[cur++] = arr[i++];
        }

        while (j<=right) {
            newArr[cur++] = arr[j++];
        }

        System.arraycopy(newArr, 0, arr, left, right-left+1);
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            System.out.println(countInversions(arr));
        }
    }
}
