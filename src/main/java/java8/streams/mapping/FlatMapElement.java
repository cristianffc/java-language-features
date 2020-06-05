package java8.streams.mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapElement {
    public static void main(String[] args) {
        String[] words = {"Hello", "world"};
        Stream<String> streamOfWords = Arrays.stream(words);

        List<String> wordsList = streamOfWords.map(word -> word.split(""))
                                              .flatMap(Arrays::stream)
                                              .distinct()
                                              .collect(Collectors.toList());

        System.out.println(wordsList);
    }
}