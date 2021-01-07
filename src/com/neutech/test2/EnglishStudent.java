package com.neutech.test2;

public class EnglishStudent extends Student{
    int speech;

    @Override
    public void comprehensiveResults() {
        System.out.println("学号："+sno+"姓名："+sname+"性别："
                +sex+"年龄："+age+"综合成绩："+(midsemester*0.25+finalExam*0.25+speech*0.5));
    }
}
