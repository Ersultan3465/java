import java.util.Scanner;

public class tag8 {
    public static double f(double x) {
        if (x>-5 && x<0) {
            return Math.sqrt(Math.pow(x,2)+Math.abs(x));
        } else if (x>=0 && x<2) {
            return 5*Math.pow(x,3)+Math.cos(x);
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