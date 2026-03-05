public class Task13 {
    public static void main(String[] args) {
        int[] C = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int value : C) sum += value;
        double average = (double)sum / C.length;
        System.out.println("C массивінің орташа мәні: " + average);
    }
}