package MyGraph;

import java.awt.*;
import javax.swing.*;

public class Sinus extends JFrame{

    Sinus(String s){
        super(s);
        setSize(600,300);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocation(200,100);
    }

    public void paint(Graphics g){

        int y;

        g.setColor(Color.WHITE);
        g.fillRect(0,0,600,300);

        g.setColor(Color.BLACK);
        g.drawLine(300,0,300,300);
        g.drawLine(0,150,600,150);

        g.setColor(Color.RED);

        for(double x=-360;x<360;x++){
            y=(int)(80*Math.sin(Math.PI*x/180));
            g.drawLine((int)x+300,150-y,(int)x+300,150-y);
        }
    }
}