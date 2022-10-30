package com;

import java.util.Scanner;

public class TestNumber<c1> {






    public static void main(String[] args) {

        char a='0';
        int i=(int)a;
        System.out.println(i);
        char a1='9';
        int i1=(int)a1;
        System.out.println(i1);
        char a2='a';
        int i2=(int)a2;
        System.out.println(i2);
        char a3='z';
        int i3=(int)a3;
        System.out.println(i3);
        char a4='A';
        int i4=(int)a4;
        System.out.println(i4);
        char a5='Z';
        int i5=(int)a5;
        System.out.println(i5);

        char[]cs=new char[5];
        for (int n =0;n<cs.length;n++){
            cs[n]=(char)(Math.random()*100+49);
        }
        for (char aa:cs){
            System.out.println(aa);
        }


    }
}
