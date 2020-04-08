package lambda;

import java.util.function.Supplier;

/**
    Target type: Supplier<T>
    Function descriptor: () -> T
**/

public class SupplierInterface {
    public static void main(String[] args) {
        //Example 1
        Supplier<String> text = () -> "testing supplier";
        System.out.println(text.get());

        //Example 2
        returnText(() -> "Hello World!");
    }

    public static <T> void returnText(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }
}
