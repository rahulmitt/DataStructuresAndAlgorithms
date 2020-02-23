package com.rahul.algo.sorting;

import java.util.Arrays;

/**
 * QuickSort is a divide and conquer algorithm that uses recursion
 * This algo chooses a pivot element and divides the 2 parts such that:
 * Elements < pivot to its left and elements > pivot to its right, pivot will then be in its correct sorted position
 *
 * This process is now repeated for the left and right arrays until all the arrays have only 1 element each.
 * Eventually, every element has been the pivot, so every element will be in its correct sorted position.
 *
 * Stable Algo (relative ordering of duplicate elements is preserved): No
 * In-Place Algo: Yes
 *
 * Time Complexity: average case O(n log(n)), worst case O(n)
 * Space Complexity: O(log(n))
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Original: " + Arrays.toString(intArray));
        quickSort(intArray, 0, intArray.length);
        System.out.println("Sorted Array: " + Arrays.toString(intArray));
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) return;

        int pivotIdx = partition(input, start, end);
        quickSort(input, start, pivotIdx);
        quickSort(input, pivotIdx + 1, end);
    }

    // this is using the first element as the pivot
    private static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && input[--j] >= pivot) ; // empty loop body
            if (i < j) input[i] = input[j];

            while (i < j && input[++i] <= pivot) ; // empty loop body
            if (i < j) input[j] = input[i];
        }

        input[j] = pivot;
        return j;
    }

}
