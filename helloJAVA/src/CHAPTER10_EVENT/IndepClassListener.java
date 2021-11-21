package CHAPTER10_EVENT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class IndepClassListener extends JFrame{
    public IndepClassListener(){
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener()); // Action 이벤트 리스너 등록
        contentPane.add(btn);

        setSize(250,120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new IndepClassListener();
    }
}
// 독립된 클래스로 이벤트 리스너를 작성한다.
class MyActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        JButton b = (JButton) e.getSource();
        if(b.getText().equals("Action")) {
            b.setText("액션");
        }else{
            b.setText("Action");
        }
    }
}
