import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab7_3 implements ActionListener {
    JLabel numberLabel;
    JTextField numberField;
    JButton btn1, btn2, btn3,b4,b5,b6,b7,b8,b9,b0,bc,bp,bd,sum,bk,bh;
    JFrame window;

    public Lab7_3() {
        // obtain content pane and set its layout to FlowLayout
        window = new JFrame("Programm Show Text");
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());
        // create numberLabel and attach it to content pane
        numberLabel = new JLabel("Show Number : ");
        container.add(numberLabel);
        numberField = new JTextField(10);
        // numberField.setEditable( false );
        container.add(numberField);
        btn1 = new JButton(" 1 ");
        btn1.addActionListener(this);
        container.add(btn1);
        btn2 = new JButton(" 2 ");
        btn2.addActionListener(this);
        container.add(btn2);
        btn3 = new JButton(" 3 ");
        btn3.addActionListener(this);
        container.add(btn3);
        b4 = new JButton(" 4 ");
        b4.addActionListener(this);
        container.add(b4);
        b5 = new JButton(" 5 ");
        b5.addActionListener(this);
        container.add(b5);
        b6 = new JButton(" 6 ");
        b6.addActionListener(this);
        container.add(b6);
        b7 = new JButton(" 7 ");
        b7.addActionListener(this);
        container.add(b7);
        b8 = new JButton(" 8 ");
        b8.addActionListener(this);
        container.add(b8);
        b9 = new JButton(" 9 ");
        b9.addActionListener(this);
        container.add(b9);
        b0 = new JButton(" 0 ");
        b0.addActionListener(this);
        container.add(b0);
        bp = new JButton(" + ");
        bp.addActionListener(this);
        container.add(bp);
        bd = new JButton(" - ");
        bd.addActionListener(this);
        container.add(bd);
        bk = new JButton(" * ");
        bk.addActionListener(this);
        container.add(bk);
        bh = new JButton(" / ");
        bh.addActionListener(this);
        container.add(bh);
        bc = new JButton(" C ");
        bc.addActionListener(this);
        container.add(bc);
        window.setSize(240, 120);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        String str = numberField.getText();
        if (event.getSource() == btn1) {
            str += "1";
            numberField.setText(str);
        } else if (event.getSource() == btn2) {
            str += "2";
            numberField.setText(str);
        } else if (event.getSource() == btn3) {
            str += "3";
            numberField.setText(str);
        }else if (event.getSource() == b4) {
            str += "4";
            numberField.setText(str);
        }else if (event.getSource() == b5) {
            str += "5";
            numberField.setText(str);
        }else if (event.getSource() == b6) {
            str += "6";
            numberField.setText(str);
        }else if (event.getSource() == b7) {
            str += "7";
            numberField.setText(str);
        }else if (event.getSource() == b8) {
            str += "8";
            numberField.setText(str);
        }else if (event.getSource() == b9) {
            str += "9";
            numberField.setText(str);
        }else if (event.getSource() == b0) {
            str += "0";
            numberField.setText(str);
        }else if (event.getSource() == bc) {
            str = " ";
            numberField.setText(str);
        }
    } // end method actionPerformed

    public static void main(String[] args) {
        Lab7_3 gui = new Lab7_3();
    }
}