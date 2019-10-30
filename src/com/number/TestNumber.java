package com.number;

import java.util.Scanner;

public class TestNumber {
    public static boolean zhishu(int num) {
        if (num == 1) {
            return true;
        }

        for (int i = 2; i <= Math.round(Math.sqrt(num)); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] argv) {
        int i0 = 5;
        Integer i1 = new Integer(i0);
        System.out.println(i1==i0);
        System.out.println(new Integer(1) instanceof Number);
        System.out.println(i1 instanceof Number);

        Integer i2 = i0;
        int i3 = i2;
        System.out.println(i2.intValue());
        System.out.println(i3);
        System.out.println(i2 + i3);

        System.out.println("------------------------");
        Byte b = 127;
        byte b1 = new Byte(b.byteValue());
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b.MAX_VALUE);
        System.out.println(b.MIN_VALUE);
        System.out.println(b + b1);

        System.out.println("------------------------");
        String s1 = String.valueOf(12345);
        Integer i4 = 12345;
        String s2 = i4.toString();
        System.out.println(s1.equals(s2));

        String s0 = "3.14";
        Double d0 = Double.parseDouble(s0);
        System.out.println(d0);

        System.out.println("------------------------");
        double d1 = 5.1;
        double d2 = 5.2;
        System.out.println(Math.round(d1));
        System.out.println(Math.ceil(d2));
        System.out.println((int)Math.random() * 100);
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.PI);
        System.out.println(Math.E);
        double max = Integer.MAX_VALUE;
        System.out.println((double)max);
        double e = Math.pow(1 + 1 / max, max);
        System.out.println(e);

//        System.out.println("------------------------");
//        int cnt = 0;
//        for (int i = 2; i < 1000 * 10000; i++) {
//            if (zhishu(i)) {
//                cnt++;
//            }
//        }
//        System.out.format("1000万之内共有%d个质数%n", cnt);

        System.out.println("------------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入地名（例：浙江温州）：");
        String location = scanner.nextLine();

        System.out.print("请输入公司类型（例：皮革厂）：");
        String type = scanner.nextLine();

        System.out.print("请输入公司名：");
        String enterprise = scanner.nextLine();

        System.out.print("请输入欠款金额：");
        double money = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("请输入公司产品：");
        String product = scanner.nextLine();


        System.out.print("请输入产品计价单位：");
        String price = scanner.nextLine();


        System.out.print("请输入老板名：");
        String boss = scanner.nextLine();

        System.out.format("%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%.1f个亿，带着他的小姨子跑了!" +
                "我们没有办法，拿着%s抵工资!原价都是一%s多、两%s多、三%s多的%s，现在全部只卖二十块，统统只要二十块!" +
                "%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱! ",
                location, type, enterprise, boss, money, product, price, price, price, product, boss);
    }
}
