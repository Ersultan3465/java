public class Task2 {
    public static void main(String[] args) {
        int[] B = { 1, -2, 3, 4, -5, 6, -1, 7, -3, 8, -4, 9, -6, 2, -7 };
        int sumPositive = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] > 0) {
                sumPositive += B[i];
            }
        }
        System.out.println("Оң элементтердің қосындысы: " + sumPositive);
    }
}