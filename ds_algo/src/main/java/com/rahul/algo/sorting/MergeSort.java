package com.rahul.algo.sorting;

import java.util.Arrays;

/**
 * MergeSort is a divide and conquer algorithm that uses recursion to divide the original array into smaller arrays to solve the problem
 * MergeSort involves 2 phases: Splitting and Merging
 *
 * To split an array, MergeSort will take the middle of the array and split it into left and right arrays.
 * These (left and right) arrays are again recursively split until all the arrays have only 1 element each -- these arrays are sorted
 *
 * To merge both (left and right) arrays it starts at each array at the beginning and pick the element which is smaller and
 * inserts this element into a temp array. This temp array is then copied back to the original array
 *
 * Stable Algo (relative ordering of duplicate elements is preserved): Yes
 * In-Place Algo: No
 *
 * Time Complexity: O(n log(n))
 * Space Complexity: O(n)
 *
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Original: " + Arrays.toString(intArray));
        mergeSort(intArray, 0, intArray.length);
        System.out.println("Sorted: " + Arrays.toString(intArray));
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) return;

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) return;

        int i = start;
        int j = mid;
        int tempIdx = 0;
        int[] tempArr = new int[end - start];

        while (i < mid && j < end) {
            tempArr[tempIdx++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // copy the leftover elements from the left array
        System.arraycopy(input, i, input, start + tempIdx, mid - i);

        // any leftover elements in the right array need not be copied

        //copy the temp array to the input array
        System.arraycopy(tempArr, 0, input, start, tempIdx);
    }
}
