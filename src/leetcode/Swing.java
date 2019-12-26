package leetcode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author lwc
 * @date 2019/12/26 10:43
 */
public class Swing {
    class Student{
        String id;
        String name;
        public Student(String id, String name){
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame("课程表查询");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel01 = new JPanel();
        panel01.add(new JLabel("学  号"));
        JTextField jTextField1 = new JTextField(20);
        panel01.add(jTextField1);

        JPanel panel02 = new JPanel();
        panel02.add(new JLabel("姓  名"));
        JTextField jTextField2 = new JTextField(20);
        panel02.add(jTextField2);

        JPanel panel03 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton jButton1 = new JButton("查询");
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Swing swing = new Swing();
                Student st = swing.help();
                jTextField1.setText(st.id);
                jTextField2.setText(st.name);
            }
        });
        panel03.add(jButton1);
        panel03.add(new JButton("删除"));
        panel03.add(new JButton("修改"));
        panel03.add(new JButton("增加"));


        Box vBox = Box.createVerticalBox();
        vBox.add(panel01);
        vBox.add(panel02);
        vBox.add(panel03);

        jf.setContentPane(vBox);

        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

    public Student help(){
        return new Student("2015300", "张三");
    }
}
