package CHAPTER8_GUI;

import javax.swing.*;
import java.awt.*;
public class BorderLayoutEx extends JFrame{
    public BorderLayoutEx() {
        setTitle("BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(0,0));

        contentPane.add(new JButton("add"), BorderLayout.NORTH);
        contentPane.add(new JButton("sub"), BorderLayout.SOUTH);
        contentPane.add(new JButton("mul"), BorderLayout.WEST);
        contentPane.add(new JButton("div"), BorderLayout.EAST);
        contentPane.add(new JButton("Calculate"), BorderLayout.CENTER);

        setSize(300,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}
