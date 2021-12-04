package CHAPTER9_EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// 이벤트 리스너를 독립 클래스로 작성
public class MouseListenerEx extends JFrame{
    public JLabel la = new JLabel("Soyoon");
    public MouseListenerEx(){
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.addMouseListener(new myMouseListener());

        contentPane.setLayout(null);
        la.setLocation(100,100);
        la.setSize(80,20);
        contentPane.add(la);

        setSize(200,200);
        setVisible(true);
    }
    class myMouseListener implements MouseListener{
        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x,y);
        }
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
    }
    public static void main(String[] args) {
        new MouseListenerEx();
    }
}

