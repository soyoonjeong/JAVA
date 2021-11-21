package CHAPTER10_EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharEx extends JFrame{
    private JLabel la = new JLabel("<Enter>키를 입력하면 색이 바뀝니다.");
    public KeyCharEx(){
        super("KeyListener의 문자 키 입력 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.add(la);
        c.setLayout(new FlowLayout());
        c.addKeyListener(new myKeyListener());

        setSize(500,500);
        setVisible(true);
        c.setFocusable(true); //컨텐트패인이 포커스를 받을 수 있도록 설정
        c.requestFocus(); //컨텐트패인이 포커스 설정
    }
   class myKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            int r = (int)(Math.random()*256);
            int g = (int)(Math.random()*256);
            int b = (int)(Math.random()*256);

            switch(e.getKeyChar()){
                case '\n':
                    la.setText("r="+r+", g="+g+", b="+b);
                    getContentPane().setBackground(new Color(r,g,b));
                    break;
                case 'q':
                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new KeyCharEx();
    }
}
