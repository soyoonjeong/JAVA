package CHAPTER11_GRAPHIC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class GraphicsDrawLineMouseEx extends JFrame {
    public GraphicsDrawLineMouseEx(){
        setTitle("마우스로 여러 개의 선 그리기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanelForEight());
        setSize(300,300);
        setVisible(true);
    }
    class MyPanelForEight extends JPanel{
        private Vector<Point> vStart = new Vector<Point>();
        private Vector<Point> vEnd = new Vector<Point>();
        public MyPanelForEight(){
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    Point startP = e.getPoint();
                    vStart.add(startP);
                }
                public void mouseReleased(MouseEvent e) {
                    Point endP = e.getPoint();
                    vEnd.add(endP);

                    repaint();
                }
            });
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            for(int i=0;i<vStart.size(); i++){
                Point s = vStart.elementAt(i);
                Point e = vEnd.elementAt(i);
                g.drawLine((int)s.getX(), (int)s.getY(),(int)e.getX(),(int)e.getY());
            }
        }
    }

    public static void main(String[] args) {
        new GraphicsDrawLineMouseEx();
    }
}
