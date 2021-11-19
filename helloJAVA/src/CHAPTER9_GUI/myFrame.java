package CHAPTER9_GUI;

import javax.swing.*;

public class myFrame extends JFrame{
    public myFrame(){
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,30);
        setVisible(true);
    }

    public static void main(String[] args) {
        myFrame mf = new myFrame();
    }
}

