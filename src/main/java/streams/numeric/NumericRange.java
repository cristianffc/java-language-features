package streams.numeric;

import java.util.stream.IntStream;

public class NumericRange {

    public static void main(String[] args) {
        IntStream evenNumbers = IntStream.rangeClosed(1, 200).filter(n -> n % 2 == 0);

        System.out.println(evenNumbers.count());

    }
}
