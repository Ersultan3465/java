public class Task14 {
    public static void main(String[] args) {
        int[] D = {1, 2, 3, 4, 5, 6, 7};
        int sumOdd = 0, sumEven = 0;

        for (int value : D) {
            if (value % 2 == 0) sumEven += value;
            else sumOdd += value;
        }

        System.out.println("Жұп қосындысы: " + sumEven);
        System.out.println("Тақ қосындысы: " + sumOdd);
    }
}