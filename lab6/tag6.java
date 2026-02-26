import java.util.Scanner;

public class tag6 {
    public static double f(double x) {
        if (x<1.5) {
            return x*Math.tan(x)-Math.sin(x);
        } else if (x>=1.5 && x<2.5) {
            return Math.pow(x,3)+Math.sin(x);
        } else if (x>=2.5) {
            return 3*Math.pow(x,3)+5;
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