import java.util.*;

class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return name + " " + grade;
    }
}

public class Task14 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Alice", 20, 85),
                new Student("Bob", 22, 70),
                new Student("Charlie", 21, 90)
        );

        list.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);
    }
}