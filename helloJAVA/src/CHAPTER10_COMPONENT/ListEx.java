package CHAPTER10_COMPONENT;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
    private String[] fruits = {"apple","banana","kiwi","mango","pear","peach",
    "berry","strawberry","blackberry"};
    private ImageIcon [] images = {new ImageIcon("C:/images/left-arrow.png"),
            new ImageIcon("C:/images/right-arrow.png")};
    public ListEx(){
        setTitle("리스트 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= getContentPane();
        c.setLayout(new FlowLayout());

        JList <String> strList = new JList<String>(fruits);
        JList <ImageIcon> imgList = new JList<ImageIcon>(images);
        //JList <ImageIcon> imgList = new JList<ImageIcon>();  이런방법도 있음!
        //imgList.setListData(images);
        JList <String> scrollList = new JList<String>(fruits);

        c.add(strList);
        c.add(imgList);
        c.add(new JScrollPane(scrollList));

        setSize(300,300);
        setVisible(true);


    }

    public static void main(String[] args) {
        new ListEx();
    }
}
