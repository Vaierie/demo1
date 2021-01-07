package com.neutech.pop;

public class Rectangle {

//    2、定义一个矩形类 Rectangle:(知识点:对象的创建和使用)[必做题
//    2.1定义三个方法: getareao求面积、 getper()求周长, showall()分别在控制台输出长、宽、面积周长。
//    2.2有2个属性:长 length、宽 width
//    2.3通过构造方法 Rectangle(int width, int length),分别给两个属性赋值
//    2.4创建一个 Rectangle对象,并输出相关信息

    private int length;
    private int width;
    Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    public int  getarea(){
        return length * width;
    }
    public int getper(){
        return (length + width)*2;
    }
    public void showAll(){
        System.out.println("长为："+length);
        System.out.println("宽为："+width);
        System.out.println("周长为："+getper());
        System.out.println("面积为："+getarea());
    }

}
