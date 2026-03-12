package MyGraph;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphic extends JFrame {

    Graphic(String s){
        super(s);
        setLayout(null);
        setSize(220, 700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        String[] buttons = {
                "1: y=kx", "2: y=3x^2", "3: y=-6x^2+3x", "4: y=x^3+2x^2+x", "5: y=x^5",
                "6: y=sin(x)", "7: y=cos(x-1)+|x|", "8: y=1/x", "9: (x+3)/(x-2)", "10: 3+2/x+3/x^2",
                "11: 3-2/x-3/x^2", "12: 1/(3x^2+2x+1)", "13: 1/(x^2+2x+1)", "14: 1/(x^2+3x+1)",
                "15: x/(3x^2+2x+1)", "16: x/(x^2+2x+1)", "17: x/(x^2-2x+1)", "18: x/(x^2+3x+1)",
                "19: x/(x^2-3x+1)", "20: 3x/(x^2-5)"
        };

        int y = 20;
        for(int i=0; i<buttons.length; i++){
            Button b = new Button(buttons[i]);
            b.setBounds(20, y, 180, 25);
            add(b);
            int idx = i;
            b.addActionListener(e -> openGraph(idx+1));
            y += 30;
        }
    }

    void openGraph(int idx){
        switch(idx){
            case 1: new Linear("y = kx"); break;
            case 2: new Parabola1("y = 3x^2"); break;
            case 3: new Parabola2("y = -6x^2+3x"); break;
            case 4: new Cubic("y = x^3+2x^2+x"); break;
            case 5: new Quintic("y = x^5"); break;
            case 6: new Sinus("y = sin(x)"); break;
            case 7: new Cosinus("y = cos(x-1)+|x|"); break;
            case 8: new Rational("y = 1/x"); break;
            case 9: new Rational1("y = (x+3)/(x-2)"); break;
            case 10: new Rational2("y = 3+2/x+3/x^2"); break;
            case 11: new Rational3("y = 3-2/x-3/x^2"); break;
            case 12: new Rational4("y = 1/(3x^2+2x+1)"); break;
            case 13: new Rational5("y = 1/(x^2+2x+1)"); break;
            case 14: new Rational6("y = 1/(x^2+3x+1)"); break;
            case 15: new Rational7("y = x/(3x^2+2x+1)"); break;
            case 16: new Rational8("y = x/(x^2+2x+1)"); break;
            case 17: new Rational9("y = x/(x^2-2x+1)"); break;
            case 18: new Rational10("y = x/(x^2+3x+1)"); break;
            case 19: new Rational11("y = x/(x^2-3x+1)"); break;
            case 20: new Rational12("y = 3x/(x^2-5)"); break;
        }
    }

    public static void main(String[] args){
        new Graphic("График Построитель");
    }
}