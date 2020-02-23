package com.rahul.ds.array;

import java.util.Arrays;

public class SegregateNegativePositiveElements {
    private static int[] arr = {-6, 3, -8, 10, 50, -7, -9, 12, -4, 2};

    public static void main(String[] args) {
        System.out.println("Original Array: " + Arrays.toString(arr));

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] > 0 && arr[j] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if (arr[i] < 0) i++;
            if (arr[j] > 0) j--;
        }
        System.out.println("Modified Array: " + Arrays.toString(arr));
    }
}
