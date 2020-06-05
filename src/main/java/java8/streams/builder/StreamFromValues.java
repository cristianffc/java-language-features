package java8.streams.builder;

import java.util.stream.Stream;

/**
 * Creates a stream from a property
 * Creates an empty stream
 */

public class StreamFromValues {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Modern", "Java", "JDK", "Hello");
        stream.map(String::toLowerCase).forEach(System.out::println);

        Stream<String> emptyStream = Stream.empty();

    }
}