package com.rahul.ds.array.unsorted;

import java.util.Arrays;

public class UnionOfTwoUnsortedArrays {
    private static int[] a = {3, 5, 10, 4, 6};
    private static int[] b = {12, 4, 7, 2, 5};

    public static void main(String[] args) {
        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));

        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) c[i] = a[i];

        int cIdx = a.length;
        for (int i = 0; i < b.length; i++) {
            boolean found = false;
            for (int j = 0; j < c.length; j++) {
                if(b[i] == c[j]) {
                    found = true;
                    break;
                }
            }

            if(!found) c[cIdx++] = b[i];
        }

        System.out.println("Union: " + Arrays.toString(c));
    }
}
