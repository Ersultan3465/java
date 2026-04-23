import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сан енгізіңіз:");
        int number = scanner.nextInt();

        int original = number;
        int reversed = 0;

        do {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        } while (number > 0);

        if (original == reversed) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Палиндром емес");
        }
    }
}