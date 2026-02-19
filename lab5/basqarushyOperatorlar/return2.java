package basqarushyOperatorlar;

import java.util.Scanner;

public class return2 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int n = sc.nextInt();
        boolean result = isPrime(n);
        System.out.println("Жай сан ба? " + result);
    }
}
