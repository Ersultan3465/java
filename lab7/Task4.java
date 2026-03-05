public class Task4 {
    public static void main(String[] args) {
        double[] C = new double[25];
        for (int i = 0; i < C.length; i++) {
            C[i] = Math.round((Math.random() * 20 - 10) * 10) / 10.0; // -10.0 ... 10.0
        }

        double productPositive = 1;
        boolean hasPositive = false;
        for (int i = 0; i < C.length; i++) {
            if (C[i] > 0) {
                productPositive *= C[i];
                hasPositive = true;
            }
        }
        if (!hasPositive) productPositive = 0;
        System.out.println("Оң элементтердің көбейтіндісі: " + productPositive);
    }
}