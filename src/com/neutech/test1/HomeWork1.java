package com.neutech.test1;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        1.企业发放的奖金根据利润提成。
//        利润低于或等于10万元时,奖金可提10%;利润高于10万元,
//        低于20万元时,低于10万元的部分按10%提成,高于10万元的部分,可提成7.5%:
//        20万到40万之间时,高于20万元的部分,可提成5%;
//        40万到60万之间时高于40万元的部分,可提成3%:60万到100万之间时,
//        高于60万元的部分,可提成1.5%,高于100万元时,超过100万元的部分按1%提成,
//        在程序中设定一个变量为当月利润,求应发放奖金总数?(知识点:条件语句)[必做题]
//        System.out.print("请输入利润值（单位：万元）：");
//        double li = input.nextDouble();
//        System.out.print("应发奖金总数（单位：万元）：");
//        if (li <= 10){
//            System.out.println((li*0.1));
//        }else if (li < 20){
//            System.out.println(10*0.1+(li-10)*0.075);
//        }else if (li <= 40){
//            System.out.println(20*0.1+(li-20)*0.05);
//        }else if (li <= 60){
//            System.out.println(40*0.1+(li-40)*0.03);
//        }else if (li <= 100){
//            System.out.println(40*0.1+(li-60)*0.015);
//        }else {
//            System.out.println(100*0.1+(li-100)*0.01);
//        }
//        2、给定一个成绩a,
//        使用 switch结构求出a的等级。
//        A:90-100,B:80-89,C:70-79,D:60-69,E:0~59(知识点:条件语句 switch)[必做题
//        System.out.print("请输入一个成绩（0~100）：");
//        int score = input.nextInt();
//        switch (score/10){
//            case 10:
//                System.out.println("A");
//                break;
//            case 9:
//                System.out.println("A");
//                break;
//            case 8:
//                System.out.println("B");
//                break;
//            case 7:
//                System.out.println("C");
//                break;
//            case 6:
//                System.out.println("D");
//                break;
//            default:
//                System.out.println("E");
//        }

//        3、假设某员工今年的年薪是30000元,年薪的年增长率6%。
//        编写一个Java应用程序计算该员工10年后的年薪,并统计未来10年(从今年算起)总收入。
//        (知识点:循环语句for)[选做题
//        double salary = 30000;
//        for (int i =0;i < 10;i++)
//        4、猴子第一天摘下若干个桃子,当即吃了一半,还不瘾,又多吃了一个,
//        第二天早上又将剩下的桃子吃掉一半,又多吃了一个。
//        以后每天早上都吃了前一天剩下的一半零一个。
//        到第10天早上想再吃时,见只剩下一个桃子了。求第一天共摘了多少。
//        (知识点:循环语句 while)「选做题
//        int day = 9,peach=1;
//        while (day > 0){
//            peach = (peach + 1) * 2;
//            day--;
//        }
//        System.out.println(peach);
//        5、输入一个数字,判断是一个奇数还是偶数(知识点:条件语句)[必做题

//        while (true){
//            System.out.print("请输入一个需要判断的数字：");
//            int number = input.nextInt();
//            if (number % 2 == 0){
//                System.out.println(number + "为偶数！");
//            }else {
//                System.out.println(number + "为奇数！");
//            }
//        }
//        6、编写程序,判断一个变量x的值,如果是1,输出x=1,如果是5,输出x=5,如果是10,输出x=10,
//        除了以上几个值,都输出x=none。(知识点:条件语句)[必做题
//        while (true){
//            System.out.print("请输入一个需要判断的变量：");
//            int number = input.nextInt();
//            if (number == 1||number == 5||number == 10){
//                System.out.println("x=" + number);
//            }else {
//                System.out.println("x=none");
//            }
//        }

//        7、判断一个数字是否能被5和6同时整除(打印能被5和6整除),或只能被5整除(打印能被5整除),
//        或只能被6整除,(打印能被6整除),不能被5或6整除,(打印不能被5或6整除)
//        (知识点:条件语句)[必做题
//        int numebr = input.nextInt();
//        if (numebr % 5 != 0 && numebr % 6 != 0){
//            System.out.println();
//        }
//        8、输入一个年份,判断这个年份是否是闰年(知识点:条件、循环语句)[必做题]
//        int year = input.nextInt();
//        if (year % 400 == 0){
//            System.out.println("闰年");
//        }else if (year % 4 == 0 && year %100 != 0){
//            System.out.println("闰年");
//        }else {
//            System.out.println("不是闰年");
//        }
//        9、输入一个0~100的分数,如果不是0~100之间,打印分数无效,根据分数等级打印A,B,C,D,E
//        (知识点:条件语句 if else if)[必做题]
//        10、输入三个整数x，y,z,请把这三个数由小到大输出(知识点:条件语句)[必做题
//        int x = 1,y = 5,z = 65;
//        if (x < y && y) {
//            System.out.println("xyz");
//        }else if (x < y && z < y){
//            System.out.println("xzy");
//        }
//        11、有一个不多于5位的正整数,求它是几位数,分别打印出每一位数字。(知识点:条件语句)[必做题
//        12、编写一个程序,计算邮局汇款的汇费。如果汇款金额小于100元,汇费为一元,
//        如果金额在100元与5000元之间,按1%收取汇费,如果金额大于5000元,汇费为50元。
//        汇款金额由命令行输入。(知识点:条件语句)[选做题]
//        13、分别使用for循环, while循环,do循环求1到100之间所有能被3整除的整数的和。
//        (知识点循环语句)[选做题
        int sum = 0;
        for (int i = 0; i< 101; i++){
            if (i % 3 ==0){
                sum+=i;
            }
        }
        System.out.println(sum);
//        14、输出0-9之间的数,但是不包括5。[选做题
//        15、编写一个程序,求整数n的阶乘,例如5的阶乘是1*2*3*4*5[选做题
//        16、编写一个程序,找出大于200的最小的质数选做题]
//        17、由命令行输入一个4位整数,求将该数反转以后的数,如原数为1234,
//        反转后的数位4321[选做题

    }

}
