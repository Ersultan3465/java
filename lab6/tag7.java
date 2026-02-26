import java.util.Scanner;

public class tag7 {
    public static double f(double x) {
        if (x>0 && x<1) {
            return Math.sqrt(3*Math.pow(x,3)+4)+Math.cos(x);
        } else if (x>=1) {
            return 5-Math.pow(Math.sin(x),2)*9;
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