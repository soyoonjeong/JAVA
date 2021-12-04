package CHAPTER10_COMPONENT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxItemEventEx extends JFrame {
    private JCheckBox fruits[] = new JCheckBox[3];
    private int fruitsPrice[] = {100,500,20000};
    private String fruitsNames[] = {"사과","배","체리"};
    private int total = 0;
    private JLabel totalPrice;
    public CheckBoxItemEventEx(){
        super("체크박스와 ItemEvent 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        MyItemListener listener = new MyItemListener();
        JLabel label = new JLabel(fruitsNames[0]+" "+fruitsPrice[0]+"원, "+fruitsNames[1]+" "+fruitsPrice[1]+"원, "+fruitsNames[2]+" "+fruitsPrice[2]+"원");
        c.add(label);
        for(int i = 0; i<3; i++) {
            fruits[i] = new JCheckBox(fruitsNames[i]);
            fruits[i].setBorderPainted(true);
            c.add(fruits[i]);
            fruits[i].addItemListener(listener);
        }
        totalPrice = new JLabel("현재 "+total+"원 입니다.");
        c.add(totalPrice);
        setSize(250,200);
        setVisible(true);
    }
    class MyItemListener implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            int price =0;
            for(int i=0; i<3; i++){
                if(e.getItem()==fruits[i])
                    price = fruitsPrice[i];
            }
            if(e.getStateChange()==ItemEvent.SELECTED)
                total+=price;
            else if(e.getStateChange()==ItemEvent.DESELECTED)
                total-=price;
            totalPrice.setText("현재 "+total+"원 입니다.");
        }
    }

    public static void main(String[] args) {
        new CheckBoxItemEventEx();
    }
}
