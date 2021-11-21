package CHAPTER10_EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// 익명 클래스로 Action 이벤트 리스너 만들기
public class AnonymousClassListener extends JFrame{
    public AnonymousClassListener(){
        setTitle("Action 이벤트 리스너 작성");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        JButton btn = new JButton("Action");
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                if(b.getText().equals("Action")){
                    b.setText("액션");
                }else{
                    b.setText("Action");
                }
            }
        });
        contentPane.add(btn);
        setSize(350,150);
        setVisible(true);    }

    public static void main(String[] args) {
        new AnonymousClassListener();
    }
}