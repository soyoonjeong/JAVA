package CHAPTER11_GRAPHIC;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame {
    public GraphicsDrawImageEx1(){
        setTitle("원본 크기로 원하는 위치에 이미지 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanelForFive());
        setSize(300,400);
        setVisible(true);
    }
    class MyPanelForFive extends JPanel{
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            ImageIcon icon = new ImageIcon("C:/images/apple.png");
            Image img = icon.getImage();
            g.drawImage(img, 20,20,this);
        }
    }

    public static void main(String[] args) {
        new GraphicsDrawImageEx1();
    }
}
