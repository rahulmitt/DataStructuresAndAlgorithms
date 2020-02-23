package com.rahul.ds.string;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str1 = "civic";
        String str2 = "radar";
        String str3 = "level";
        String str4 = "rotor";
        String str5 = "refer";
        String str6 = "abba";
        String str7 = "hello";

        System.out.println(String.format("%s ?? %b", str1, check(str1.toCharArray())));
        System.out.println(String.format("%s ?? %b", str2, check(str2.toCharArray())));
        System.out.println(String.format("%s ?? %b", str3, check(str3.toCharArray())));
        System.out.println(String.format("%s ?? %b", str4, check(str4.toCharArray())));
        System.out.println(String.format("%s ?? %b", str5, check(str5.toCharArray())));
        System.out.println(String.format("%s ?? %b", str6, check(str6.toCharArray())));
        System.out.println(String.format("%s ?? %b", str7, check(str7.toCharArray())));
    }

    private static boolean check(char[] str) {
        int low = 0;
        int high = str.length - 1;
        while (low < high) {
            if(str[low] != str[high]) return false;
            low++;
            high--;
        }

        return true;
    }
}
