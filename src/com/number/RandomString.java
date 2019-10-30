package com.number;

public class RandomString {
    public static String allChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890";

    public static String randomString(int length) {
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            short s = (short) (Math.random() * (allChars.length() - 1));
            result[i] = allChars.charAt(s);
        }
//        System.out.println(new String(result));
        return new String(result);
    }

    public static char randomChar() {
        return randomString(1).charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(randomString(5));
    }
}
