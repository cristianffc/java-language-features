package lambda;

import java.util.function.BiConsumer;

/*
    Target type: BiConsumer<T, U>
    Function descriptor: (T, U) -> void
*/

public class BiConsumerInterface {
    public static void main(String[] args) {
        //Script 1
        BiConsumer<Integer, String> printValueText = (Integer value, String target)
                -> {System.out.print(value + target);};
        printValueText.accept(3,"hello");
    }
}
