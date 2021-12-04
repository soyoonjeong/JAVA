package CHAPTER11_GRAPHIC;

import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame {
    public paintJPanelEx(){
        setTitle("JPanel의 paintComponent() 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(500,250);
        setVisible(true);
    }
    class MyPanel extends JPanel{
        @Override
        public void paintComponents(Graphics g) {
            super.paintComponents(g);
            g.setColor(Color.RED);
            g.drawRect(10,10,50,50);
            g.setColor(Color.YELLOW);
            g.drawRect(50,50,50,50);
            g.setColor(Color.GREEN);
            g.drawRect(90,90,50,50);
        }
    }

    public static void main(String[] args) {
        new paintJPanelEx();
    }
}
