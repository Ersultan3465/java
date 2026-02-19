package if_switch;

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int number = sc.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Сан 3-ке және 5-ке бөлінеді");
        } else {
            System.out.println("Сан 3-ке және 5-ке бірдей бөлінбейді");
        }
    }
}
