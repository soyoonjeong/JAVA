package CHAPTER9_GUI;
import javax.swing.*;
import java.awt.*;
public class FlowLayoutEx extends JFrame{
    public FlowLayoutEx(){
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 종료와 응용프로그램 종료 동시에
        Container contentPane = getContentPane(); //컨텐트패인 알아내기
        // 가운데 정렬로 수평 간격을 30, 수직 간격을 40 픽셀로 배치하는 FlowLayout 생성
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 30,40));

        contentPane.add(new JButton("add"));
        contentPane.add(new JButton("sub"));
        contentPane.add(new JButton("mul"));
        contentPane.add(new JButton("div"));
        contentPane.add(new JButton("Calculate"));

        setSize(400,200); //프레임 크기 400x200 설정
        setVisible(true); //화면에 프레임 출력



    }

    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}