package CHAPTER11_GRAPHIC;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx2 extends JFrame {
    public GraphicsDrawImageEx2(){
        setTitle("패널의 크기에 맞추어 이미지 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanelForSix());
        setSize(300,400);
        setVisible(true);
    }
    class MyPanelForSix extends JPanel{
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            ImageIcon icon = new ImageIcon("C:/images/apple.png");
            Image img = icon.getImage();
            g.drawImage(img, 20,20,getWidth(), getHeight(),this);
        }
    }

    public static void main(String[] args) {
        new GraphicsDrawImageEx2();
    }
}
