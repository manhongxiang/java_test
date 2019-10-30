package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class TestDate {
    public void sortTime() {
        // 生成9个日期对象，然后按时间升序排序（只排时间，不排日期）
        Date d1 = new Date(0);
        Date d2 = new Date(100, 1, 1);
        long start = d1.getTime();
        long end = d2.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss");

        Date[] dates = new Date[9];
        for (int i = 0; i < dates.length; i++) {
            long randomMilliSecond = (long) (Math.random() * (end - start) + start);
            Date date = new Date(randomMilliSecond);

            if (i == 0) {   // 边界情况特殊处理：数组空，无法做插入排序
                dates[i] = date;
            }
            for (int j = 0; j < i; j++) {

                if (sdf.format(date).compareTo(sdf.format(dates[j])) < 0) { // 新日期更小，则就地插入
                    System.arraycopy(dates, j, dates, j + 1, i - j);
                    dates[j] = date;
                    break;
                }
            }
            if (dates[i] == null) { // 边界情况特殊处理：新生成的比数组里所有的时间都大
                dates[i] = date;
            }

        }

        System.out.println(Arrays.toString(dates));
    }

    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(5000);
        System.out.println(d1.toString() + '\t' + d1.getTime());
        System.out.println(d2.toString() + '\t' + d2.getTime());

        System.out.println("--------------------------");
        Date d3 = new Date(95, 0, 1, 0, 0, 0);
        Date d4 = new Date(95, 11, 31, 23, 59, 59);
        long start = d3.getTime();
        long end = d4.getTime();

        long randomMilliSecond = (long) (Math.random() * (end - start) + start);    //在start和end中随机一个数，再转化为日期
        System.out.printf("%d %d %f %d", start, end, Math.random(), randomMilliSecond);
        Date randomDate = new Date(randomMilliSecond);
        System.out.println("1995年第1天：" + d3);
        System.out.println("1995年最后1天：" + d4);
        System.out.println("1995年随机一天：" + randomDate);

        System.out.println("--------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(d1));

        String str = "2019-9-26 15:29:35 173";
        try {
            d1 = sdf.parse(str);
            System.out.println(d1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("--------------------------");
        TestDate testDate = new TestDate();
        testDate.sortTime();

    }
}
