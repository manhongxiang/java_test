package com.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TestString {
    public static void main(String[] args) {
        //每个单词首字母大写
        String s = "let there be light";
        System.out.println(s);
        String[] sentences = s.split(" ");
        for (int i = 0; i < sentences.length; i++) {
            String head = sentences[i].substring(0, 1).toUpperCase();
            String rest = sentences[i].substring(1, sentences[i].length());
            sentences[i] = head + rest;
        }
        StringBuilder result = new StringBuilder(sentences[0]);
        for (int i = 1; i < sentences.length; i++) {
            result.append(" " + sentences[i]);
        }
        System.out.println(result.toString());

        //统计多少个以p开头的单词
        System.out.println("--------------------------");
        s = "peter piper picked a peck of pickled peppers";
        int cnt = 0;
        for (String subString : s.split(" ")) {
            if (subString.startsWith("p")) {
                cnt++;
            }
        }
        System.out.printf("共有%d个单词以p开头\n", cnt);

        //变成大小写间隔
        System.out.println("--------------------------");
        s = "lengendary";
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                ch[i] = (char) (s.charAt(i) - 32);
            } else {
                ch[i] = s.charAt(i);
            }
        }
        System.out.println(String.valueOf(ch));

        //最后一个字母变大写
        System.out.println("--------------------------");
        s = "lengendary";
        String prefix = s.substring(0, s.length() - 1);
        String tail = s.substring(s.length() - 1, s.length()).toUpperCase();
        System.out.println(prefix + tail);

        //最后一个two的首字母大写
        System.out.println("--------------------------");
        s = " Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        char[] ch1 = s.toCharArray();
        int lastPosition = -1;
        for (int i = 0; i < ch1.length - 2; i++) {
            if (ch1[i] == 't' && ch1[i + 1] == 'w' && ch1[i + 2] == 'o') {
                lastPosition = i;
            }
        }
        ch1[lastPosition] = 'T';
        System.out.println(String.valueOf(ch1));

        //创建长100的字符串数组，各元素为长度为2的字符串，统计重复字符串有多少个
        System.out.println("--------------------------");
        String[] strings = new String[100];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = RandomString.randomString(2);
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ' ');
            if (i % 10 == 9) {
                System.out.println();
            }
        }
        ArrayList <String> arr = new ArrayList<>();     //list存储重复的字符串
        HashSet<String> stringsHash = new HashSet<>();
        for (String string : strings) {
            if (!stringsHash.add(string)) {
                arr.add(string);
            }
        }
        System.out.printf("共有%d个重复字符串：%s\n", arr.size(), arr);
        System.out.println("哈希表长度：" + stringsHash.size());
    }
}
