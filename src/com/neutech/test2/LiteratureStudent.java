package com.neutech.test2;

public class LiteratureStudent extends Student{
    int speech;
    int works;

    @Override
    public void comprehensiveResults() {
        System.out.println("学号："+sno+"姓名："+sname+"性别："+sex+"年龄："+age
                +"综合成绩："+(midsemester*0.15+finalExam*0.15+speech*0.35+works*0.35));
    }
}
