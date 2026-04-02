import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Өрнек енгізіңіз (мысалы: 2 + 3): ");
        double a = sc.nextDouble();
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();
        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/':
                if (b != 0) System.out.println(a / b);
                else System.out.println("0-ге бөлуге болмайды");
                break;
            default: System.out.println("Қате оператор");
        }
    }
}