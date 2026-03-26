import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tamspma7 extends JPanel implements KeyListener {
    char ch = ' ';

    public tamspma7() {
        addKeyListener(this);
        setFocusable(true);
    }

    public void keyTyped(KeyEvent e) {
        ch = e.getKeyChar();
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Symbol: " + ch, 100, 100);
    }

    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e){}

    public static void main(String[] args) {
        JFrame f = new JFrame("Key");
        f.add(new tamspma7());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}