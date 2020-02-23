package com.rahul.algo.sorting;

import java.util.Arrays;

/**
 * Counting Sort makes assumptions about data:
 * 1. works only with non-negative integers (cant work with floats, String)
 * 2. All elements must be within a specific (narrow) range
 *
 * Instead of using comparisons, it counts the number of occurrences of each element
 *
 * Stable Algo (relative ordering of duplicate elements is preserved): No
 * In-Place Algo: No
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class CountingSort {

    public static void main(String[] args) {
//        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        int[] intArray = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0};
        System.out.println("Original:     " + Arrays.toString(intArray));
        countingSort(intArray, 0, 1);
        System.out.println("Sorted Array: " + Arrays.toString(intArray));
    }

    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }

}
