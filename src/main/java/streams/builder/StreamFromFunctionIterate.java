package streams.builder;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * This stream is useful when you need to produce a sequence of successive values.
 * It is called unbounded stream because it produces an infinite stream, so the limit(n) is the stop.
 * It takes an initial value and a lambda to apply on each new value produced
 */

public class StreamFromFunctionIterate {
    public static void main(String[] args) {
        //Unbounded stream
        Stream.iterate(0, n -> n + 3).limit(20).forEach(System.out::println);

        //Support for predicate to stop the iteration
        System.out.println("With predicate: ");
        IntStream.iterate(1, n -> n < 100, n -> n * 5).forEach(System.out::println);

        //Support for predicate to stop the iteration
        System.out.println("With takeWhile: ");
        IntStream.iterate(1, n -> n * 5).takeWhile(n -> n < 100).forEach(System.out::println);
    }
}