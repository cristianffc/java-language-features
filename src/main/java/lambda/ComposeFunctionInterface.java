package lambda;

import java.util.function.Function;

public class ComposeFunctionInterface {
    public static void main(String[] args) {
        Function<String, String> addHeader = text -> {return "Header: " + text;};
        Function<String, String> addFooter = text -> {return "Footer: " + text;};
        Function<String, String> resultAndThen = addHeader.andThen(addFooter);
        Function<String, String> resultsCompose = addHeader.compose(addFooter);

        System.out.println(resultAndThen.apply("Hello"));
        System.out.println(resultsCompose.apply("Hello"));
    }
}
