package com.rahul.ds.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        reverse(str.toCharArray());
    }

    private static void reverse(char[] str) {
        System.out.println("Original: " + String.valueOf(str));

        int low = 0;
        int high = str.length - 1;
        while (low < high) {
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }

        System.out.println("Reversed: " + String.valueOf(str));
    }
}
