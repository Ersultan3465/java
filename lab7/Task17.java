public class Task17 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Java";
        String s4 = "Test";
        String s5 = "Test";

        String result;
        if (s4.equals(s5)) {
            result = s1 + " " + s2; // тең болса с1 + с2
        } else {
            result = s1 + " " + s3; // тең болмаса с1 + с3
        }
        System.out.println("Нәтиже: " + result);
    }
}