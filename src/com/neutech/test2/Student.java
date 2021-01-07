package com.neutech.test2;

public class Student {

    String sno;
    String sname;
    String sex;
    int age;
    int midsemester;
    int finalExam;

    public void comprehensiveResults(){
        System.out.println("学号："+sno+"姓名："+sname+"性别："
                +sex+"年龄："+age+"综合成绩："+(midsemester*0.4+finalExam*0.6));
    }

}
