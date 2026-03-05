public class Task11 {
    public static void main(String[] args) {
        int[] A = {3, 7, -2, 10, -5, 6, 0, 8};
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > A[maxIndex]) maxIndex = i;
            if (A[i] < A[minIndex]) minIndex = i;
        }
        int temp = A[maxIndex];
        A[maxIndex] = A[minIndex];
        A[minIndex] = temp;
        System.out.println("Массив элементтерін алмастырғаннан кейін:");
        for (int value : A) System.out.print(value + " ");
    }
}