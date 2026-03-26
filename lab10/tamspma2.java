import javax.swing.*;
import java.awt.event.*;

public class tamspma2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Click");
        JLabel label = new JLabel();
        b.addActionListener(e -> label.setText("Hello Java"));
        f.setLayout(new java.awt.FlowLayout());
        f.add(b);
        f.add(label);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}