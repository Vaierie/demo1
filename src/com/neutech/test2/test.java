package com.neutech.test2;

public class test {
    public static void main(String[] args) {

        EnglishStudent e = new EnglishStudent();
        e.sname = "zhang";
        e.sno = "2018764178";
        e.sex = "女";
        e.age = 18;
        e.speech = 75;
        e.midsemester = 86;
        e.finalExam = 89;
        studentInformation(e);
        ComputerStudent c = new ComputerStudent();
        c.sname = "chen";
        c.sno = "2018764198";
        c.sex = "男";
        c.age = 20;
        c.operationAbility = 86;
        c.englishWriting = 79;
        c.midsemester = 82;
        c.finalExam = 81;
        studentInformation(c);

    }
    public static void studentInformation(Student s){
        s.comprehensiveResults();
    }
}
