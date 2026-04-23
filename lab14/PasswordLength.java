import java.util.Scanner;

public class PasswordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.println("Құпиясөз енгізіңіз (кемінде 6 символ):");
            password = scanner.nextLine();
        } while (password.length() < 6);

        System.out.println("Қабылданды!");
    }
}