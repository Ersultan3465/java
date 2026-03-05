public class Task3 {
    public static void main(String[] args) {
        double[] A = { 1.2, -0.5, 3.0, -2.0, 4.1, -1.5, 2.3, -3.2, 0.0, -4.0, 5.0, -0.8 };
        double productNegative = 1;
        boolean hasNegative = false;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                productNegative *= A[i];
                hasNegative = true;
            }
        }
        if (!hasNegative) productNegative = 0; // теріс элемент жоқ болса
        System.out.println("Теріс элементтердің көбейтіндісі: " + productNegative);
    }
}