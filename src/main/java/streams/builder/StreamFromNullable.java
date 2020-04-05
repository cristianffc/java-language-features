package streams.builder;

import java.util.stream.Stream;

public class StreamFromNullable {

    public static void main(String[] args) {

        Stream<String> homeValueStream = Stream.ofNullable(System.getProperty("home"));
        System.out.println(homeValueStream + "\n\n");

        Stream<String> values = Stream.of("config", "home", "user", "jdk", "TODO")
                .flatMap(key -> Stream.ofNullable(System.getProperty(key)));
        System.out.println(values);

    }
}
