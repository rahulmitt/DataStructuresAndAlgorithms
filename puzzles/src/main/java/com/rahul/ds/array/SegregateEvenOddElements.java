package com.rahul.ds.array;

import java.util.Arrays;

public class SegregateEvenOddElements {
    private static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        System.out.println("Original Array: " + Arrays.toString(arr));
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] % 2 == 0 && arr[j] % 2 == 1) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if (arr[i] % 2 == 1) i++;
            if (arr[j] % 2 == 0) j--;
        }

        System.out.println("Modified Array: " + Arrays.toString(arr));
    }
}
