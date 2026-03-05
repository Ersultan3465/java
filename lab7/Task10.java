public class Task10 {
    public static void main(String[] args) {
        double[][] D = new double[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                D[i][j] = Math.round((Math.random() * 10 - 5) * 10) / 10.0;
            }
        }
        double sum = 0;
        for (int i = 0; i < 7; i++) {
            sum += D[i][i];
        }
        double average = sum / 7;
        System.out.println("Негізгі диагональ элементтерінің арифметикалық ортасы: " + average);
    }
}