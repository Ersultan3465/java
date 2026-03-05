public class Task9 {
    public static void main(String[] args) {
        int[][] C = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = (int)(Math.random() * 11 - 5);
            }
        }
        int productPositive = 1;
        boolean hasPositive = false;
        for (int i = 0; i < 5; i++) {
            if (C[i][i] > 0) {
                productPositive *= C[i][i];
                hasPositive = true;
            }
        }
        if (!hasPositive) productPositive = 0;
        System.out.println("Негізгі диагональдағы оң элементтердің көбейтіндісі: " + productPositive);
    }
}