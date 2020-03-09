package lambda;

import java.util.function.Supplier;

public class SupplierInterface {

    public static void main(String[] args) {
        //Script 1
        Supplier<String> text = () -> "testing supplier";
        System.out.println(text.get());

        //Script 2
        returnText(() -> "Hello World!");
    }

    public static <T> void returnText(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

}
