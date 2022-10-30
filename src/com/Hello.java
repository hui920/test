package com;

import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        float weight = s.nextFloat();
//        float height = s.nextFloat();
//        float bmi = weight/(height*height);
//        System.out.println("当前的bmi为："+bmi);
//        if (bmi<18.5){
//            System.out.println("轻");
//        }else if(18.5<=bmi && bmi<=24)
//            System.out.println("正");
//        else if (24<=bmi && bmi <=27)
//            System.out.println("重");

//        int year =s.nextInt();
//        if ((0==year%4 &&0!=year%100) || (0==year%400))
//            System.out.println(year+"是闰年");
//        else {
//            System.out.println("不是闰年");
//        }
//        int yue = s.nextInt();
//        switch(yue){
//            case 1,2,3,4:
//                System.out.println("春天");
//                break;
//            case 5,6,7,8:
//                System.out.println("夏天");
//                break;
//            default:
//                System.out.println();
//        }
//        for (int i =1;i<100;i++){
//            if(0==i%3 || 0==i%5){
//                continue;
//            }
//            System.out.println(i);
//        }
//        int p=s.nextInt();
//        System.out.println("本金是："+p);
//        double r=s.nextDouble();
//        System.out.println("年利率是："+r);
//        int n=s.nextInt();
//        System.out.println("存了"+n+"年");
//        double m=Math.pow((1+r),n);
//        double f= p*m;
//        System.out.println("福利得到："+f);

//        int fundPerMonth = 1000;
//        int fundPerYear = fundPerMonth *12;
//        float rate = 0.20f;
//        //F = p* ( (1+r)^n );
//        int sum = 0;
//        int target = 1000*1000;
//        for (int j = 1; j < 100; j++) {
//            int year = j;
//            float compoundInterestRate = 1;
//            for (int i = 0; i < year; i++) {
//                compoundInterestRate = compoundInterestRate * (1+rate);
//            }
//            int compoundInterest = (int) (fundPerYear * compoundInterestRate);
//
//            sum +=compoundInterest;
//            System.out.println("经过" + year + " 年， 总收入 " + sum);
//            if(sum>=target){
//                System.out.println("一共需要" + year + "年，累计收入超过" + target );
//                break;
//            }
//        }






            //打印单数

//double min=100;
//        for (int i = 1; i < 20; i++) {
//
//            for (int j = 1; j < 20; j++) {
//
//                if(0==i%2 && 0==j%2)
//                    continue;
//                    double h1=i/j;
//                    double min1=h1-0.618;
//
//                    if(min1<min){
//                        double zhuan;
//                        min=min1;
//                    }
//            }
//
//        }
//        System.out.println(min);

//        int[]a=new int[5];
//        a[0]=1;
//        a[1]=2;
//        a[2]=3;
//        a[3]=4;
//        a[4]=5;
//        System.out.println(a.length);


//        int[]b=new int[5];
//        for (int i=0;i < b.length;i++){
//            b[i]=(int) (Math.random()*100);
//            System.out.println(b[i]);
//        }
//        int min=100;
//        for (int i=0;i<b.length;i++){
//            if (b[i]<min){
//                min=b[i];
//            }
//        }
//        System.out.println("最小值是："+min);



//        int[]a=new int[]{100,102,11,45};
//String[]b={"fsfs","dfsd","454"};
//int[]c={12,55,99,33};



//        int[]a=new int[5];
//        for (int i=0;i<a.length;i++){
//            a[i]=(int) (Math.random()*100);
//            System.out.println(a[i]);
//        }
//        System.out.println("数组长度："+a.length);
//        for (int i =0;i<=a.length/2;i++){
//            int z=a[i];
//            a[i]=a[a.length-i-1];
//            a[a.length-i-1]=z;
//        }
//        for (int b:a){
//            System.out.println(b);
//        }

//        int a [] = new int[]{18,62,68,82,65,9};
//        //排序前，先把内容打印出来
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println(" ");
//        //选择法排序
//
//
//
//        //可以发现一个规律
//        //移动的位置是从0 逐渐增加的
//        //所以可以在外面套一层循环
//
//        for (int j = 0; j < a.length-1; j++) {
//            for (int i = j+1; i < a.length; i++) {
//                if(a[i]<a[j]){
//                    int temp = a[j];
//                    a[j] = a[i];
//                    a[i] = temp;
//                }
//            }
//        }
//
//        //把内容打印出来
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println(" ");





//        int[]a=new int[5];
//        for (int i=0;i<a.length;i++){
//            a[i]=(int) (Math.random()*90+10);
//            System.out.print(a[i]+" ");
//        }
//        for (int j=1;j<a.length-1;j++){
//            for (int i=1;i<a.length;i++){
//                if (a[i-1]>a[i]){
//                    int z=a[i-1];
//                    a[i-1]=a[i];
//                    a[i]=z;
//                }
//            }
//        }
//        for (int b:a){
//            System.out.println(b);
//        }




//        int a[] = new int[(int) (Math.random() * 5)+5];
//        for (int i = 0; i < a.length; i++)
//            a[i] = (int) (Math.random() * 100);
//        int b[] = new int[(int) (Math.random() * 5)+5];
//        for (int i = 0; i < b.length; i++)
//            b[i] = (int) (Math.random() * 100);
//
//        System.out.println("数组a的内容:");
//        for (int i : a) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        System.out.println("数组b的内容:");
//        for (int i : b) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//
//        int[]c=new int[a.length+b.length];
//        System.arraycopy(a,0,c,0,a.length);
//        System.arraycopy(b,0,c,a.length,b.length);
//        for (int each:c){
//            System.out.print(each+" ");
//        }



//
//int[][]a=new int[5][5];
//for (int i =0;i<a.length;i++){
//    for (int j = 0;j<a[i].length;j++){
//        a[i][j]=(int) (Math.random()*100);
//    }
//}
//for (int[] row:a){
//    for (int each:row){
//        System.out.print(each+" ");
//    }
//    System.out.println();
//}
//
//int max=-1;
//int t_i=-1;
//int t_j=-1;
//for (int i=0;i<a.length;i++){
//    for (int j=0;j<a[i].length;j++){
//        if (a[i][j]>max){
//            max=a[i][j];
//            t_i=i;
//            t_j=j;
//        }
//    }
//}
//        System.out.println("最大值："+max);
//        System.out.println("坐标："+t_i+t_j);




//        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
//        System.out.println("排序之前 :");
//        System.out.println(Arrays.toString(a));
//        Arrays.sort(a);
//        System.out.println("排序之后:");
//        System.out.println(Arrays.toString(a));
//
//        int[]a1={12,54,66,788};
//
//        Arrays.sort(a1);
//
//        System.out.println(Arrays.toString(a1));



//        int[][]a={{12,45,88,11},
//                {123,456,4894,456},
//                {15,88,77}};
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));







        int a[][] = new int[5][8];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println("打印二维数组");
        for (int[] i : a) {
            System.out.println(Arrays.toString(i));
        }

        // 把二维数组复制到一维数组
        int b[] = new int[a.length * a[0].length];
        for (int i = 0; i < a.length; i++) {
            System.arraycopy(a[i], 0, b, i * a[i].length, a[i].length);
        }
        // 对一维数组进行排序
        Arrays.sort(b);
        // 把一维数组复制到二维数组
        for (int i = 0; i < a.length; i++) {
            System.arraycopy(b, a[i].length * i, a[i], 0, a[i].length);
            System.out.println(a[i].length);
        }
        System.out.println("打印排序后的二维数组");
        for (int[] i : a) {
            System.out.println(Arrays.toString(i));
        }








    }



}
