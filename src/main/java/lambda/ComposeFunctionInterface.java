package lambda;

import java.util.function.Function;

public class ComposeFunctionInterface {
    public static void main(String[] args) {

        Function<String, String> addHello = text -> {return "Hello " + text;};
        Function<String, String> addWorld = text -> {return "World " + text;};
        Function<String, String> resultAndThen = addHello.andThen(addWorld);
        Function<String, String> resultsCompose = addHello.compose(addWorld);

        System.out.println(resultsCompose.apply("2021!"));
        System.out.println(resultAndThen.apply("2021!"));
    }
}