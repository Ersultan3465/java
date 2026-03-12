package MyGraph;
import java.awt.*;
import javax.swing.*;

public class Rational12 extends JFrame{
    Rational12(String s){
        super(s); setSize(600,300); setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void paint(Graphics g){
        g.setColor(Color.WHITE); g.fillRect(0,0,600,300);
        g.setColor(Color.BLACK); g.drawLine(300,0,300,300); g.drawLine(0,150,600,150);
        g.setColor(Color.RED);
        for(double x=-10; x<10; x+=0.01){
            double denom = x*x - 5;
            if(denom != 0){
                int y=(int)(3*x/denom*30);
                g.drawLine((int)(x*30)+300,150-y,(int)(x*30)+300,150-y);
            }
        }
    }
}