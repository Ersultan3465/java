import javax.swing.*;
import java.awt.*;

public class tamspma1 extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 100, 60);
        g.drawString("Rectangle", 60, 45);
        g.drawOval(200, 50, 80, 80);
        g.drawString("Circle", 210, 45);
        g.drawLine(50, 150, 200, 150);
        g.drawString("Line", 100, 140);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Shapes");
        f.add(new tamspma1());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}