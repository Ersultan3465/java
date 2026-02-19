package Циклдер;

import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Оң сан енгізіңіз: ");
            number = sc.nextInt();
            if (number > 0) break;
        }

        System.out.println("Рахмет! Дұрыс сан енгізілді.");
    }
}