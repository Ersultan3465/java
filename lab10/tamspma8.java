import javax.swing.*;

public class tamspma8 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calc");
        JTextField t1 = new JTextField(5);
        JTextField t2 = new JTextField(5);
        JButton btn = new JButton("+");
        JLabel result = new JLabel("Result:");
        btn.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            result.setText("Result: " + (a + b));
        });
        f.setLayout(new java.awt.FlowLayout());
        f.add(t1);
        f.add(t2);
        f.add(btn);
        f.add(result);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}