package java中级.IO;

import java.io.File;
import java.util.Date;

public class 文件对象2 {
    public static void main(String[] args) {
        //步骤 2 : 文件常用方法1
        File f = new File("d:/LOLFolder/LOL.exe");
        System.out.println("当前文件是：" +f);
        //文件是否存在
        System.out.println("判断是否存在："+f.exists());

        //是否是文件夹
        System.out.println("判断是否是文件夹："+f.isDirectory());

        //是否是文件（非文件夹）
        System.out.println("判断是否是文件："+f.isFile());

        //文件长度
        System.out.println("获取文件的长度："+f.length());

        //文件最后修改时间
        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件的最后修改时间："+d);
        //设置文件修改时间为1970.1.1 08:00:00
        f.setLastModified(0);
        System.out.println("获取文件的最后修改时间："+d);
        //文件重命名
        File f2 =new File("d:/LOLFolder/DOTA.exe");
        f.renameTo(f2);
        System.out.println("把LOL.exe改名成了DOTA.exe");

        System.out.println("注意： 需要在D:\\LOLFolder确实存在一个LOL.exe,\r\n才可以看到对应的文件长度、修改时间等信息");
    }
}
