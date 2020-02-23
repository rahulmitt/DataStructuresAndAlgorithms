package com.rahul.ds.array.sorted;

import java.util.Arrays;

public class UnionOfTwoSortedArrays {
    private static int[] a = {3, 4, 5, 6, 10};
    private static int[] b = {2, 4, 5, 7, 12};

    public static void main(String[] args) {
        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));

        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                c[k++] = a[i];
                i++;
                j++;

            } else if (a[i] < b[j]) {
                c[k++] = a[i++];

            } else {
                c[k++] = b[j++];
            }
        }

        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];

        System.out.println("Union: " + Arrays.toString(c));
    }
}
