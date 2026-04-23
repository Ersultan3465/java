public class RandomUntilZero {
    public static void main(String[] args) {
        int num;

        do {
            num = (int)(Math.random() * 10);
            System.out.println(num);
        } while (num != 0);
    }
}