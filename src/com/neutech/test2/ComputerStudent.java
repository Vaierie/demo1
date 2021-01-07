package com.neutech.test2;

public class ComputerStudent extends Student{
    int operationAbility;
    int englishWriting;

    @Override
    public void comprehensiveResults() {
        System.out.println("学号："+sno+"姓名："+sname+"性别：" +sex+"年龄："
                +age+"综合成绩："+(midsemester*0.2+finalExam*0.2+operationAbility*0.4+englishWriting*0.2));
    }
}
