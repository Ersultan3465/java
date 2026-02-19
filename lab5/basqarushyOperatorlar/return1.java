package basqarushyOperatorlar;

import java.util.Scanner;

public class return1 {
    public static int square(int number) {
        return number * number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int n = sc.nextInt();
        int result = square(n);
        System.out.println("Квадрат: " + result);
    }
}
