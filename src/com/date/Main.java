package com.date;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 打印出下个月倒数第3天
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, 2);
        c.set(Calendar.DAY_OF_MONTH, 1);
        c.add(Calendar.DAY_OF_MONTH, -3);
        System.out.println("下个月倒数第3天是：" + c.getTime());

    }
}
