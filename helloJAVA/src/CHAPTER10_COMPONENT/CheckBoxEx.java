package CHAPTER10_COMPONENT;

import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
    public CheckBoxEx(){
        super("체크박스 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JCheckBox spring = new JCheckBox("봄");
        JCheckBox summer = new JCheckBox("여름");
        JCheckBox fall = new JCheckBox("가을");
        JCheckBox winter = new JCheckBox("겨울");

        c.add(spring); c.add(summer); c.add(fall); c.add(winter);
        setSize(250,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxEx();
    }
}
