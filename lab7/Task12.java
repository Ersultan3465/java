import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] B = {5, 2, 9, -1, 7, 0, 3};
        Arrays.sort(B);
        System.out.println("Өсу ретімен сұрыпталған массив:");
        for (int value : B) System.out.print(value + " ");
    }
}