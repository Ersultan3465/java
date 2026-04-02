import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();
        System.out.print("y мәнін енгізіңіз: ");
        double y = sc.nextDouble();
        double result = Math.pow(x, y);
        System.out.println("Нәтиже: " + result);
    }
}