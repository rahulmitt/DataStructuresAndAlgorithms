package com.rahul.ds.array.sorted;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    private static int[] a = {3, 8, 16, 20, 25};
    private static int[] b = {4, 10, 12, 22, 23};

    public static void main(String[] args) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));
        while (i < a.length && j < b.length) {
            c[k++] = a[i] < b[j] ? a[i++] : b[j++];
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
        System.out.println("Merged: " + Arrays.toString(c));
    }
}
