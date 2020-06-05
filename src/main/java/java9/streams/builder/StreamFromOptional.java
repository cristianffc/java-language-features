package java9.streams.builder;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamFromOptional {
    public static void main(String[] args) {
        Stream<Integer> number = Optional.of(1).stream();

        System.out.println(number);
    }
}
