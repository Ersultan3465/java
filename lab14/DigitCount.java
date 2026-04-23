import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сан енгізіңіз:");
        int number = scanner.nextInt();

        int count = 0;

        do {
            number /= 10;
            count++;
        } while (number != 0);

        System.out.println("Цифр саны: " + count);
    }
}