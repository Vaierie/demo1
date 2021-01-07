package com.neutech.pop;

public class Point {

    //    12.31下
//    1、定义一个点类 Point,包含2个成员変量x、y分別表示x和y坐标,2个构造器 Point0
//    和 Point(intxOyO)以及一个 movepoint( int dx, int dy)方法实现点的位置移动,
//    创建两个 Pointy对象p1、p2,分别调用 movepoint方法后,打印p1和p2的坐标。必作题
    int x;
    int y;
    public Point(){
    }
    public Point(int x0,int y0){
        x = x0;
        y = y0;
        System.out.println(x);
        System.out.println(y);
    }
    public void movepoint(int dx,int dy){
        dx = dx + 10;
        dy = dy + 10;
        System.out.println("p1的坐标是："+dx);
        System.out.println("p1的坐标是："+dy);
    }

}
