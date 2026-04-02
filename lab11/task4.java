import java.util.InputMismatchException;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Сан енгізіңіз: ");
            int num = sc.nextInt();
            System.out.println("Сан: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Қате! Сан енгізіңіз!");
        }
    }
}