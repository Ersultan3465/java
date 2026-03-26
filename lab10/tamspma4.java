import javax.swing.*;
import java.awt.*;

public class tamspma4 extends JPanel {
    Color c = Color.RED;
    public tamspma4() {
        JButton btn = new JButton("Change");
        btn.addActionListener(e -> {
            if (c == Color.RED) c = Color.GREEN;
            else if (c == Color.GREEN) c = Color.BLUE;
            else c = Color.RED;
            repaint();
        });
        add(btn);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(c);
        g.fillOval(100, 50, 100, 100);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new tamspma4());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}