package com.rahul.ds.string;

public class CountWords {
    public static void main(String[] args) {
        String str = "  How are       you  ";
        countWords(str.toCharArray());
    }

    private static void countWords(char[] str) {
        if (str.length == 0) {
            System.out.println("word count = 0");
            return;
        }

        int low = 0;
        int high = str.length - 1;

        while (str[low] == ' ') low++;
        while (str[high] == ' ') high--;

        int spaceCounter = 0;
        for (int i = low; i <= high; i++) {
            if (str[i] == ' ') {
                spaceCounter++;
                int j = i;
                while (j <= high && str[j] == ' ') j++;
                i = j;
            }
        }
        System.out.println("word count=" + (spaceCounter + 1));
    }
}
