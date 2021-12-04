package CHAPTER9_EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static java.awt.event.KeyEvent.*;

public class FlyingTextEx extends JFrame{
    private JLabel la = new JLabel("SOYOON");
    public FlyingTextEx(){
        super("상하좌우 키를 이용하여 텍스트 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        la.setLocation(50,50);
        la.setSize(100,30);
        c.add(la);
        c.addKeyListener(new MyKeyListener());

        c.setFocusable(true);
        c.requestFocus();

        setSize(200,200);
        setVisible(true);
    }
    class MyKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            int x = la.getX();
            int y = la.getY();
            switch(e.getKeyCode()){
                case VK_LEFT:
                    la.setLocation(x-10,y);
                    break;
                case VK_RIGHT:
                    la.setLocation(x+10, y);
                    break;
                case VK_UP:
                    la.setLocation(x, y-10);
                    break;
                case VK_DOWN:
                    la.setLocation(x, y+10);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new FlyingTextEx();
    }
}
