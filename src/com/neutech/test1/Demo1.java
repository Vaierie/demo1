package com.neutech.test1;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        // 在java中如何通过控制台输入
        // input就是输入工具
        Scanner head = new Scanner(System.in);
        Scanner foot = new Scanner(System.in);
        // 控制台等待输入，输入内容会被转化为int类型，阻塞作用
//        int i = input.nextInt();
//        System.out.println(i);
        //鸡兔同笼问题
        //利用输入头和脚的个数
        //计算结果输出鸡和兔子的数量
        System.out.println("请输入头的个数：");
        int h = head.nextInt();
        System.out.println("请输入脚的个数：");
        int f = foot.nextInt();
//        第一种方法：
//        int r;
//        for (r=0;r<=h;r++)
//        {
//            if ((r*4)+((h-r)*2)==f)
//                break;
//        }
//        System.out.println("兔子的数量为"+r);
//        System.out.println("鸡的数量为"+(h-r));
//        int y = (foot - (2 * head)) / 2;
//        int x = head - y;
//        System.out.println("兔子的数量为"+y);
//        System.out.println("鸡的数量为"+x);
    }

}
