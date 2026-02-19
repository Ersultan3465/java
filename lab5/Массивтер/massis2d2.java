package Массивтер;

public class massis2d2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 8, 1},
                {9, 2, 5},
                {4, 7, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
            System.out.println((i+1) + "-жолдағы ең үлкен элемент: " + max);
        }
    }
}