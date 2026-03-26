import javax.swing.*;
import java.awt.*;

public class tamspma5 extends JPanel {
    int x = 50, y = 50;
    public tamspma5() {
        JTextField tx = new JTextField(5);
        JTextField ty = new JTextField(5);
        JButton btn = new JButton("Draw");
        btn.addActionListener(e -> {
            x = Integer.parseInt(tx.getText());
            y = Integer.parseInt(ty.getText());
            repaint();
        });
        add(tx);
        add(ty);
        add(btn);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, y, 50, 50);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Coords");
        f.add(new tamspma5());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}