public class Task16 {
    public static int maxX(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 10, -1};
        System.out.println("Массивтегі максималды элемент: " + maxX(arr));
    }
}