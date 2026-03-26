import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tamspma10 extends JPanel {
    Color c = Color.RED;
    public tamspma10() {
        JCheckBox red = new JCheckBox("Red");
        JCheckBox green = new JCheckBox("Green");
        JCheckBox blue = new JCheckBox("Blue");
        ItemListener listener = e -> {
            if (red.isSelected()) c = Color.RED;
            if (green.isSelected()) c = Color.GREEN;
            if (blue.isSelected()) c = Color.BLUE;
            repaint();
        };
        red.addItemListener(listener);
        green.addItemListener(listener);
        blue.addItemListener(listener);
        add(red);
        add(green);
        add(blue);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(c);
        g.fillRect(100, 80, 100, 100);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Checkbox");
        f.add(new tamspma10());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}