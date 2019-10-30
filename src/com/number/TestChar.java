package com.number;

import java.util.Arrays;
import java.util.Scanner;

public class TestChar {
    public static void main(String[] argv) {
        char c1 = 'a';
        char c2 = '1';
        char c3 = '中';
//        char c4 = 'ab';

        Character c = c3;
        System.out.println(c);
        c3 = c;
        System.out.println(c3);

        System.out.println("------------------------");
        System.out.println(Character.isLetter('中'));
        System.out.println(Character.isDigit(1));

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入一段字符串：");
//        String str = scanner.nextLine();
//        char[] cs1 = str.toCharArray();

//        System.out.println(Arrays.toString(cs1));
//        StringBuilder sb = new StringBuilder();
//        for (char ch : cs1) {
//            if (Character.isUpperCase(ch) || Character.isDigit(ch)) {
//                sb.append(ch);
//            }
//        }
//        System.out.println(sb.toString());

        char[] ch = new char[]{'a', 'b', 'c'};
        System.out.println(new String(ch));

        System.out.println("------------------------");
        char a = 'a';
        short s = (short) a;
        System.out.println(s);
        a = (char) s;
        System.out.println(a);

        System.out.println("------------------------");
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
        String[] subSentences = sentence.split(",");
        for (String sub : subSentences) {
            System.out.println(sub);
        }
    }
}
