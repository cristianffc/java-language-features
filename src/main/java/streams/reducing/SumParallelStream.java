package streams.reducing;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional<Integer> sumNumbers = Optional.ofNullable(numbers.parallelStream()
                                                                  .reduce(0, Integer::sum));

        System.out.println(sumNumbers);
    }
}
