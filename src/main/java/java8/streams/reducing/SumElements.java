package java8.streams.reducing;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        Optional<Integer> number = Optional.ofNullable(numbers.stream()
                                                              .reduce(0, Integer::sum));

        System.out.println(number);
    }
}
