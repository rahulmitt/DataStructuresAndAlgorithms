package com.rahul.ds.array.sorted;

public class FindDuplicatesInASortedArray {
    private static int[] a = {3, 3, 3, 6, 8, 8, 10, 12, 15, 15, 15, 20, 20, 21};

    public static void main(String[] args) {
        int lastDuplicate = Integer.MIN_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1] && lastDuplicate != a[i]) {
                lastDuplicate = a[i];
                System.out.print(a[i] + ", ");
            }
        }

    }
}
