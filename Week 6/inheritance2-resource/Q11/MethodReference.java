import java.util.*;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        // :: is called Method Reference
        // (reference to a single method)
        numbers.forEach(System.out::println);
    }
}
