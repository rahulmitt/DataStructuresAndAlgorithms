package com.rahul.ds.string;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "How are you?";
        count(str.toCharArray());
    }

    private static void count(char[] str) {
        int vCount = 0;
        int cCount = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'A' || str[i] == 'a'
                    || str[i] == 'E' || str[i] == 'e'
                    || str[i] == 'I' || str[i] == 'i'
                    || str[i] == 'O' || str[i] == 'o'
                    || str[i] == 'U' || str[i] == 'u') vCount++;
            else if ((str[i] >= 'A' && str[i] <= 'Z')
                    || (str[i] >= 'a' && str[i] <= 'z')) cCount++;
        }

        System.out.println(String.format("\"%s\" has %d vowels and %d consonants", String.valueOf(str), vCount, cCount));
    }
}
