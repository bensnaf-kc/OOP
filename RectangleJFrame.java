
// File Name : RectangleJFrame.java
import javax.swing.*;
import java.awt.*;

public class RectangleJFrame extends javax.swing.JFrame {
    int x, y;
    Rectangle rx[];
    Rectangle ry[];
    Rectangle rw[];
    Rectangle rh[];

    public RectangleJFrame() {
        super("Program Inheritance Rectangle");
        String input; // user's input
        // obtain user's choice
        input = JOptionPane.showInputDialog("Enter value x of left point : ");
        x = Integer.parseInt(input); // convert input to int
        input = JOptionPane.showInputDialog("Enter value y of left point : ");
        y = Integer.parseInt(input); // convert input to int
        int w = 10 + (int) (Math.random() * 280);
        int h = 10 + (int) (Math.random() * 180);
        // r = new Rectangle(x, y, w, h);
        rx = new Rectangle[5];
        for (int n = 0; n < rx.length; n++) {
             int x = 5 + (int) (Math.random() * 640);
             int y = 5 + (int) (Math.random() * 480);
            rx[n] = new Rectangle(x, y, w, h);
        }
        //
    } // end method init

    public void paint(Graphics g) {
        super.paint(g); // call paint method inherited
        for (int n =0; n < rx.length; n++){

            g.setColor(Color.ORANGE);
            g.drawRect(rx[n].getX(), rx[n].getY(), rx[n].getWidth(), rx[n].getHeight());
            // g.drawRect(ry[n].getX(), ry[n].getY(), ry[n].getWidth(), ry[n].getHeight());
            // g.drawRect(rw[n].getX(), rw[n].getY(), rw[n].getWidth(), rw[n].getHeight());
            // g.drawRect(rh[n].getX(), rh[n].getY(), rh[n].getWidth(), rh[n].getHeight());
            g.setColor(Color.BLUE);
        // set color
        g.drawString("Point Left : " + rx[n].getX() + ", " + rx[n].getY(), rx[n].getX(), rx[n].getY());
        g.drawString("Width : " + rx[n].getWidth(), rx[n].getX(), rx[n].getY() + 15);
        g.drawString("Height : " + rx[n].getHeight(), rx[n].getX(), rx[n].getY() + 30);
        g.drawString("Area : " + rx[n].getArea(), rx[n].getX(), rx[n].getY() + 45);
        }
    } // end method paint

    public static void main(String[] args) {
        RectangleJFrame test = new RectangleJFrame();
        test.setSize(640, 480);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}