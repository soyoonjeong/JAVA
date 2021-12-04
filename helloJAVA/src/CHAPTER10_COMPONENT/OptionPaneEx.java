package CHAPTER10_COMPONENT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionPaneEx extends JFrame {
    public OptionPaneEx(){
        super("옵션 팬 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.add(new MyPanel());
        setSize(500,200);
        setVisible(true);

    }
    class MyPanel extends Panel{
        private JButton inputName = new JButton("Input Name");
        private JButton Confirm = new JButton("Confirm");
        private JButton Message = new JButton("Message");
        private JTextField blank = new JTextField(10);

        public MyPanel(){
            setBackground(Color.LIGHT_GRAY);
            add(inputName); add(Confirm); add(Message); add(blank);
            inputName.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = JOptionPane.showInputDialog("이름을 입력하세요");
                    if(name!=null)
                        blank.setText(name);
                }
            });
            Confirm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int result = JOptionPane.showConfirmDialog(null, "계속할 것입니까?",
                            "Confirm", JOptionPane.YES_NO_OPTION);
                    if(result==JOptionPane.YES_OPTION)
                        blank.setText("Yes");
                    else if(result==JOptionPane.CLOSED_OPTION)
                        blank.setText("Just Closed without Selection");
                    else
                        blank.setText("No");
                }
            });
            Message.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,"조심하세요",
                            "Message",JOptionPane.ERROR_MESSAGE);

                }
            });
        }
    }
    public static void main(String[] args) {
        new OptionPaneEx();
    }
}
