package CHAPTER10_COMPONENT;

import java.awt.*;
import javax.swing.*;
public class ButtonImageEx extends JFrame{
    public ButtonImageEx(){
        super("이미지 버튼 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon normalIcon = new ImageIcon("C:/images/겨울.jpg");
        ImageIcon rolloverIcon = new ImageIcon("C:/images/right-arrow.PNG");
        ImageIcon pressedIcon = new ImageIcon("C:/images/여름.jpg");

        JButton btn = new JButton("weather", normalIcon);
        btn.setRolloverIcon(rolloverIcon);
        btn.setPressedIcon(pressedIcon);

        c.add(btn);
        setSize(700,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ButtonImageEx();
    }

}
