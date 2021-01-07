package com.neutech.test1;

import java.util.Scanner;

public class HomeWork2 {
    // 12.31

//    1、编写ー个方法,求整数n的阶乘,例如5的阶乘是1*2*3*4*5。[必做题
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.print("请输入一个整数：");
//        int number = input.nextInt();
//        int x = jiecheng(number);
//        System.out.println(number+"的阶乘是："+x);

//        System.out.print("请输入需要判断的年份：");
//        int yearnumber = input.nextInt();
//        String x = year(yearnumber);
//        System.out.println(yearnumber+"是"+x);

//        int x =prime();
//        System.out.println("大于200的最小的质数为："+x);

        int x[] = a();
        for (int i = 0;i < x.length;i++){
            System.out.println(x[i]);
        }


    }
    public static int jiecheng(int x){
        int result = 1;
        for (int i = 1;i <= x;i++){
            result = result * i;
        }
        return result;
    }
//    2、编写一个方法,判断该年份是平年还是闰年必做题
    public static String year(int x){
        String str = "平年";
        if (x % 400 == 0){
            str = "闰年";
        }else if (x % 4 == 0 && x % 100 != 0){
            str = "闰年";
        }
        return str;
    }

//    3、编写一个方法,输出大于200的最小的质数选做题]
    public static int prime(){
        int n = 201;
        while (true) {
            boolean b = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) b = false;
            }
            if (b)
                break;
            n++;
        }
        return n;
}

//    4、写一个方法,功能:定义一个一维的int数组,长度任意,
//    然后将它们按从小到大的顺序输出(使用冒泡排序)(知识点:方法的定义和访问。[选做题]
    public static int[] a (){
        int arr[] = {14,58,36,4,47};
        int m,i,j,n=arr.length;
        for(i = 0;i < n-1;i++)
            for(j = 0;j < n-1-i;j++)
                if(arr[j] > arr[j+1])
                {
                    m = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = m;
                }
        return arr;
    }


}
