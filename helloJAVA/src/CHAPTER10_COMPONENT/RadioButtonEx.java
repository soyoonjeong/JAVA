package CHAPTER10_COMPONENT;

import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
    public RadioButtonEx(){
        super("라디오버튼 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= getContentPane();
        c.setLayout(new FlowLayout());

        ButtonGroup group = new ButtonGroup();

        JRadioButton buttons[] = new JRadioButton[3];
        String names [] = {"사과","배","체리"};
        for(int i=0; i<3; i++){
            buttons[i] = new JRadioButton(names[i]);
            group.add(buttons[i]);
            c.add(buttons[i]);
        }
        setSize(250,150);
        setVisible(true);

    }

    public static void main(String[] args) {
        new RadioButtonEx();
    }
}
