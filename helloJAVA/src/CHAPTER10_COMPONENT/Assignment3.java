package CHAPTER10_COMPONENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Assignment3 extends JFrame{
    private int idx = 0;
    private String images[] = {"봄.png","여름.jpg","가을.jpg","겨울.jpg"};
    private ImageIcon img = new ImageIcon("C://images//"+images[0]); // 계절 이미지
    private JLabel imageLabel = new JLabel(img);

    private ImageIcon leftIcon = new ImageIcon("C://images//left-arrow.png");
    private ImageIcon rightIcon = new ImageIcon("C://images//right-arrow.png");
    private JButton leftBtn = new JButton(leftIcon); //왼쪽 화살표 버튼
    private JButton rightBtn = new JButton(rightIcon); //오른쪽 화살표 버튼

    public Assignment3(){
        setTitle("과제 3_20011818 정소윤");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(imageLabel, BorderLayout.CENTER); // CENTER : 계절 이미지

        MenuPanel menu = new MenuPanel();
        c.add(menu, BorderLayout.SOUTH); // SOUTH : 화살표 메뉴

        setSize(700,700);
        setVisible(true);
    }
    class MenuPanel extends JPanel{
        public MenuPanel(){
            setBackground(Color.BLACK);
            add(leftBtn); //버튼 달기
            add(rightBtn); //버튼 달기
            MyActionListener listener = new MyActionListener();
            leftBtn.addActionListener(listener);
            rightBtn.addActionListener(listener);
        }
    }
    class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==leftBtn){ //왼쪽 화살표일 때
                idx--;
                if(idx<0) idx = 3;
            } else{ //오른쪽 화살표일 때
                idx++;
                if(idx>3) idx = 0;
            }
            imageLabel.setIcon(new ImageIcon("C://images//"+images[idx])); //이미지 변경
        }
    }

    public static void main(String[] args) {
        new Assignment3();
    }
}
