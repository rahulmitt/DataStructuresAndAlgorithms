package com.rahul.ds.array.sorted;

public class CountDuplicatesInASortedArray {
    private static int[] a = {3, 3, 3, 6, 8, 8, 10, 12, 15, 15, 15, 20, 20, 21, 21, 21, 21, 21};

    public static void main(String[] args) {
        method1();
        System.out.println();
        method2_hash(3, 21);
    }

    private static void method1() {
        for (int i = 0; i < a.length - 1; i++) {
            int count = 0;
            int j = i;
            while (j < a.length) {
                if (a[i] == a[j]) count++;
                else {
                    i = j - 1;
                    break;
                }
                j++;
            }

            if (count > 1) {
                System.out.println("Duplicate " + a[i] + " :: count=" + count);
            }
            if (j == a.length) break;
        }
    }

    private static void method2_hash(int min, int max) {
        int[] temp = new int[max + 1];
        for (int i = 0; i < a.length; i++) temp[a[i]]++;
        for (int i = min; i < temp.length; i++) {
            if (temp[i] > 1) {
                System.out.println("Duplicate " + i + " :: count=" + temp[i]);
            }
        }
    }
}
