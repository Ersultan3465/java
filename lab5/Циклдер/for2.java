package Циклдер;

import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N енгізіңіз: ");
        int N = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("Қосынды: " + sum);
    }
}
