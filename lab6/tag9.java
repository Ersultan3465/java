import java.util.Scanner;

public class tag9 {
    public static double f(double x) {
        if (x>=0 && x<1) {
            return x*Math.pow(Math.cos(x),2)+Math.sin(x);
        } else if (x>=1 && x<=2) {
            return Math.cbrt(Math.pow(x,2)+6*Math.sin(x));
        } else if (x>2) {
            return 1.7*Math.pow(x,3)+7;
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