package streams.reducing;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinClass {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional<Integer> minNumber = numbers.stream().reduce(Integer::min);
        Optional<Integer> maxNumber = numbers.stream().reduce(Integer::max);

        System.out.println("minNumber" + minNumber);
        System.out.println("maxNumber" + maxNumber);
    }
}
