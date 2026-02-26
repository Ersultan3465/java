import java.util.Scanner;

public class tag11 {
    public static double f(double x) {
        if (x>0 && x<=4) {
            return Math.sin(Math.PI*x)+Math.pow((Math.pow(x,2)+6),1.0/5);
        } else if (x>4) {
            return Math.log(x)+Math.sqrt(3*x+7);
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