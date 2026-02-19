package Массивтер;

public class massis1d2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 14};

        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                count++;
        }

        System.out.println("Жұп элементтер саны: " + count);
    }
}
