package CHAPTER10_COMPONENT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuActionEventEx extends JFrame {
    private JLabel imgLabel = new JLabel();
    public MenuActionEventEx(){
        setTitle("Menu에 Action 리스너 만들기");
        createMenu();
        getContentPane().add(imgLabel, BorderLayout.CENTER);
        setSize(250,200);
        setVisible(true);

    }
    public void createMenu(){
        JMenuBar mb = new JMenuBar();
        JMenu screenMenu = new JMenu("Screen");
        String [] itemTitle = {"Load", "Hide","ReShow","Exit"};
        JMenuItem menuItem[] = new JMenuItem[4];
        MenuActionListener listener = new MenuActionListener();
        for(int i=0; i<4; i++){
            menuItem[i] = new JMenuItem(itemTitle[i]);
            menuItem[i].addActionListener(listener);
            screenMenu.add(menuItem[i]);
        }
        mb.add(screenMenu);
        setJMenuBar(mb);
    }
    class MenuActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            switch(cmd){
                case "Load":
                    if(imgLabel.getIcon()!=null)
                        return;
                    imgLabel.setIcon(new ImageIcon("C:/images/apple.PNG"));
                    break;
                case "Hide":
                    imgLabel.setVisible(false);
                    break;
                case "ReShow":
                    imgLabel.setVisible(true);
                    break;
                case "Exit":
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new MenuActionEventEx();
    }

}
