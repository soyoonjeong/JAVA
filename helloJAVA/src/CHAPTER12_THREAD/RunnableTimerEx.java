package CHAPTER12_THREAD;

import javax.swing.*;
import java.awt.*;

class RunnableTimer implements Runnable{
    private JLabel timerLabel =  new JLabel();
    public RunnableTimer(JLabel timerLabel){
        this.timerLabel = timerLabel;
    }
    @Override
    public void run() {
        int n = 0;
        while(true){
            timerLabel.setText(Integer.toString(n));
            n++;
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                return;
            }
        }
    }
}


public class RunnableTimerEx extends JFrame {
    public RunnableTimerEx(){
        setTitle("Runnable을 구현한 타이버 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel= new JLabel();
        timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
        c.add(timerLabel);

        RunnableTimer runnable = new RunnableTimer(timerLabel);
        Thread th = new Thread(runnable);
        setSize(250,150);
        setVisible(true);
        th.start();


    }

    public static void main(String[] args) {
        new RunnableTimerEx();
    }
}
