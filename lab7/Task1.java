public class Task1 {
    public static void main(String[] args) {
        int[] A = { 5, -3, 7, -1, 0, -9, 12, -4, 6, -2, 3, -7, 8, -6, 2, -5, 4, -8, 1, -10 };
        int sumNegative = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                sumNegative += A[i];
            }
        }
        System.out.println("Теріс элементтердің қосындысы: " + sumNegative);
    }
}