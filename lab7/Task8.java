public class Task8 {
    public static void main(String[] args) {
        double[][] A = new double[12][6];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = Math.round((Math.random() * 10 - 5) * 10) / 10.0;
            }
        }
        double[] productNegative = new double[6];
        for (int j = 0; j < 6; j++) {
            double prod = 1;
            boolean hasNegative = false;
            for (int i = 0; i < 12; i++) {
                if (A[i][j] < 0) {
                    prod *= A[i][j];
                    hasNegative = true;
                }
            }
            productNegative[j] = hasNegative ? prod : 0;
        }
        System.out.println("Баған бойынша теріс элементтердің көбейтіндісі:");
        for (double value : productNegative) {
            System.out.print(value + " ");
        }
    }
}