package com.neutech.demo8;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class MyFrame extends Frame {
// 继承的好处可以重写

    private Image img;

    // 重写一个构造函数，开发规范不允许在构造方法内写逻辑
    public MyFrame(){
        init();
    }

    private void init(){
        // 读取一张图片,MyFrame应该为自己对应的类名
        try {
            img = ImageIO.read(MyFrame.class.getClassLoader().getResourceAsStream("com/neutech/demo8/birds.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 设置窗口的尺寸
        setSize(320,180);
        // 设置居中
        setLocationRelativeTo(null);
        // 设置窗口不允许改变大小
        setResizable(false);
        // 禁止输入法
        enableInputMethods(false);
        // 设置显示状态
        setVisible(true);

        // 添加鼠标监听
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // 写代码实现鼠标点击的逻辑
                x++;
            }
        });

        // 通过多线程的方式刷新页面
        new  Thread() {
            @Override
            public void run() {
                while (true){
                    repaint();
                    // 利用线程睡眠
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

    int x = 5;
    int y = 31;

    int[] srcX = {9,9 + 34 + 18,9 + 34 + 18 + 34 +18};
    int srcY = 10;

    // 记录数组下标
    double index = 0;

    /**
     * 窗口上会显示什么全靠这个方法的逻辑
     */
    @Override
    public void paint(Graphics g) {
        // 保留图片原尺寸
//        g.drawImage(img,0,26,null);
        // 截取想要的大小
        //
        g.drawImage(img,x,y,x + 34,y + 24,srcX[(int) Math.floor(index)],10,srcX[(int) Math.floor(index)] + 34,10 + 24,null);
        index += 0.2;
        if (index >= 3){
            index = 0;
        }
        // 量取分割线
//        g.drawLine(0,26,100,26);
    }

    // 双缓冲技术解决刷新时屏幕闪烁
    Image offScreenImage = null;

    public void update(Graphics g) {
        if(offScreenImage == null) {
            offScreenImage = this.createImage(320, 180);
        }
        Graphics gOffScreen = offScreenImage.getGraphics();
        Color c = gOffScreen.getColor();
        gOffScreen.setColor(Color.white);
        gOffScreen.fillRect(0, 0,320, 180);
        gOffScreen.setColor(c);
        paint(gOffScreen);
        g.drawImage(offScreenImage, 0, 0, null);
    }

}
