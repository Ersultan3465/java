import java.util.Scanner;

public class tag13 {
    public static double f(double x) {
        if (x>1 && x<=3) {
            return Math.sin(5*x)*(Math.sqrt(1+Math.pow(x,2))+Math.pow(Math.log(x),2));
        } else if (x>3 && x<=5) {
            return Math.pow(Math.E,x)*Math.cbrt(x+Math.pow(Math.E,2*x));
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