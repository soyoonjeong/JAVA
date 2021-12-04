package CHAPTER10_COMPONENT;

import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame {
    public TextFieldEx(){
        super("텍스트필드 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("이름"));
        c.add(new JTextField(20));
        c.add(new JLabel("학과"));
        c.add(new JTextField("데이터사이언스학과",20));
        c.add(new JLabel("주소"));
        c.add(new JTextField("서울 성동구",20));

        setSize(280,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldEx();
    }
}
