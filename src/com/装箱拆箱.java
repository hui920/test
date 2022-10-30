package com;

public class 装箱拆箱 {
    public static void main(String[] args) {
        byte b= 100;
        Byte bb=b;
        b=bb;
        short s=101;
        Short ss=s;
        s=ss;
        Float ff=10.1f;
        float f=ff;
        ff=f;
        int i=1;
        Integer ii=i;
        i=ii;
//        b=ii;
//        ii=b;
        System.out.println(Byte.MAX_VALUE);
    }
}
