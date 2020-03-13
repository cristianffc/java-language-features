package methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class MethodReference {

    Integer value;
    String text;
    Long longValue;

    MethodReference() {}

    MethodReference(Integer value) {
        this.value = value;
    }

    MethodReference(Integer value, String text) {
        this.value = value;
        this.text = text;
    }

    MethodReference(Integer value, String text, Long longValue) {
        this.value = value;
        this.text = text;
        this.longValue = longValue;
    }

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

        //Constructor reference
        Supplier<MethodReference> singleSupplier = MethodReference::new;
        MethodReference methodRef = singleSupplier.get();

        Function<Integer, MethodReference> intSupplier = MethodReference::new;
        MethodReference methodRefWithInt = intSupplier.apply(10);

        Function<Integer, MethodReference> IntSupplierArgs = (value) -> new MethodReference(value);
        MethodReference methodRefWithIntArgs = intSupplier.apply(10);

        BiFunction<Integer, String, MethodReference> supplierArgs = MethodReference::new;
        MethodReference methodRefArgs = supplierArgs.apply(10, "hello");

        TriFunction<Integer, String, Long, MethodReference> triFunction = MethodReference::new;

    }

    String printText(Integer value) {
        return String.valueOf(value);
    }
}
