import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 – қосу");
        System.out.println("2 – азайту");
        System.out.println("3 – көбейту");
        System.out.println("4 – бөлу");
        int choice = sc.nextInt();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        switch (choice) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4:
                if (b != 0) System.out.println(a / b);
                else System.out.println("0-ге бөлуге болмайды");
                break;
            default: System.out.println("Қате таңдау");
        }
    }
}