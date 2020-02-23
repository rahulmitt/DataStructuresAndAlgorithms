package com.rahul.ds.array.unsorted;

import java.util.Arrays;

public class DifferenceBetweenTwoUnsortedArrays {
    private static int[] a = {3, 5, 10, 4, 6};
    private static int[] b = {12, 4, 7, 2, 5};

    public static void main(String[] args) {
        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));

        int[] c = new int[a.length + b.length];
        int k=0;

        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            if(!found) c[k++] = a[i];
        }

        System.out.println("Difference (A-B): " + Arrays.toString(c));
    }
}
