
// File Name : Lab11_03.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class Lab11_03 extends JFrame implements ActionListener {
    Timer swTimer;
    JTextField tf;
    Container con;
    String str;

    public Lab11_03() {

        super("Program Using Timer");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        tf = new JTextField(20);
        c.add(tf);
        swTimer = new Timer(1000, this);
        swTimer.start();
    }

    public void fillOval() {
        
    }

    public void fill() {
        
    }

    public void paint(Graphics g) {
        super.paint(g);
        int x = 20 + (int) (Math.random() * 450);
        int y = 20 + (int) (Math.random() * 270);
        int Red = (int) (Math.random() * 256);
        int Green = (int) (Math.random() * 256);
        int Blue = (int) (Math.random() * 256);
        g.setColor(new Color(Red, Green, Blue));
        if (str.equals("DrawOval")) {
            g.drawOval(x, y, 20, 20);
        }else if(str.equals("fillOval")){
            g.fillOval(x, y, 20, 20);
        }else if(str.equals("DrawRect")){
            g.drawRect(x, y, 20, 20);
        }else if(str.equals("FillRect")){
            g.fillRect(x, y, 20, 20);
        }else{
            tf.setText(str);
        }
       
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == swTimer) {
            repaint();   
        }
        else if(event.getSource() == tf){
            String str = tf.getText();
            if (str.equals("DrawOval")) {
                
            }
        }
    }

    public static void main(String[] args) {
        Lab11_03 test = new Lab11_03();
        test.setSize(480, 300);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}