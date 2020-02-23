package com.rahul.ds.string;

/*
    ASCII
    A - 65          a - 97          97-65=32
    B - 66          b - 98          98-66=32
    ..              ..              ..
    ..              ..              ..
    Z - 90          z - 122         122-90=32
*/
public class ChangeCases {
    public static void main(String[] args) {
        char[] str = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        String s1 = "WELCOME";
        String s2 = "hello";
        String s3 = "Hello World";

        changeCase(str);
        changeCase(s1.toCharArray());
        changeCase(s2.toCharArray());
        changeCase(s3.toCharArray());
    }

    private static void changeCase(char[] str) {
        System.out.print(String.valueOf(str) + " ==> ");
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= 'A' && str[i] <= 'Z') str[i] += 32;
            else if (str[i] >= 'a' && str[i] <= 'z') str[i] -= 32;
        }

        System.out.println(String.valueOf(str));
    }
}
