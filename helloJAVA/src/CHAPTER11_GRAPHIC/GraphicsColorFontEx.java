package CHAPTER11_GRAPHIC;

import javax.swing.*;
import java.awt.*;

public class GraphicsColorFontEx extends JFrame {
    public GraphicsColorFontEx(){
        setTitle("문자열, Color, Font 사용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanelFortwo());
        setSize(500,500);
        setVisible(true);
    }
    class MyPanelFortwo extends JPanel{
        @Override
        public void paintComponents(Graphics g) {
            super.paintComponents(g);
            g.setColor(Color.BLUE);
            g.drawString("자바가 정말 재밌다!",30,30);
            g.setColor(new Color(255,0,0));
            g.setFont(new Font("Arial", Font.ITALIC,30));
            g.drawString("How much?",30,70);
            g.setColor(new Color(0x00ff00ff));
            for(int i=1; i<=4; i++) {
                g.setFont(new Font("Jokerman",Font.ITALIC,i*10));
                g.drawString("This much",30,70+i*40);
            }

        }
    }

    public static void main(String[] args) {
        new GraphicsColorFontEx();
    }
}