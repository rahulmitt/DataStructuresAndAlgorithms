package com.rahul.ds.array.sorted;

public class FindMissingElementsInASortedArray {
    private static int[] a = {2, 3, 4, 5, 6, 9, 10, 12};

    public static void main(String[] args) {
        method1_usingDifference();
        method2_usingHash(2, 12);
    }

    private static void method1_usingDifference() {
        System.out.print("Missing Element: ");
        int diff = a[0] - 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] - i == diff) i++;
            else {
                int missing = diff + i;
                System.out.print(missing + ", ");
                diff++;
            }
        }
        System.out.println();
    }

    private static void method2_usingHash(int min, int max) {
        System.out.print("Missing Element: ");
        int[] temp = new int[max + 1];
        for (int i = 0; i < a.length; i++) temp[a[i]]++;
        for (int i = min; i < temp.length; i++) {
            if(temp[i] == 0) {
                System.out.print(i + ", ");
            }
        }
    }

}
