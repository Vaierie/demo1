package com.neutech.demo8;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class FrameDemo1 extends Frame {

    private Image img;

    public FrameDemo1(){
        init();
    }

    private void init() {

        try {
            img = ImageIO.read(FrameDemo1.class.getClassLoader().getResourceAsStream("com/neutech/demo8/birds.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 设置窗口的尺寸
        setSize(320, 180);
        // 设置居中
        setLocationRelativeTo(null);
        // 设置窗口不允许改变大小
        setResizable(false);
        // 禁止输入法
        enableInputMethods(false);
        // 设置显示状态
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(0,31,100,31);
//        g.drawImage(img,0,26,null);
    }
}
