import java.util.ArrayList;

public class task6 {
    public static void main(String[] args) {
        ArrayList<String> history = new ArrayList<>();
        history.add("2 + 3 = 5");
        history.add("5 * 2 = 10");
        for (String h : history) {
            System.out.println(h);
        }
    }
}