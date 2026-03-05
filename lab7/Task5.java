public class Task5 {
    public static void main(String[] args) {
        double[] D = {1.5, 2.3, -1.2, 4.0, -0.5, 3.1, -2.2, 5.0, 6.5, -3.3, 2.2, -1.1, 4.4, -2.0, 0.5, 3.3, -0.8};
        double sum = 0;
        for (double value : D) {
            sum += value;
        }
        double average = sum / D.length;
        System.out.println("D массивінің арифметикалық ортасы: " + average);
    }
}