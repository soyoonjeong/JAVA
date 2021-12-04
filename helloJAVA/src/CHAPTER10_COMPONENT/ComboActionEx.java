package CHAPTER10_COMPONENT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboActionEx extends JFrame {

    private String[] fruits = {"apple","banana","mango"};
    private ImageIcon [] images = {new ImageIcon("C:/images/apple.png"),
            new ImageIcon("C:/images/banana.png"),
            new ImageIcon("C:/images/mango.png")};
    private JLabel imgLabel = new JLabel(images[0]);

    public ComboActionEx(){
        super("콤보박스 활용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JComboBox<String>combo = new JComboBox<String>(fruits);
        c.add(combo);
        c.add(imgLabel);

        combo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> cb = (JComboBox<String>)e.getSource();
                int index = cb.getSelectedIndex();
                imgLabel.setIcon(images[index]);
            }
        });
        setSize(500,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboActionEx();
    }
}
