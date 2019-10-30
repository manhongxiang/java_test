package com.number;

import java.util.Arrays;

public class RandomStringSort extends RandomString{
    public static void sort(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length - i - 1; j++) {
                char c1 = strings[j].charAt(0);
                char c2 = strings[j + 1].charAt(0);
                if ('A' <= c1 && c1 <= 'Z') {
                    c1 = (char) (c1 + 32);
                }
                if ('A' <= c2 && c2 <= 'Z') {
                    c2 = (char) (c2 + 32);
                }

                if (c1 > c2) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] strings = new String[8];
        for (int i = 0; i < 8; i++) {
            strings[i] = randomString(5);
        }

        System.out.println(Arrays.toString(strings));
        sort(strings);
        System.out.println(Arrays.toString(strings));
    }
}
