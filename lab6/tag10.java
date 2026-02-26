import java.util.Scanner;

public class tag10 {
    public static double f(double x) {
        if (x>0) {
            return Math.pow(x,2)+Math.sin(x)+Math.sqrt(Math.pow(x,2)+1.2);
        } else if (x>2 && x<=6) {
            return Math.pow(Math.tan(x),2)+Math.cos(x)+3.5;
        } else {
            throw new IllegalArgumentException("x мәні анықталу облысына кірмейді");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();
        System.out.println("f(x) = " + f(x));
    }
}