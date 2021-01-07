package com.neutech.test1;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        // 12.30下
//        int i = 10;
//        i = i + 5;
//        i += 5;
//        System.out.println(i);
//        int y = 20;
//        char result = i > y ? 'a':'b';
//        i = i < 0 ? -i : i;
//        System.out.println(result);
        // 第一题
//        int x = 5,y = 10,temp;
//        temp = true ? x : y;
//        x = true ? y : x;
//        y = true ? temp : x;
//        System.out.println(x);
//        System.out.println(y);
//        int a = 10;
//        int b = 5;
//        a = a + b;
//        b = a - b;
//        a = a - b;
        // 第二题
//        Scanner number = new Scanner(System.in);
//        System.out.println("请输入一个0~1000的整数：");
//        int n = number.nextInt();
//        n = n / 1000 + n % 1000 / 100 + n % 100 / 10 + n % 10 / 1;
//        System.out.println(n);
        // 第三题
//        double h =  107.8,s = 35.6;
//        System.out.println(h+"华氏温度转换为摄氏温度为："+((h-32)*5)/9);
//        System.out.println(s+"摄氏温度转换为华氏温度为："+(s*9/5+32));
        // 第四题
//        Scanner c = new Scanner(System.in);
//        System.out.println("请输入一个大写字母：");
//        char ch = c.nextLine().charAt(0);
//        if (ch >= 65 && ch <=90){
//            ch = (char) (ch + 32);
//            System.out.println(ch);
//        } else {
//            System.out.println("输入不合法！");
//        }
        //递增三角形
//      for( int i=0;i<5;i++) {
//      for(int j=0;j<i+1;j++) {
//      System.out.print("*");
//      }
//      System.out.println();
//      }

        //递减三角形
//      for( int i=0;i<5;i++) {
//      for(int j=0;j<5-i;j++) {
//      System.out.print("*");
//      }
//      System.out.println();
//      }

//      for( int i=0;i<5;i++) {
//      for(int j=0;j<4-i;j++) {
//      System.out.print(" ");
//      }
//      for(int j=0;j<i+1;j++) {
//      System.out.print("*");
//      }
//      System.out.println();
//      }

//      for( int i=0;i<5;i++) {
//          for(int j=0;j<5;j++) {
//              if(i>=j) {
//                  System.out.print("*");
//              }else {
//                  System.out.print(" ");
//          }
//      }
//      System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j <= 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
