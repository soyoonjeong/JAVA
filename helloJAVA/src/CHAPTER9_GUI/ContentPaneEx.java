package CHAPTER9_GUI;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
    public ContentPaneEx(){
        setTitle("ContentPane과 JFrame 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 종료와 함께 응용프로그램 종료

        Container contentPane = getContentPane(); //컨텐트패인 알아내기
        contentPane.setBackground(Color.BLUE); //파랑색 배경 설정
        contentPane.setLayout(new FlowLayout()); //컨텐트패인에 FlowLayout 배치관리자 달기

        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ContentPaneEx();
    }

}
