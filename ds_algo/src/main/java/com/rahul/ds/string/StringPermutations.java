package com.rahul.ds.string;

public class StringPermutations {
    public static void main(String[] args) {
        String str = "ABC";
        permutations(str.toCharArray());
    }

    private static void permutations(char[] str) {
        int[] flagArr = new int[str.length];
        char[] resultArr = new char[str.length];
        permutations(str, flagArr, resultArr, 0);
    }

    private static void permutations(char[] str, int[] flagArr, char[] resultArr, int i) {
        if (i == str.length) {
            System.out.println(String.valueOf(resultArr));
            return;
        }

        for (int j = 0; j < str.length; j++) {
            if (flagArr[j] == 0) {
                resultArr[i] = str[j];
                flagArr[j] = 1;
                permutations(str, flagArr, resultArr, i + 1);
                flagArr[j] = 0;
            }
        }
    }
}
