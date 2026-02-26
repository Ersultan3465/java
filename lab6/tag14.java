import java.util.Scanner;

public class tag14 {
    public static double f(double x) {
        if (x>-1 && x<=1) {
            return Math.cbrt(Math.abs(x)+Math.pow(x,4));
        } else if (x>1 && x<+4) {
            return Math.pow(Math.tan(3*x),2)+Math.log(5*x);
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