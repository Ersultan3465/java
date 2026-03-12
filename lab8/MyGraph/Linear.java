package MyGraph;
import java.awt.*;
import javax.swing.*;

public class Linear extends JFrame{
    Linear(String s){
        super(s);
        setSize(600,300); setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.setColor(Color.WHITE); g.fillRect(0,0,600,300);
        g.setColor(Color.BLACK); g.drawLine(300,0,300,300); g.drawLine(0,150,600,150);
        g.setColor(Color.RED);
        for(double k=0.1; k<=1; k+=0.1){
            for(double x=-300; x<300; x++){
                int y=(int)(k*x);
                g.drawLine((int)x+300,150-y,(int)x+300,150-y);
            }
        }
    }
}