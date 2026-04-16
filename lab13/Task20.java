import java.util.*;

class Order {
    String name;
    int price;

    Order(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class Task20 {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Phone", 500),
                new Order("Laptop", 1000),
                new Order("Mouse", 50)
        );

        orders.stream()
                .filter(o -> o.price > 100)
                .sorted(Comparator.comparing(o -> o.price))
                .forEach(o -> System.out.println(o.name + " " + o.price));
    }
}