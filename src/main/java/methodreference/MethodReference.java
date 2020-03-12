package methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.ToLongFunction;

public class MethodReference {

    public static void main(String[] args) {

        //Static method
        ToLongFunction<String> stringToLong =
                (String s) -> Integer.parseInt(s);
        ToLongFunction<String> stringToLongMethodReference = Integer::parseInt;
        System.out.println(stringToLongMethodReference.applyAsLong("100"));

        //Arbitrary type
        BiPredicate<List<String>, String> contains =
                (list, element) -> list.contains(element);
        BiPredicate<List<String>, String> containsMethodReference = List::contains;
        System.out.println(containsMethodReference.test(Arrays.asList("hello","world"), "hello"));

        //Instance method of an existing object or expression
        MethodReference methodReference = new MethodReference();
        Function<Integer, String> statement =
            (value) -> methodReference.printText(value);
        Function<Integer, String> statementMethodReference = methodReference::printText;
        System.out.println(statementMethodReference.apply(10));

    }

    String printText(Integer value) {
        return String.valueOf(value);
    }
}
