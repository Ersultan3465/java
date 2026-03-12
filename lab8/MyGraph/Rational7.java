package MyGraph;
import java.awt.*;
import javax.swing.*;

public class Rational7 extends JFrame{
    Rational7(String s){
        super(s); setSize(600,300); setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void paint(Graphics g){
        g.setColor(Color.WHITE); g.fillRect(0,0,600,300);
        g.setColor(Color.BLACK); g.drawLine(300,0,300,300); g.drawLine(0,150,600,150);
        g.setColor(Color.RED);
        for(double x=-10; x<10; x+=0.01){
            double denom = 3*x*x + 2*x + 1;
            if(denom != 0){
                int y=(int)(x/denom*100);
                g.drawLine((int)(x*30)+300,150-y,(int)(x*30)+300,150-y);
            }
        }
    }
}