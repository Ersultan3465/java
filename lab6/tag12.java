import java.util.Scanner;

public class tag12 {
    public static double f(double x) {
        if (x>0 && x<=2) {
            return Math.cbrt(1.7*x+Math.sin(x));
        } else if (x>2 && x<=6) {
            return Math.cos(Math.PI*x)+Math.tan(x);
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