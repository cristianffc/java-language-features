package java9.streams.builder;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Creates a stream from a possible nullable property
 */

public class StreamFromNullable {
    public static void main(String[] args) {
        Stream<String> home = Stream.ofNullable(System.getProperty("home"));
        System.out.println(home.collect(Collectors.toList()));

        Stream<String> values = Stream.of("config", "home", "user", "jdk", "TODO")
                .flatMap(key -> Stream.ofNullable(System.getProperty(key)));
        System.out.println(values.collect(Collectors.toList()));

    }
}