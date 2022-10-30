package com;

public class TestString {

//    public static void main(String[] args) {
//
//        System.out.println(foundDuplicated);
//        String[] ss = new String[100];
//        // 初始化
//        for (int i = 0; i < ss.length; i++) {
//            ss[i] = randomString(2);
//        }
//
//        // 打印
//        for (int i = 0; i < ss.length; i++) {
//            System.out.print(ss[i] + " ");
//            if (19 == i % 20)
//                System.out.println();
//        }
//
//        for (String s1 : ss) {
//            int repeat = 0;
//            for (String s2 : ss) {
//                if (s1.equalsIgnoreCase(s2)) {
//                    repeat++;
//                    if (2 == repeat) {
//                        // 当repeat==2的时候，就找打了一个非己的重复字符串
//
//                        putIntoDuplicatedArray(s1);
//                        break;
//                    }
//                }
//            }
//        }
//
//        System.out.printf("总共有 %d种重复的字符串%n", pos);
//        if (pos != 0) {
//            System.out.println("分别是：");
//            for (int i = 0; i < pos; i++) {
//                System.out.print(foundDuplicated[i] + " ");
//            }
//        }
//    }
//
//    static String[] foundDuplicated = new String[100];
//
//    static int pos;
//
//    private static void putIntoDuplicatedArray(String s) {
//        for (int i = 0; i < pos; i++){
//            if (foundDuplicated[i].equalsIgnoreCase(s))
//                return;
//        }
//
//        foundDuplicated[pos++] = s;
//    }
//
//    private static String randomString(int length) {
//        String pool = "";
//        for (short i = '0'; i <= '9'; i++) {
//            pool += (char) i;
//        }
//        for (short i = 'a'; i <= 'z'; i++) {
//            pool += (char) i;
//        }
//        for (short i = 'A'; i <= 'Z'; i++) {
//            pool += (char) i;
//        }
//        char cs[] = new char[length];
//        for (int i = 0; i < cs.length; i++) {
//            int index = (int) (Math.random() * pool.length());
//            cs[i] = pool.charAt(index);
//        }
////        System.out.println(cs);
//        String result = new String(cs);
//        return result;
//    }



    public static void main(String[] args) {
        int total = 10000;
        String s = randomString(10);
        StringBuffer sb = new StringBuffer();

        String str1 = "";
        long start = System.currentTimeMillis();

        for (int i = 0; i <total; i++) {
            str1+=s;
        }
        long end = System.currentTimeMillis();
        System.out.printf("使用字符串连接+的方式，连接%d次，耗时%d毫秒%n",total,end-start);
        total *=100;
        start = System.currentTimeMillis();
        for (int i = 0; i <total; i++) {
            sb.append(s);
        }
        end = System.currentTimeMillis();
        System.out.printf("使用StringBuffer的方式，连接%d次，耗时%d毫秒%n",total,end-start);

    }

    private static String randomString(int length) {
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }
}