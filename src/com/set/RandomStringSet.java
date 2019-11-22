package com.set;

import com.number.RandomString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RandomStringSet extends RandomString {
    public static void main(String[] args) {
        String[] strings = new String[100];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = randomString(2);
        }

        HashSet<String> hashset = new HashSet<>();
        ArrayList<String> duplicated = new ArrayList<>();
        for (String string : strings) {
            if (hashset.contains(string)) {
                duplicated.add(string);
            } else {
                hashset.add(string);
            }
        }
        System.out.printf("共有%d个重复的字符串，分别是:%s\n", duplicated.size(), duplicated);
        System.out.println(Arrays.toString(strings));
    }
}
