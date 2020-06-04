package streams.builder;

import java.util.stream.Stream;

/**
 * This stream is useful when you need to produce a sequence of successive values.
 * It is called unbounded stream because it produces an infinite stream, so the limit(n) is the stop.
 * It takes a lambda of type Supplier<T> to provide new values
 */

public class StreamFromFunctionGenerate {
    public static void main(String[] args) {
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
    }
}