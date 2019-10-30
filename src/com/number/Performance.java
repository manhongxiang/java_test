package com.number;

public class Performance {
    public static void main(String[] args) {
        //String, StringBuilder, StringBuffer性能对比
        //创建字符串
        String[] ss = new String[10000];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = RandomString.randomString(10);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(ss[i] + " ");
        }

        long time0 = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (String s : ss) {
            sbf.append(s);
        }
        System.out.println("----String Buffer----\nstring length: " + sbf.toString().length());
        System.out.println(sbf.substring(0, 100));
        long time1 = System.currentTimeMillis();
        System.out.printf("time cost:%d\n", time1 - time0);

        StringBuilder sbd = new StringBuilder();
        for (String s : ss) {
            sbd.append(s);
        }
        System.out.println("----String Builder----\nstring length: " + sbd.toString().length());
        System.out.println(sbd.substring(0, 100));
        long time2 = System.currentTimeMillis();
        System.out.printf("time cost:%d\n", time2 - time1);

        String st = "";
        for (String s : ss) {
            st = st + s;
        }
        System.out.println("----String---\nstring length: " + st.length());
        System.out.println(st.substring(0, 100));
        long time3 = System.currentTimeMillis();
        System.out.printf("time cost:%d\n", time3 - time2);
    }

}
