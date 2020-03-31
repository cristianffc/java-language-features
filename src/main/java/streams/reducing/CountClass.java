package streams.reducing;

import java.util.Arrays;
import java.util.List;

public class CountClass {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        long countNumbers = numbers.stream().count();

        System.out.println("Count numbers" + countNumbers);
    }
}
