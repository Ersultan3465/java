import java.util.Scanner;

public class SumToN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("N санын енгізіңіз:");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 0;

        do{
            sum += i;
            i++;
        } while (i <= n);

        System.out.println("Қосынды: " +sum);
    }
}