package CHAPTER10_COMPONENT;
import java.awt.*;
import javax.swing.*;

public class LabelEx extends JFrame {
    public LabelEx(){
        setTitle("레이블 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel textLabel = new JLabel("11월 26일, 겨울이었다...");

        ImageIcon img = new ImageIcon("C:/images/겨울.jpg");
        JLabel imageLabel = new JLabel(img);

        ImageIcon icon = new ImageIcon("C:/images/right-arrow.PNG");
        JLabel label = new JLabel("다음 계절",icon,SwingConstants.CENTER);

        c.add(textLabel); c.add(imageLabel); c.add(label);
        setSize(300,600);
        setVisible(true);

    }

    public static void main(String[] args) {
        new LabelEx();
    }

}
