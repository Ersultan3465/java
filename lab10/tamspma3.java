import javax.swing.*;

public class tamspma3 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField tf = new JTextField(10);
        JButton b = new JButton("OK");
        JLabel label = new JLabel();
        b.addActionListener(e ->
                label.setText("Сәлем, " + tf.getText())
        );
        f.setLayout(new java.awt.FlowLayout());
        f.add(tf);
        f.add(b);
        f.add(label);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}