import java.util.Scanner;

public class tag152 {
    public static double f(double x) {
        if (x>1 && x<=3) {
            return Math.pow((Math.pow(x,3)+Math.sin(Math.PI*x)),1.0/4)+Math.log(x);
        } else if (x>3 && x<=7) {
            return Math.cbrt(1.5*Math.pow(x,2)-Math.pow(Math.E,2))+Math.pow(Math.log(x),3);
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