package com.rahul.ds.string;

public class CompareTwoStrings {
    public static void main(String[] args) {
        String str1 = "Painter";
        String str2 = "Painter";
        String str3 = "Paintee";
        String str4 = "Painting";

        System.out.println(String.format("%s == %s ?? %b", str1, str2, compare(str1.toCharArray(), str2.toCharArray())));
        System.out.println(String.format("%s == %s ?? %b", str1, str3, compare(str1.toCharArray(), str3.toCharArray())));
        System.out.println(String.format("%s == %s ?? %b", str1, str4, compare(str1.toCharArray(), str4.toCharArray())));
    }

    private static boolean compare(char[] str1, char[] str2) {
        if (str1.length != str2.length) return false;
        for (int i = 0; i < str1.length; i++) if (str1[i] != str2[i]) return false;
        return true;
    }
}
