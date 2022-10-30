package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

//    public static void main(String[] args) {
//        int yearStart = 1970;
//        int yearEnd = 2000;
//
//        Date[] ds = new Date[9];
//        for (int i = 0; i < ds.length; i++) {
//            ds[i] = getRandomDate(yearStart, yearEnd);
//        }
//
//        System.out.println("得到的随机日期数组:");
//        for (int i = 0; i < ds.length; i++) {
//            System.out.print(toString(ds[i])+"\t");
//            if(2==i%3)
//                System.out.println();
//        }
//
//        //选择法排序
//
//        for (int j = 0; j < ds.length-1; j++) {
//            for (int i = j+1; i < ds.length; i++) {
//                String strTimeI = toString(ds[i],"HHmmss");
//                String strTimeJ = toString(ds[j],"HHmmss");
//
//                int lTimeI = Integer.parseInt(strTimeI);
//                int lTimeJ = Integer.parseInt(strTimeJ);
//
//                if( lTimeI<lTimeJ  ){
//                    Date temp = ds[j];
//                    ds[j] = ds[i];
//                    ds[i] = temp;
//                }
//            }
//        }
//
//        System.out.println("排序后的随机日期数组:");
//        for (int i = 0; i < ds.length; i++) {
//            System.out.print(toString(ds[i])+"\t");
//            if(2==i%3)
//                System.out.println();
//        }
//
//    }
//
//    public static String toString(Date d) {
//        return toString(d, "yyyy-MM-dd HH:mm:ss");
//    }
//
//    public static String toString(Date d, String format) {
//        SimpleDateFormat sdf = new SimpleDateFormat(format);
//        return sdf.format(d);
//    }
//
//    private static Date getRandomDate(int yearStart, int yearEnd) {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
//        try {
//            Date dStart = sdf.parse(String.valueOf(yearStart)); // 1970
//            Date dEnd = sdf.parse(String.valueOf(yearEnd + 1)); // 2001 不是 2000，要在2001的基础上减少以毫秒，才表示2000最后一刻
//            long timeStart = dStart.getTime();
//            long timeEnd = dEnd.getTime() - 1;
//            long timeRandom = (long) (timeStart + Math.random() * (timeEnd - timeStart));
//            return new Date(timeRandom);
//
//        } catch (ParseException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//        return null;
//    }


//    public static void main(String[] args) {
//        Calendar c= Calendar.getInstance();
//        Date d =c.getTime();
//        Date d2=new Date(0);
//        c.setTime(d2);
//        System.out.println(d);
//        System.out.println(d2);
//        System.out.println(c);
//    }



    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();
        System.out.println(now);
        // 当前日期
        System.out.println("当前日期：\t" + format(c.getTime()));

        // 下个月的今天
        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天:\t" +format(c.getTime()));

        // 去年的今天
        c.setTime(now);
        c.add(Calendar.YEAR, -1);
        System.out.println("去年的今天:\t" +format(c.getTime()));

        // 上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DATE, 3);
        System.out.println("上个月的第三天:\t" +format(c.getTime()));

    }

    private static String format(Date time) {
        return sdf.format(time);
    }


}