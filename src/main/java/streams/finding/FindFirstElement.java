package streams.finding;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
               .map(n -> n * n)
               .filter(n -> n % 3 == 0)
               .findFirst()
               .ifPresent(n -> System.out.println(n));
    }
}